package users

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

interface UserCustomRepository {
  fun getAllUser(): List<User>
}

class UserCustomRepositoryImpl(@PersistenceContext private val entityManager: EntityManager) :
        UserCustomRepository {
  override fun getAllUser(): List<User> {
    val query = entityManager.createQuery("SELECT u FROM User u", User::class.java)
    return query.resultList

    /* 
    val query = entityManager.createQuery("SELECT u FROM User u WHERE u.email LIKE :pattern ORDER BY u.name", User::class.java)
    query.setParameter("pattern", "%@example.com")
    */
  }
}
