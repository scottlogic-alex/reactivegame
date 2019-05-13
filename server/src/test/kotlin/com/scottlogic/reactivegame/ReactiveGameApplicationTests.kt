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
//	@Autowired
//	private lateinit var lolController: LolController
	private var restTemplate = TestRestTemplate()
	private var httpClient: HttpClient = HttpClientBuilder.create().disableRedirectHandling().build()
	private var headers = HttpHeaders()

	private fun createURLWithPort(uri: String): URI {
		return URI.create("http://ws00100:$port$uri")
	}

	@Test
	fun contextLoads() {
		val entity = HttpEntity<String>(null, headers)
//		val response: ResponseEntity<String> = restTemplate.exchange(
//				createURLWithPort("/lol/host/hostname"), HttpMethod.GET, entity, String::class.java)

//		val response: ClientHttpResponse = httpClient.execute(
//				)
		val clientHttpRequestFactory: ClientHttpRequestFactory = HttpComponentsClientHttpRequestFactory(httpClient)
		val clientHttpRequest: ClientHttpRequest = clientHttpRequestFactory.createRequest(createURLWithPort("/lol/login/token/Elliesfirsttesttoken"), HttpMethod.GET)
//		val requestCallback = RequestCallback { it.headers.addAll(headers) }
//		requestCallback.doWithRequest(clientHttpRequest)
//		val responseExtractor: ResponseExtractor<Int> = ResponseExtractor { it.rawStatusCode }
		val response: ClientHttpResponse = clientHttpRequest.execute()
//		val extractData: Int? = responseExtractor.extractData(response)

//		val response: ClientHttpResponse = restTemplate.execute(
//				createURLWithPort("/lol/login/token/Elliesfirsttesttoken"),
//				HttpMethod.GET,
//				RequestCallback {
//					it.headers.addAll(headers)
//				},
//				ResponseExtractor {
//					it
//				})
		val actual = response.headers[HttpHeaders.LOCATION]!![0]
		assertThat(actual, equalTo("/register"));
	}

}
