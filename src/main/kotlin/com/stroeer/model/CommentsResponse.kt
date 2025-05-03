package com.stroeer.model

class CommentsResponse(
    val user: UserResponse,
    val comments: List<PostResponse>
)
