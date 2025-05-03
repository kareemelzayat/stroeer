package com.stroeer.controller

import com.stroeer.exception.UserNotFoundException
import com.stroeer.model.CommentsResponse
import com.stroeer.service.CommentsService
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import io.mockk.coEvery
import io.mockk.mockk
import utils.TestUtils

@MicronautTest
class CommentsControllerTest : StringSpec({

    val commentsService = mockk<CommentsService>()
    val commentsController = CommentsController(commentsService)

    "test GET comments endpoint success" {
        val userId = 1L
        val userResponse = TestUtils.createUserResponse()
        val postResponse = TestUtils.createPostResponse()
        val expectedResponse = CommentsResponse(userResponse, listOf(postResponse))

        coEvery { commentsService.getUserComments(userId) } returns expectedResponse

        val response = commentsController.getComments(userId)

        response.body.get() shouldBe expectedResponse
    }

    "test GET comments endpoint user not found" {
        val userId = 2L

        coEvery { commentsService.getUserComments(userId) } throws UserNotFoundException()

        try {
            commentsService.getUserComments(userId)
        } catch (e: Exception) {
            e.message shouldBe "User not found"
        }
    }

    "test GET comments endpoint posts not found" {
        val userId = 1L
        val userResponse = TestUtils.createUserResponse()
        val expectedResponse = CommentsResponse(userResponse, emptyList())

        coEvery { commentsService.getUserComments(userId) } returns expectedResponse

        val response = commentsController.getComments(userId)

        response.body.get() shouldBe expectedResponse
    }
})
