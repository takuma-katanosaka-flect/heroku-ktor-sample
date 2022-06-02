package jp.co.flect

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import jp.co.flect.plugins.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        configureRouting()
        configureSerialization()
        configureHTTP()
        configureSecurity()
    }.start(wait = true)
}
