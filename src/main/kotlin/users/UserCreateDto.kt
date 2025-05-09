package users

data class UserCreateDto(val name: String, val email: String)

fun UserCreateDto.toEntity(): User = User(name = this.name, email = this.email)
