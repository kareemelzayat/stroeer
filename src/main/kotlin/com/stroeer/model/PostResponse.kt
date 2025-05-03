package com.stroeer.model

data class PostResponse(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String,
)
