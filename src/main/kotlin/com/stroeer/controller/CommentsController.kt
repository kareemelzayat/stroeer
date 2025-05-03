package com.stroeer.controller

import com.stroeer.model.CommentsResponse
import com.stroeer.service.CommentsService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/comments")
class CommentsController(
    private val commentsService: CommentsService
) {

    @Get("/{userId}")
    suspend fun getComments(@PathVariable userId: Long): HttpResponse<CommentsResponse> =
        commentsService.getUserComments(userId).let { HttpResponse.ok(it) }
}
