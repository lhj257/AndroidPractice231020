pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application_231020_test1"
include(":app")
include(":myapplication_test2")
include(":myapplication_test3")
include(":myapplication_test4")
include(":myapp_test6")
