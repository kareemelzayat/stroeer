package com.stroeer.service

import com.stroeer.client.UserClient
import com.stroeer.exception.UserNotFoundException
import com.stroeer.model.CommentsResponse
import jakarta.inject.Singleton
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Singleton
class CommentsService(
    private val userClient: UserClient
) {
    /**
     * Retrieves a combined response of user details and their associated comments.
     * This method fetches user information and a list of comments asynchronously
     * and returns them as a combined `CommentsResponse`. If the user is not found,
     * a `UserNotFoundException` is thrown.
     *
     * @param userId the unique identifier of the user whose details and comments are to be retrieved
     * @return a `CommentsResponse` containing the user's details and their associated comments;
     *         returns null if no data is available for the user
     * @throws UserNotFoundException if the user is not found
     */
    suspend fun getUserComments(userId: Long): CommentsResponse? = coroutineScope {
        val userResponse = async {
            log.info("Fetching details for user: $userId")
            userClient.getUser(userId)
        }

        log.info("This should be logged first")

        val postResponse = async {
            log.info("Fetching comments for user: $userId")
            userClient.getPostsByUser(userId)
        }

        log.info("Next is this, then the Fetching logs start simultaneously")

        userResponse.await()?.let {
            CommentsResponse(it , postResponse.await())
        } ?: throw UserNotFoundException()
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(CommentsService::class.java)
    }
}
