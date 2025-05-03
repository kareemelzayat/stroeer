package com.stroeer.domain

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Version

@Entity
class StroeerUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Version
    var version: Int,
    @Enumerated(EnumType.STRING)
    val role: Role,
) {
    constructor() : this(null, Int.MIN_VALUE, Role.USER)
    constructor(role: Role) : this(null, Int.MIN_VALUE, role)

    enum class Role {
        ADMIN,
        USER,
    }
}
