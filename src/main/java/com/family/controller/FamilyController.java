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
		return personsList;
	}

	@RequestMapping("/")
	public String ping() {
		String status = "Service is Up";

		return status;
	}

}
