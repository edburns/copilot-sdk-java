# Custom Site CSS

This project applies custom CSS themes to both the **Maven-generated documentation site** and the **JaCoCo coverage reports** so they share a consistent visual identity: light backgrounds, GitHub-inspired colors, purple gradient accents, and rounded card-style containers.

## Architecture Overview

```
src/site/
├── resources/
│   ├── css/
│   │   └── site.css                  ← Maven site theme (loaded automatically by Fluido)
│   └── images/
│       └── github-copilot.jpg        ← Copilot logo for "Powered By" sidebar
├── jacoco-resources/
│   └── report.css                    ← JaCoCo report theme (overlaid after generation)
└── site.xml                          ← Fluido skin configuration

.github/
├── templates/
│   ├── index.html                    ← Version picker page template
│   └── styles.css                    ← Version picker CSS
└── workflows/
    └── deploy-site.yml               ← Deploys site + overlays JaCoCo CSS
```

## Maven Site Theme (`src/site/resources/css/site.css`)

### How It Works

The Maven Fluido Skin 2.1.0 (configured in `src/site/site.xml`) automatically loads `css/site.css` from the site resources directory. No additional configuration is needed — placing the file at `src/site/resources/css/site.css` is sufficient.

### Design Choices

| Element | Style |
|---------|-------|
| **Navbar** | Dark (`#24292f`) with no gradient or border, subtle box shadow |
| **Sidebar** | White card with rounded corners (`border-radius: 10px`), 1px border |
| **Active nav item** | Purple gradient (`#667eea → #764ba2`) |
| **Links** | GitHub-blue (`#0969da`), hover darkens to `#0550ae` |
| **Code blocks** | Light gray background (`#eef1f6`) to distinguish from the white page |
| **Inline code** | Tinted purple background (`rgba(102, 126, 234, 0.1)`) |
| **Tables** | Rounded borders, light header, subtle row hover |
| **Sections** | White card with border and padding (nested sections are transparent) |
| **Alerts** | Rounded with 4px left accent border, color-coded (info/warning/danger/success) |
| **Typography** | System font stack (`-apple-system, BlinkMacSystemFont, 'Segoe UI', ...`) |

### GitHub Ribbon Override

The Fluido skin renders a "Fork me on GitHub" ribbon using a `::after` pseudo-element with `content: attr(data-ribbon)`. We override this to say "View on GitHub" with a purple gradient background:

```css
.github-fork-ribbon:before {
  background-color: #667eea !important;
  background-image: linear-gradient(135deg, #667eea, #764ba2) !important;
}

.github-fork-ribbon:after {
  content: 'View on GitHub' !important;
}
```

> **Note:** Both `background-color` and `background-image` with `!important` are required because Fluido injects an inline `<style>` tag that sets the ribbon background.

### Powered By — GitHub Copilot Logo

The `poweredBy` section in Fluido's sidebar doesn't support custom entries via `site.xml` (the `<poweredBy>` element isn't supported in Maven Site Descriptor 2.0.0). Instead, the logo is injected via a CSS `::after` pseudo-element on the `#poweredBy` div:

```css
#poweredBy::after {
  content: '';
  display: block;
  width: 240px;
  height: 120px;
  background-image: url('../images/github-copilot.jpg');
  background-size: contain;
  background-repeat: no-repeat;
  background-position: center;
}
```

The logo image is stored at `src/site/resources/images/github-copilot.jpg`.

## JaCoCo Report Theme (`src/site/jacoco-resources/report.css`)

### The Challenge

JaCoCo generates standalone HTML reports with their own `report.css`, completely independent of the Maven site theme. The generated reports reference `jacoco-resources/report.css` via a `<link>` tag. There is no built-in mechanism to customize this CSS.

### How the Overlay Works

The custom CSS is applied by **replacing** JaCoCo's default `report.css` after report generation. This happens through two mechanisms:

#### 1. Maven build phase (local builds)

In `pom.xml`, a `maven-resources-plugin` execution runs during the `site` phase — **after** JaCoCo has generated its report and default CSS:

```xml
<execution>
    <id>overlay-jacoco-css</id>
    <phase>site</phase>
    <goals>
        <goal>copy-resources</goal>
    </goals>
    <configuration>
        <outputDirectory>${project.reporting.outputDirectory}/jacoco/jacoco-resources</outputDirectory>
        <resources>
            <resource>
                <directory>src/site/jacoco-resources</directory>
                <filtering>false</filtering>
            </resource>
        </resources>
        <overwrite>true</overwrite>
    </configuration>
</execution>
```

#### 2. Deploy workflow (CI builds)

The deploy workflow (`deploy-site.yml`) has a catch-all step that overlays the CSS across **all version directories** in the site. This covers cases where the Maven overlay ran in a different directory structure:

```yaml
- name: Overlay custom JaCoCo CSS
  run: |
    cd site
    for dir in */jacoco/jacoco-resources; do
      if [ -d "$dir" ]; then
        cp ../src/site/jacoco-resources/report.css "$dir/report.css"
        echo "Overlaid JaCoCo CSS in $dir"
      fi
    done
```

### Important: JaCoCo Report Path

The JaCoCo **reporting** plugin (used during `mvn site`) outputs to `jacoco/` by default. The **build** plugin execution (`build-coverage-report-from-tests`, phase `verify`) outputs to `jacoco-coverage/`. Only the reporting plugin path matters for the deployed site, since the deploy workflow runs `mvn site`, not `mvn verify`.

### Design Choices

The JaCoCo theme mirrors the main site design:

| Element | Style |
|---------|-------|
| **Background** | Light gray (`#f6f8fa`), same as main site |
| **Coverage table** | White card with rounded corners, sticky header |
| **Row hover** | Subtle purple tint (`rgba(102, 126, 234, 0.04)`) |
| **Source code** | White background with rounded border |
| **Coverage highlights** | Green (`#dafbe1`) for covered, red (`#ffeef0`) for missed, yellow (`#fff8c5`) for partial |
| **Branch hover** | Saturated versions of coverage colors |
| **Typography** | Same system font stack and monospace fonts as main site |

### When JaCoCo Reports Are Available

JaCoCo only generates a report when test execution data (`.exec` file) exists:

- **Snapshot builds in CI**: The deploy workflow downloads test results from the "Build & Test" workflow and restores the `.exec` file before running `mvn site`. Reports are generated.
- **Release tag builds**: Tests don't run at tag checkout, so no `.exec` file exists and JaCoCo skips report generation. No report to style.
- **Local builds**: Run `mvn clean verify site` to ensure tests run first and the `.exec` file is available for report generation.

## Version Picker Page (`.github/templates/`)

The `index.html` and `styles.css` in `.github/templates/` power the top-level version picker at the documentation root. These are **not** part of the Maven site — they are copied directly by the deploy workflow.

The styles use the same design language (purple gradients, rounded cards, GitHub-blue links) but are a standalone CSS file with no dependency on Bootstrap or Fluido.

## Modifying the Theme

### Maven site CSS

Edit `src/site/resources/css/site.css`. Changes take effect on the next `mvn site` build. Preview locally:

```bash
mvn clean site -DskipTests -Dcheckstyle.skip=true
open target/site/index.html
```

### JaCoCo report CSS

Edit `src/site/jacoco-resources/report.css`. Preview locally (requires test data):

```bash
mvn clean verify site
open target/site/jacoco/index.html
```

### Version picker page

Edit `.github/templates/index.html` and `.github/templates/styles.css`. These are deployed as-is by the workflow — no build step needed. Preview by opening `index.html` directly in a browser.
