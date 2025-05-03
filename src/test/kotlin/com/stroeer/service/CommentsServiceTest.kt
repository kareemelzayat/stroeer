package com.stroeer.service

import com.stroeer.client.UserClient
import com.stroeer.exception.UserNotFoundException
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import io.mockk.coEvery
import io.mockk.mockk
import utils.TestUtils

@MicronautTest
class CommentsServiceTest : StringSpec({

    val userClient = mockk<UserClient>()
    val commentsService = CommentsService(userClient)

    "getUserComments should return user and posts successfully" {
        val userId = 1L
        val userResponse = TestUtils.createUserResponse(id = userId)
        val postResponse = TestUtils.createPostResponse(userId = userId)

        coEvery { userClient.getUser(userId) } returns userResponse
        coEvery { userClient.getPostsByUser(userId) } returns listOf(postResponse)

        val result = commentsService.getUserComments(userId)

        userResponse.apply {
            result?.id shouldBe id
            result?.name shouldBe name
            result?.username shouldBe username
            result?.email shouldBe email
            result?.address shouldBe address
            result?.phone shouldBe phone
            result?.website shouldBe website
            result?.company shouldBe company
        }
        result?.comments shouldBe listOf(postResponse)
    }

    "getUserComments should handle user not found" {
        val userId = 2L

        coEvery { userClient.getUser(userId) } returns null
        coEvery { userClient.getPostsByUser(userId) } returns emptyList()

        // Handle the exception or assert as needed
        try {
            commentsService.getUserComments(userId)
        } catch (e: UserNotFoundException) {
            // Expected exception
            e.message shouldBe "User not found"
        }
    }

    "getUserComments should handle posts not found" {
        val userId = 1L
        val userResponse = TestUtils.createUserResponse(id = userId)

        coEvery { userClient.getUser(userId) } returns userResponse
        coEvery { userClient.getPostsByUser(userId) } returns emptyList()

        val result = commentsService.getUserComments(userId)

        userResponse.apply {
            result?.id shouldBe id
            result?.name shouldBe name
            result?.username shouldBe username
            result?.email shouldBe email
            result?.address shouldBe address
            result?.phone shouldBe phone
            result?.website shouldBe website
            result?.company shouldBe company
        }
        result?.comments shouldBe emptyList()
    }

    "getUserComments should handle exceptions from user client" {
        val userId = 1L

        coEvery { userClient.getUser(userId) } throws Exception("Network Error")

        // Handle the exception or assert as needed
        try {
            commentsService.getUserComments(userId)
        } catch (e: Exception) {
            // Expected exception
            e.message shouldBe "Network Error"
        }
    }
})