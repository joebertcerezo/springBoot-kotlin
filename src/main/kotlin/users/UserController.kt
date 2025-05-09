package users

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
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

  @GetMapping("/users")
  fun getUser(@RequestParam email: String): ResponseEntity<User> {
    val user = userService.findUserByEmail(email)
    return ResponseEntity.ok(user)
  }
}
