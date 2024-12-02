rootProject.name = "LapzupiChat"


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    }
    versionCatalogs {
        create("libs") {
            library("paper-api", "io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
            library("placeholder-api", "me.clip:placeholderapi:2.11.6")

            version("adventure", "4.17.0")
            library("adventure-api", "net.kyori","adventure-api").versionRef("adventure")
            library("adventure-minimessage", "net.kyori", "adventure-text-minimessage").versionRef("adventure")
            library("adventure-bukkit", "net.kyori:adventure-platform-bukkit:4.3.4")
            bundle("adventure", listOf("adventure-api", "adventure-minimessage", "adventure-bukkit"))
        }
    }
}