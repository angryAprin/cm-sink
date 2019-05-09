package com.qirat.content.management.messaging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmSinkApplication

fun main(args: Array<String>) {
	runApplication<CmSinkApplication>(*args)
}
