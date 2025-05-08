package com.`try`.tryMuna.users

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo : JpaRepository<User, Long> {
  fun findByEmail(email: String): User
}
