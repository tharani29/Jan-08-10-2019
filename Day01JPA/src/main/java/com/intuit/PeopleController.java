package com.intuit;

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
	
	@PutMapping("/updateage/{id}/{newage}")
	public Person updateAge(@PathVariable int id, 
			@PathVariable("newage") int newAge) {
		//IMPLEMENT THIS
		return null;
	}
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable int id) {
		//IMPLEMENT THIS
		return null;
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
