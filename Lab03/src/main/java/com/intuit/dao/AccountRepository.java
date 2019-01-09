package com.intuit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intuit.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{

}
