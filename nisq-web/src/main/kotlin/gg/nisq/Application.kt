package gg.nisq

import configureCachingHeaders
import gg.nisq.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureTemplating()
    configureRouting()
    configureAssets()
    configureSSE()
    configureStyles()
    configureCachingHeaders()
}
