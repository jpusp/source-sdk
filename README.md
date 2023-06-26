# template-library-android
This is a template library to be used in android projects as a model for others libraries

## Code Style
**Lint**

- [Detekt](https://detekt.github.io/detekt/)
- [Ktlint](https://ktlint.github.io)

**Report**

- [JaCoCo](https://github.com/jacoco/jacoco)

## Application Checklist
 - [x] Artifactory library publication
 - [x] [Unit tests](#how-to-test)
 - [x] [CI/CD](#how-to-deploy)

## How to Use

To add it in your project, follow the steps below:

1. Open your root `build.gradle`and add the following artifactory repository in the `allprojects` section:
    ~~~groovy
    allprojects {
        repositories {
            ...
            maven { url 'http://artifactory.private.cd.vivareal.io/artifactory/releases' }
        }
    }
    ~~~

2. Add the dependency to your app `build.gradle`:

    ~~~groovy
    dependencies {
        implementation '<com.olxbr.YOURLIBRARY>:<version>'
    }
    ~~~

    Visit [artifactory](http://artifactory.private.cd.vivareal.io/artifactory/webapp/#/artifacts/browse/tree/General/releases/com/olxbr/YOUR_LIBRARY) to find the latest version of this library

3. PUT YOUR LIBRARY INSTRUCTIONS HERE

## How to Run

You can run the sample project using the Android Studio or using the following command on terminal:

~~~console
./gradlew :sample:installDebug
~~~

## How to Test

Every time you perform a pull request, the pull request workflow on github actions will run unit tests automatically.


If you want to run tests locally, just use the following command on terminal:

~~~console
./gradlew :lib:testDebugUnitTest
~~~

## How to Deploy

When you finished to implement a new feature and committed changes, **just open a PR**:

For example, if you implemented a bugfix and the PR title contains the `fix:` prefix, then semantic_release fastlane plugin will bump version with patch. So, if project version is 1.0.0, the plugin will updated target versions to 1.0.1 automatically.

After reviewing and merging, the CI system will publish the new version of the aar library in the [artifactory](http://artifactory.private.cd.vivareal.io/artifactory/webapp/). 🚀


