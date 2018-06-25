package com.qa.accountapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.accountapp.entities.Account;



public interface AccountRepository  extends JpaRepository<Account, Long>{

}
