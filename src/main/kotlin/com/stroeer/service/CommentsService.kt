package com.stroeer.service

import com.stroeer.client.UserClient
import com.stroeer.model.CommentsResponse
import jakarta.inject.Singleton
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

@Singleton
class CommentsService(
//    private val stroeerUserRepository: StroeerUserRepository,
    private val userClient: UserClient
) {
    suspend fun getUserComments(userId: Long): CommentsResponse? = coroutineScope {
        val userResponse = async { userClient.getUser(userId) }
        val postResponse = async { userClient.getPostsByUser(userId) }
        CommentsResponse(userResponse.await(), postResponse.await())
    }
}
