pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "HcsGithub"
include(":app")
include(":feature:home:screen")
include(":feature:detail:screen")
include(":feature:search:screen")
include(":feature:detail:api")
include(":feature:detail:apiinfra")
include(":feature:detail:cache")
include(":feature:detail:cacheinfra")
include(":feature:detail:domain")
include(":feature:home:api")
include(":feature:home:domain")
include(":feature:home:apiinfra")
include(":feature:home:cacheinfra")
include(":feature:home:cache")
include(":feature:search:api")
include(":feature:search:apiinfra")
include(":feature:search:cache")
include(":feature:search:cacheinfra")
include(":feature:search:domain")
