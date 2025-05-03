package com.stroeer.client

import com.stroeer.model.PostResponse
import com.stroeer.model.UserResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://jsonplaceholder.typicode.com")
interface UserClient {

    @Get("/users/{id}")
    suspend fun getUser(id: Long): UserResponse

    @Get("/posts?userId={userId}")
    suspend fun getPostsByUser(userId: Long): List<PostResponse>
}