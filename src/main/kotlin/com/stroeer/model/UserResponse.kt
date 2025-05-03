package com.stroeer.model

/**
 * Represents the detailed information about a user as retrieved from the API.
 *
 * @property id The unique identifier of the user.
 * @property name The full name of the user.
 * @property username The user's chosen username.
 * @property email The email address of the user.
 * @property address The address information of the user, including street, city, zipcode, and geographical details.
 * @property phone The contact phone number of the user.
 * @property website The personal or professional website of the user.
 * @property company The company details of the user, including name, catchphrase, and business focus.
 */
data class UserResponse(
    val id: Long?,
    val name: String?,
    val username: String?,
    val email: String?,
    val address: Address?,
    val phone: String?,
    val website: String?,
    val company: Company?
)

data class Address(
    val street: String,
    val suite: String,
    val city: String,
    val zipcode: String,
    val geo: Geo
)

data class Geo(
    val lat: String,
    val lng: String
)

data class Company(
    val name: String,
    val catchPhrase: String,
    val bs: String
)
