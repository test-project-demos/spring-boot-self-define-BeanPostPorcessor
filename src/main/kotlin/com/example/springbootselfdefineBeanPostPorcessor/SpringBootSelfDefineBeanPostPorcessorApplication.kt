package com.example.springbootselfdefineBeanPostPorcessor

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootSelfDefineBeanPostPorcessorApplication: CommandLineRunner {
	@Autowired
	private lateinit var userService: UserService

	override fun run(vararg p0: String?) {
		val userName = userService.getUserName(100L)
		println(userName)
	}
}

fun main(args: Array<String>) {
	SpringApplication.run(SpringBootSelfDefineBeanPostPorcessorApplication::class.java, *args)
}
