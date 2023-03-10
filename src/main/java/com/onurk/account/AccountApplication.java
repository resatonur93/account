package com.onurk.account;

import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class AccountApplication extends CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.empty);
	}
}
