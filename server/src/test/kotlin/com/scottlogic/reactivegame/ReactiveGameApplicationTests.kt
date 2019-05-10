package com.scottlogic.reactivegame

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.boot.web.client.RestTemplateCustomizer
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RequestCallback
import org.springframework.web.client.ResponseExtractor
import sun.net.www.http.HttpClient


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReactiveGameApplicationTests {


	@LocalServerPort
	private var port: Int = 0
//	@Autowired
//	private lateinit var lolController: LolController
	private var restTemplate = TestRestTemplate()
	private var headers = HttpHeaders()

	private fun createURLWithPort(uri: String): String {
		return "http://ws00100:$port$uri"
	}

	@Test
	fun contextLoads() {
		val entity = HttpEntity<String>(null, headers)
//		val response: ResponseEntity<String> = restTemplate.exchange(
//				createURLWithPort("/lol/host/hostname"), HttpMethod.GET, entity, String::class.java)
		val response: ClientHttpResponse = restTemplate.execute(
				createURLWithPort("/lol/login/token/Elliesfirsttesttoken"),
				HttpMethod.GET,
				RequestCallback {
					it.headers.addAll(headers)
				},
				ResponseExtractor {
					it
				})
//		val actual = response.headers
		val actual = response.headers[HttpHeaders.LOCATION]!![0]
//		assertTrue("", actual.contains("/students"))
	}

}
