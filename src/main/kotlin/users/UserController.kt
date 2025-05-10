package users

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class UserController(private val userService: UserService) {

  @GetMapping("/save")
  fun save(): ResponseEntity<String> {
    userService.save()
    return ResponseEntity.ok("status")
  }

  @GetMapping("/hello")
  fun displayMuna(): ResponseEntity<String> {
    return ResponseEntity.ok("asdf")
  }

  /* @GetMapping("/users/email")
  /users/email?=jlcerezo@gmail.com
  fun getUser(@RequestParam email: String): ResponseEntity<User> {
    val user = userService.findUserByEmail(email)
    return ResponseEntity.ok(user)
  } */

  @GetMapping("/users/{email}")
  fun getUser(@PathVariable email: String): ResponseEntity<User> {
    val user = userService.findUserByEmail(email)
    return ResponseEntity.ok(user)
  }

  @GetMapping("/users")
  fun getAllUsers(): ResponseEntity<List<User>> {
    val users = userService.getAll()
    return ResponseEntity.ok(users)
  }
}
