package com.stroeer

import io.micronaut.context.ApplicationContextBuilder
import io.micronaut.context.ApplicationContextConfigurer
import io.micronaut.context.annotation.ContextConfigurer
import io.micronaut.runtime.Micronaut.run

@ContextConfigurer
class DefaultEnvironmentConfigurer : ApplicationContextConfigurer {
    override fun configure(builder: ApplicationContextBuilder) {
        builder.defaultEnvironments("dev")
    }
}

fun main(args: Array<String>) {
    run(*args)
}
