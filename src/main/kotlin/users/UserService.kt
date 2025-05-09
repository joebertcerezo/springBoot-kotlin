package users

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepo: UserRepo) {
  fun findUserByEmail(email: String): User {
    return userRepo.findByEmail(email)
  }

  fun save(): Unit {
    userRepo.save(UserCreateDto("flb", "flb@gmail.com").toEntity())
    userRepo.save(UserCreateDto("flb1", "flb@gmail.com").toEntity())
    userRepo.save(UserCreateDto("flb2", "flb@gmail.com").toEntity())
  }
}
