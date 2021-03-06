package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.EmailService
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest
class EmailServiceTests {

    @Autowired
    private lateinit var emailService: EmailService

    @get:Rule
    val exception: ExpectedException = ExpectedException.none()
//
//    @Test
//    fun sendEmailTestHappy() {
//        val exitCode = emailService.sendEmail("ehield@scottlogic.com' 'hacked subject' 'whatever I want'; Write-Output \"hello\"; Write-Output '")
//        assertThat(exitCode, equalTo(0))
//    }
//
//    @Test
//    fun sendEmailTestSad() {
//        exception.expect(EmailException::class.java)
//        exception.expect(hasProperty<EmailException>("exitCode", not(equalTo(0))))
//        val exitCode = emailService.sendEmail("ehield@scottlogic.com")
//        assertThat(exitCode, equalTo(1))
//    }

    @Test
    fun sendEmail2TestHappy() {
        val nada = emailService.sendEmail(address = "ehield@scottlogic.com", body = "hello Ellie, \nI'm passing in a variable")
        assertThat(nada, equalTo(Unit))
    }

}