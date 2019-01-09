package com.intuit.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.dao.AccountRepository;
import com.intuit.dao.StatementRepository;
import com.intuit.domain.Account;
import com.intuit.domain.Statement;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private StatementRepository statementRepository;
	
	@Transactional
	public void deposit(int accountNumber,int amount, String type) {
		Optional<Account> accountOpt = accountRepository.findById(accountNumber);
		if(accountOpt.isPresent()) {
			Account account = accountOpt.get();
			account.setBalance(account.getBalance() + amount);
			accountRepository.save(account);
			saveStatement(accountNumber, amount, type);
		}
	}

	@Transactional
	public void withdraw(int accountNumber,int amount, String type) {
		Optional<Account> accountOpt = accountRepository.findById(accountNumber);
		if(accountOpt.isPresent()) {
			Account account = accountOpt.get();
			account.setBalance(account.getBalance() - amount);
			accountRepository.save(account);
			saveStatement(accountNumber, amount, type);
		}
	}
	
	private void saveStatement(int accountNumber, int amount, String type) {
		Statement statement = new Statement();
		statement.setAccountNumber(accountNumber);
		statement.setAmount(amount);
		statement.setType(type);
		statementRepository.save(statement);
	}


}
