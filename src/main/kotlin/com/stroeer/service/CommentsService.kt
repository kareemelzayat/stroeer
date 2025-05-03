package com.stroeer.service

import com.stroeer.repository.StroeerUserRepository
import jakarta.inject.Singleton

@Singleton
class CommentsService(
    private val stroeerUserRepository: StroeerUserRepository
) {
    suspend fun getUserComments(userId: Long) {
        stroeerUserRepository.findById(userId)?.let {

        }
    }
}
