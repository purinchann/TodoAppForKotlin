package com.example.todoapp.TodoAppForKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoAppForKotlinApplication

fun main(args: Array<String>) {
    runApplication<TodoAppForKotlinApplication>(*args)
}
