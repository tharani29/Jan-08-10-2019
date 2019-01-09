package com.intuit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intuit.domain.Statement;

@Repository
public interface StatementRepository extends CrudRepository<Statement, Integer>{

}
