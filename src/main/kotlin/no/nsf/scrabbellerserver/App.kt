package no.nsf.scrabbellerserver

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    embeddedServer(Netty,23567) {
        routing {
            get("") {
                call.respond("I'm alive!")
            }
            get("hello") {
                call.respond(HttpStatusCode.Accepted, "Hello")
            }
        }
    }.start(wait = true)
}
