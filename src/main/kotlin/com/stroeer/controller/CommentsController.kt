package com.stroeer.controller

import com.stroeer.model.CommentsResponse
import com.stroeer.service.CommentsService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/comments")
class CommentsController(
    private val commentsService: CommentsService
) {

    /**
     * Retrieves comments associated with a specific user.
     *
     * @param userId the unique identifier of the user whose comments are to be retrieved
     * @return an HTTP response containing the user's details and a list of their comments
     */
    @Get("/{userId}")
    suspend fun getComments(@PathVariable userId: Long): HttpResponse<CommentsResponse> {
        log.info("GET call for user: $userId")
        return commentsService.getUserComments(userId).let { HttpResponse.ok(it) }
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(CommentsController::class.java)
    }
}
