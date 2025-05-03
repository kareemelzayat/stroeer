package com.stroeer.model

/**
 * Represents the response containing a user's details along with their associated comments.
 *
 * @property id The unique identifier of the user.
 * @property name The full name of the user.
 * @property username The user's chosen username.
 * @property email The email address of the user.
 * @property address The address information of the user, including street, city, zipcode, and geographical details.
 * @property phone The contact phone number of the user.
 * @property website The personal or professional website of the user.
 * @property company The company details of the user, including name, catchphrase, and business focus.
 * @property comments The list of comments associated with the user.
 *
 * @constructor Creates a new instance of `CommentsResponse` by combining user details from a `UserResponse` object
 * and a list of associated comments (`PostResponse` objects).
 */
data class CommentsResponse(
    val id: Long?,
    val name: String?,
    val username: String?,
    val email: String?,
    val address: Address?,
    val phone: String?,
    val website: String?,
    val company: Company?,
    val comments: List<PostResponse>?
) {
    constructor(userResponse: UserResponse, comments: List<PostResponse>) : this(
        userResponse.id,
        userResponse.name,
        userResponse.username,
        userResponse.email,
        userResponse.address,
        userResponse.phone,
        userResponse.website,
        userResponse.company,
        comments
    )
}
