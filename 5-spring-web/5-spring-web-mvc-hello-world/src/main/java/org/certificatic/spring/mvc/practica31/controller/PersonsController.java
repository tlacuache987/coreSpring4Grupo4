package org.certificatic.spring.mvc.practica31.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.certificatic.spring.validation.practica30.parte1.domain.Person;
import org.certificatic.spring.validation.practica30.parte1.domain.Persons;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Anotar RestController
@RestController
// Anotar request mapping "/persons"
@RequestMapping("/persons")
public class PersonsController {

	private List<Person> persons = Collections.synchronizedList(new ArrayList<Person>());

	@PostConstruct
	private void init() {
		for (int i = 0; i < 3; i++) {
			Person p = new Person();
			p.setId(i + 1);
			p.setName("Ivan " + (i + 1));
			p.setAge(28 + i + 1);
			persons.add(p);
		}
	}

	// Anotar request mapping "/", "", con metodo GET y produciendo json y xml
	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Persons getAllPersons() {
		return new Persons(persons);
	}

	// Anotar request mapping "/{id}", con metodo GET y produciendo json y xml
	// Anotar response status ok
	@RequestMapping(value = { "/{id}" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Person getPerson(@PathVariable Integer id) {
		return persons.get(id - 1);
	}

	// Anotar request mapping "/{id}", con metodo GET y produciendo json y xml
	// Anotar response status ok
	@RequestMapping(value = { "/{id}" }, method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Person updatePerson(@PathVariable Integer id, @RequestBody Person person) {
		Person p = persons.get(id - 1);
		
		p.setAge(person.getAge());
		p.setName(person.getName());
		
		return p;
	}

	// Anotar request mapping "/", "", con metodo POST y produciendo json y xml
	// Anotar response status NO CONTENT
	@RequestMapping(value = { "", "/" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void createPerson(@RequestBody Person person) {
		persons.add(person);
	}

}
