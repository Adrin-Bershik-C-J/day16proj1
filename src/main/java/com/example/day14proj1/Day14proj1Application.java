package com.example.day14proj1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.day14proj1.entity.Bug;
import com.example.day14proj1.repository.BugRepository;

@SpringBootApplication
public class Day14proj1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14proj1Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(BugRepository repo) {
		return args -> {
			repo.save(new Bug(null, "Login Issue", "Open", "John", "Project Alpha"));
			repo.save(new Bug(null, "Crash on Submit", "In Progress", "Alice", "Project Beta"));
			repo.save(new Bug(null, "UI Misalignment", "Closed", "Bob", "Project Alpha"));
		};
	}
}
