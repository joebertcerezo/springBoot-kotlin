package users

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "\"USERS\"")
class User(
        @Id 
        // @GeneratedValue(strategy = GenerationType.IDENTITY) 
        val id: UUID? = UUID.randomUUID(),
        @Column(nullable = false)
        val name: String,
        val email: String
)
