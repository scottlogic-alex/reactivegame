package com.scottlogic.reactivegame

import org.apache.http.HttpHost
import org.apache.http.client.HttpClient
import org.apache.http.client.RedirectStrategy
import org.apache.http.client.ResponseHandler
import org.apache.http.client.methods.HttpUriRequest
import org.apache.http.impl.client.DefaultRedirectStrategy
import org.apache.http.impl.client.HttpClientBuilder
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.HttpRequest
import org.springframework.http.client.*
import org.springframework.test.context.junit4.SpringRunner
//import org.springframework.test.util.AssertionErrors.assertTrue
import org.springframework.web.client.RequestCallback
import org.springframework.web.client.ResponseExtractor
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
		assertThat(actual, equalTo("/register"));
	}

}
