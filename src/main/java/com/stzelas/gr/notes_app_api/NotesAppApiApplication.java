package com.stzelas.gr.notes_app_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NotesAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesAppApiApplication.class, args);
	}

}
