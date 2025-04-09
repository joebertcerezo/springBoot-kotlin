package com.`try`.tryMuna.users

import jakarta.persistence.*

@Entity
@Table(name = "USERS")
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        val name: String,
        val email: String
)
