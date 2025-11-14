package org.example.server

import org.springframework.cloud.config.environment.Environment
import org.springframework.cloud.config.environment.PropertySource
import org.springframework.cloud.config.server.environment.EnvironmentRepository
import org.springframework.core.Ordered
import org.springframework.stereotype.Component

@Component
class CustomEnvRepository : EnvironmentRepository, Ordered {
    override fun findOne(
        application: String?,
        profile: String?,
        label: String?
    ): Environment {
        return Environment(application, profile).apply {
            add(
                PropertySource(
                    "CloudConfig",
                    mapOf("config" to (profile ?: "null"))
                )
            )
        }
    }

    override fun getOrder(): Int {
        return 0
    }
}
