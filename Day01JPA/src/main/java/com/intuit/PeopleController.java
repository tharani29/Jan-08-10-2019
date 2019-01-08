package com.intuit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/all")
	public List<Person> getAll() {
		List<Person> persons = new ArrayList<>();
		personRepository.findAll()
						.forEach(p -> persons.add(p));
		return persons;
	}
	
	@PutMapping("/updateage/{id}/{newage}")
	public Object updateAge(@PathVariable int id, 
			@PathVariable("newage") int newAge) {
		Optional<Person> personOpt = personRepository.findById(id);
		Person person = null;
		if(personOpt.isPresent()) {
			person = personOpt.get();
			person.setAge(newAge);
			personRepository.save(person);
		}
		else {
			return "Person with id " + id + " does not exist";
		}
		return person;
	}
	
	@GetMapping("/{id}")
	public Object getPerson(@PathVariable int id) {
		Optional<Person> personOpt = personRepository.findById(id);
		Person person = null;
		if(personOpt.isPresent()) {
			person = personOpt.get();
		}
		else {
			return "Person with id " + id + " does not exist";
		}
		return person;
	}
	
	@PostMapping("/save/{name}/{age}")
	public String savePerson(@PathVariable String name, @PathVariable int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		personRepository.save(person);
		return "Saved";
	}
	
}
