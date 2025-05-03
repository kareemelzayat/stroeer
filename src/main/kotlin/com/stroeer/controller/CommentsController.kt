package com.stroeer.controller

import com.stroeer.service.CommentsService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

@Controller("/comments")
@Secured(SecurityRule.IS_AUTHENTICATED)
class CommentsController(
    private val commentsService: CommentsService,
) {

    @Get("/")
    suspend fun getComments() = HttpResponse.ok<String>()
}
