package com.webCof.uniqueApp;

import com.webCof.uniqueApp.entity.JournalEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {

		SpringApplication.run(JournalApplication.class, args);
		JournalEntry e1 = new JournalEntry();
		System.out.println(e1);
	}

}
