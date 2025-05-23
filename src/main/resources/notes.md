Optional: List Available Tasks To confirm that the flywayMigrate task is now available, run:

./gradlew tasks


```kotlin
package users

import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<User, UUID>, UserCustomRepository {
  fun findByEmail(email: String): User
  
  // Option 1: Use @Query annotation to provide a custom JPQL query
  @Query("SELECT u FROM User u")
  fun getAllUsers1(): List<User>
  
  // Option 2: Rename to follow Spring Data JPA naming conventions
  // fun findAll(): List<User> // This is already provided by JpaRepository
}
```
In Gradle with Spring Boot and Kotlin:

./gradlew bootRun - Builds and runs your Spring Boot application
./gradlew bootRun --continuous or ./gradlew -t bootRun - Runs in continuous mode, watching for changes

The -t flag is the short form of --continuous and provides similar functionality to SBT's tilde operator.
