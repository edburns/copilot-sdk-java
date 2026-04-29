## Contributing

[fork]: https://github.com/github/copilot-sdk-java/fork
[pr]: https://github.com/github/copilot-sdk-java/compare

Hi there! We're thrilled that you'd like to contribute to this project. Your help is essential for keeping it great.

This repository contains the **GitHub Copilot SDK for Java**, the official Java variant of the official [GitHub Copilot SDK](https://github.com/github/copilot-sdk). For issues or features related to the reference implementation SDK, please contribute there instead.

Contributions to this project are [released](https://help.github.com/articles/github-terms-of-service/#6-contributions-under-repository-license) to the public under the [project's open source license](LICENSE).

Please note that this project is released with a [Contributor Code of Conduct](CODE_OF_CONDUCT.md). By participating in this project you agree to abide by its terms.

## What kinds of contributions we're looking for

We'd love your help with:

 * Fixing any bugs in the existing feature set
 * Making the SDK more idiomatic and nice to use for Java developers
 * Improving documentation

If you have ideas for entirely new features, please post an issue or start a discussion. We're very open to new features but need to make sure they align with the direction of the [Copilot SDK](https://github.com/github/copilot-sdk) reference implementation and can be maintained in sync. Note that this repo periodically merges reference implementation changes — see the [README](README.md#agentic-reference-implementation-merge-and-sync) for details on how that works.

## Prerequisites for running and testing code

1. Install [Java 17+](https://openjdk.org/) (JDK)
1. Install [Maven 3.9+](https://maven.apache.org/download.cgi) (or use the included `mvnw` wrapper)
1. Install [Node.js](https://nodejs.org/) (v18+) — required for the E2E test harness

## Submitting a pull request

1. [Fork][fork] and clone the repository
1. Enable git hooks: `git config core.hooksPath .githooks`
1. Make sure the tests pass on your machine: `mvn clean verify`
1. Make sure formatting passes: `mvn spotless:check`
1. Create a new branch: `git checkout -b my-branch-name`
1. Make your change, add tests, and make sure the tests and linter still pass
1. Push to your fork and [submit a pull request][pr]
1. Pat yourself on the back and wait for your pull request to be reviewed and merged.

### Running locally, including tests and linters

```bash
# Obtain the pinned version of Copilot CLI to the local workarea.
# This clones the reference implementation at the commit pinned in
# .lastmerge, but does NOT run `npm ci` inside its nodejs/ subdir.
mvn generate-test-resources

# Install the pinned Copilot CLI into target/copilot-sdk/nodejs/node_modules
# so the SDK tests use the version declared in
# target/copilot-sdk/nodejs/package.json (the SDK-test pin), NOT the version
# in target/copilot-sdk/test/harness/package.json (the replay-harness pin,
# which is incidental and may be older).

## POSIX

(cd target/copilot-sdk/nodejs && npm ci --ignore-scripts)

## PowerShell

Push-Location target\copilot-sdk\nodejs; if ($?) { npm ci --ignore-scripts }; Pop-Location

# Make it so the pinned Copilot CLI is used for the tests. The patterns
# below are scoped to the `nodejs/node_modules/` subtree so they cannot
# accidentally pick up the older harness copy under
# target/copilot-sdk/test/harness/node_modules/.

## POSIX

export COPILOT_CLI_PATH="$(find "$PWD/target" -type f -path '*/nodejs/node_modules/@github/copilot/index.js' | head -n 1)"

## PowerShell

$env:COPILOT_CLI_PATH = (Get-ChildItem -Path "$PWD\target" -Recurse -Filter 'index.js' -File | Where-Object { $_.FullName -match '[\\/]nodejs[\\/]node_modules[\\/]@github[\\/]copilot[\\/]index\.js$' } | Select-Object -First 1 -ExpandProperty FullName)

# Build and run all tests
mvn clean verify

# Run a single test class
mvn test -Dtest=CopilotClientTest

# Format code (required before commit)
mvn spotless:apply

# Check formatting only
mvn spotless:check
```

Assuming you are in the same shell you used to run the above commands, to run this exact Copilot CLI locally you can do the following.

### POSIX

```bash
node ${COPILOT_CLI_PATH}
```

### PowerShell

```PowerShell
node $env:COPILOT_CLI_PATH
```

Here are a few things you can do that will increase the likelihood of your pull request being accepted:

- Write tests.
- Keep your change as focused as possible. If there are multiple changes you would like to make that are not dependent upon each other, consider submitting them as separate pull requests.
- Write a [good commit message](http://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html).

## Resources

- [How to Contribute to Open Source](https://opensource.guide/how-to-contribute/)
- [Using Pull Requests](https://help.github.com/articles/about-pull-requests/)
- [GitHub Help](https://help.github.com)

