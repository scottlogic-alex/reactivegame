package com.scottlogic.reactivegame

import org.apache.http.client.HttpClient
import org.apache.http.impl.client.HttpClientBuilder
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.client.ClientHttpRequest
import org.springframework.http.client.ClientHttpRequestFactory
import org.springframework.http.client.ClientHttpResponse
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.test.context.junit4.SpringRunner
import java.net.URI


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReactiveGameApplicationTests {


	@LocalServerPort
	private var port: Int = 0
	private var httpClient: HttpClient = HttpClientBuilder.create().disableRedirectHandling().build()

	private fun createURLWithPort(uri: String): URI {
		return URI.create("http://ws00100:$port$uri")
	}

	@Test
	fun contextLoads() {
		val clientHttpRequestFactory: ClientHttpRequestFactory = HttpComponentsClientHttpRequestFactory(httpClient)
		val clientHttpRequest: ClientHttpRequest = clientHttpRequestFactory.createRequest(createURLWithPort("/lol/login/token/Elliesfirsttesttoken"), HttpMethod.GET)
		val response: ClientHttpResponse = clientHttpRequest.execute()
		val actual = response.headers[HttpHeaders.LOCATION]!![0]
		assertThat(actual, equalTo("http://ws00100:3000/register"))
	}

}
