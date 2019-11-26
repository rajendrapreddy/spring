package com.family.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.model.Person;

@RestController
public class FamilyController {

	@RequestMapping("/getPerson")
	public List<Person> getPerson() {
		List<Person> personsList = new ArrayList<Person>();

		
		 personsList.add(new Person(1, "Leeladhar", "G", "leeladhar45@gmail.com"));
		 personsList.add(new Person(2, "Teena", "G", "leeladhar45@gmail.com"));
		 
		Person obj = new Person();
		obj.setId(3);
		obj.setFirstName("Te");
		obj.setLastName("ghh");
		obj.setEmail("ggjh@jj.com");

		personsList.add(obj);
		return personsList;
	}

	@RequestMapping("/")
	public String ping() {
		String status = "Service is Up";

		return status;
	}

}
