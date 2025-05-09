package users

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepo: UserRepo) {
  fun findUserByEmail(email: String): User {
    return userRepo.findByEmail(email)
  }

  fun save(): Unit {
    userRepo.save(UserCreateDto("flb1", "flb1@gmail.com").toEntity())
    userRepo.save(UserCreateDto("flb2", "flb2@gmail.com").toEntity())
    userRepo.save(UserCreateDto("flb3", "flb3@gmail.com").toEntity())
  }

  fun getAll(): List<User> {
    return userRepo.getAllUser()
  }
}
