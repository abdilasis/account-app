package com.qa.accountapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.accountapp.entities.Account;
import com.qa.accountapp.repositories.AccountRepository;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class AccountController{
	
	@Autowired
	private AccountRepository AccountRepository;

	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return AccountRepository.findAll();
	}

	@GetMapping("/account/{id}")
	public Optional<Account> getUser(@PathVariable Long id) {
		return AccountRepository.findById(id);
	}

	@DeleteMapping("/account/{id}")
	public boolean deleteAccount(@PathVariable Long id) {
		AccountRepository.deleteById(id);
		return true;
	}

	@PutMapping("/account")
	public Account updateAccount(@RequestBody Account account) {
		return AccountRepository.save(account);
	}

	@PostMapping("/account")
	public Account createUser(@RequestBody Account account) {
		return AccountRepository.save(account);
	}

}
