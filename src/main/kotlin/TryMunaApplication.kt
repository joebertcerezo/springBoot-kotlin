package com.`try`.tryMuna

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.try.tryMuna", "users"])
@EnableJpaRepositories(basePackages = ["users"])
@EntityScan(basePackages = ["users"])
class TryMunaApplication

fun main(args: Array<String>) {
  runApplication<TryMunaApplication>(*args)
}
