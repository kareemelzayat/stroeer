package com.stroeer.repository

import com.stroeer.domain.StroeerUser
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.kotlin.CoroutinePageableCrudRepository

@Repository
interface StroeerUserRepository : CoroutinePageableCrudRepository<StroeerUser, Long>
