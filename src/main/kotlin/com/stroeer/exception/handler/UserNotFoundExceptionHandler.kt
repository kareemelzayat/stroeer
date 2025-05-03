package com.stroeer.exception.handler

import com.stroeer.exception.UserNotFoundException
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.server.exceptions.ExceptionHandler
import jakarta.inject.Singleton

@Singleton
@Requires(classes = [UserNotFoundException::class, ExceptionHandler::class])
class UserNotFoundExceptionHandler : ExceptionHandler<UserNotFoundException, HttpResponse<*>> {
    override fun handle(
        request: HttpRequest<*>,
        exception: UserNotFoundException
    ): HttpResponse<*> = HttpResponse.notFound(exception.message)
}