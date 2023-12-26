package com.example.user_project;

import com.example.user_project.dao.entities.User;
import com.example.user_project.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository u)
	{
		return args -> {
			User user = User.builder().name("amine").email("amine12@gmail.com").date_naissance("12/01/199").password("123").build();
			u.save(user);
			User user2 = User.builder().name("anas").email("amine12@gmail.com").date_naissance("12/01/1200").password("123").build();
			u.save(user2);
			User user3 = User.builder().name("yassine").email("amine12@gmail.com").date_naissance("12/01/2001").password("123").build();
			u.save(user3);
			User user4 = User.builder().name("ahmed").email("amine12@gmail.com").date_naissance("12/01/1200").password("123").build();
			u.save(user4);
		};
	}

}
