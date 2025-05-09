package users

import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<User, UUID>, UserCustomRepository {
  fun findByEmail(email: String): User
  fun findAllByEmail(email: String): List<User>
}
