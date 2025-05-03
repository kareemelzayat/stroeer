package utils

import com.stroeer.model.*

object TestUtils {
    fun createUserResponse(
        id: Long = 1,
        name: String = "John Doe",
        email: String = "john.doe@example.com",
        phone: String = "123-456-7890",
        website: String = "johndoe.com",
    ) = UserResponse(
        id,
        name,
        name,
        email,
        Address(
            "MockStreet",
            "MockSuite",
            "MockCity",
            "MockZipcode",
            Geo(
                "MockLat",
                "MockLng"
            )
        ),
        phone,
        website,
        Company(
            "mockCompany",
            "we love mock",
            "bs"
        )
    )

    fun createPostResponse(
        userId: Long = 1,
        id: Long = 1,
        title: String = "Sample Post",
        body: String = "This is a sample post."
    ) = PostResponse(userId, id, title, body)
}