package com.intuit;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
	
	@Query("select p from Person p where p.age > :p1")
	List<Person> getAllWithAgeGreaterThan(@Param("p1") int age);
	
	//findBy methods
	Person findByNameAndAge(String name, int age);
	Person findByAgeAndName(int age, String name);
	Person findByIdAndName(int id, String name);
	Person findByIdAndAge(int id, int age);
	
	//findAll methods
	List<Person> findAllByNameAndAge(String name, int age);
}
