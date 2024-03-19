plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "gigglecoin"
include("websocket")
include("infrastructure")
include("infrastructure:kafka")
include("consumer")
include("infrastructure:jpa")
include("domain")
include("infrastructure:redis")
findProject(":infrastructure:redis")?.name = "redis"
