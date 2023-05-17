package com.josue.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.josue.todo.domain.Todo;
import com.josue.todo.repositories.TodoRepository;

@SpringBootApplication
public class ToDoApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}
}
