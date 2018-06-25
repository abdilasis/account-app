package com.qa.accountapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.accountapp.entities.Account;
import com.qa.accountapp.repositories.AccountRepository;

@SpringBootApplication
public class AccountAppApplication implements CommandLineRunner {
	@Autowired
	private AccountRepository accountRepository;
	public static void main(String[] args) {
		SpringApplication.run(AccountAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		accountRepository.save(new Account("John", "Wick","00001"));
		accountRepository.save(new Account("Flex", "summer","00002"));
		accountRepository.save(new Account("Mo", "Salah","00003"));
	}
}
