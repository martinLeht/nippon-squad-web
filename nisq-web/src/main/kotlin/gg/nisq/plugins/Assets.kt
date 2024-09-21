package gg.nisq.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import io.ktor.server.webjars.*

fun Application.configureAssets() {
    install(Webjars) {
        path = "assets"
    }

    routing {
        staticResources("/static", "static")
    }
}