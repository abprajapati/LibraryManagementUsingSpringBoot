package com.example.LibraryManagementSys;

import com.example.LibraryManagementSys.models.Author;
import com.example.LibraryManagementSys.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LibraryManagementSystem implements CommandLineRunner {

	@Autowired
	AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystem.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("In run function of main class");
		List<Author> authorList =  authorRepository
				.findByAgeGreaterThanEqualAndCountryAndNameStartingWith(30, "India", "P");


		authorList.forEach(System.out::println);
	}
}
