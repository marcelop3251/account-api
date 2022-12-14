package com.projeto.tech.share.accountapi.application.handler

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class SignUpHandler {

    suspend fun signUp(request: ServerRequest): ServerResponse {
        return ServerResponse.ok().bodyValueAndAwait("ok")
    }
}