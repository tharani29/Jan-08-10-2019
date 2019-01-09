package com.intuit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.service.AccountService;
import com.intuit.web.dto.AccountOperationParams;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private AccountService accountService;
	
	@PutMapping("/deposit")
	public String deposit(@RequestBody AccountOperationParams accountOperationParams) {
		accountService.deposit(accountOperationParams.getAccountNumber(), 
				accountOperationParams.getAmount(), 
				accountOperationParams.getType());
		return "Deposited successfully";
	}
	
	@PutMapping("/withdraw")
	public String withdraw(@RequestParam("accountnumber") int accountNumber, @RequestParam int amount, @RequestParam String type) {
		accountService.withdraw(accountNumber, amount, type);
		return "Withdraw Successfull";
	}
	
}
