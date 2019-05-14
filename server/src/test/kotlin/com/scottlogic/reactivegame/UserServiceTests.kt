package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.UserService
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*


@RunWith(SpringRunner::class)
@SpringBootTest
class UserServiceTests {

	@Autowired
	private lateinit var userService: UserService

//	@LocalServerPort
//	private var port: Int = 0
//	private var httpClient: HttpClient = HttpClientBuilder.create().disableRedirectHandling().build()

//	private fun createURLWithPort(uri: String): URI {
//		return URI.create("http://ws00100:$port$uri")
//	}

	@Test
	fun ensureUserExists_withEmptyUserId_ReturnsAUser() {
		val user: User = userService.ensureUserExists("").get()
		assertThat(user.id, not(equalTo("")))
	}

	@Test
	fun ensureUserExists_withValidUserId_ReturnsAUser() {
		val user: User = userService.ensureUserExists("testUser").get()
		assertThat(user.name, equalTo("test"))
	}

	@Test
	fun ensureUserExists_withInvalidUserId_ReturnsNull() {
		val user: Optional<User> = userService.ensureUserExists("invalidId")//.get()
		assertEquals(user, Optional.empty<User>())
	}

}
