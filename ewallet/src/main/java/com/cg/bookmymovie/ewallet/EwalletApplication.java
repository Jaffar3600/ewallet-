package com.cg.bookmymovie.ewallet;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.bookmymovie.ewallet.ewallet.Ewallet;
import com.cg.bookmymovie.ewallet.ewallet.Statement;
import com.cg.bookmymovie.ewallet.repository.EwalletRepository;

@SpringBootApplication
public class EwalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwalletApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner createAccounts(EwalletRepository repo) {

		return (arg) -> {
			repo.save(new Ewallet(101, 10000.00, new Statement(11, "deposit", "buy ticket", LocalDateTime.now())));
			repo.save(new Ewallet(102, 20000.00, new Statement(12, "deposit", "buy ticket", LocalDateTime.now())));
			repo.save(new Ewallet(103, 30000.00, new Statement(13, "deposit", "buy ticket", LocalDateTime.now())));
			repo.save(new Ewallet(104, 40000.00, new Statement(14, "deposit", "buy ticket", LocalDateTime.now())));
		};
	}
	
}

