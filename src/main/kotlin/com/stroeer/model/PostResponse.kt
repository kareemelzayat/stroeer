package com.stroeer.model

/**
 * Represents a single comment retrieved from the Posts API.
 *
 * @property userId The unique identifier of the user to whom the post belongs.
 * @property id The unique identifier of the post.
 * @property title The title of the post.
 * @property body The main content or body of the post.
 */
data class PostResponse(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String
)
