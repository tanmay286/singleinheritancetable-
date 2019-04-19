package com.capgemini.jpasingletableinheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpasingletableinheritance.dao.PersonDao;
import com.capgemini.jpasingletableinheritance.entity.Employee;
import com.capgemini.jpasingletableinheritance.entity.Person;
import com.capgemini.jpasingletableinheritance.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;
	@Autowired
	PersonDao dao;
	@RequestMapping("/")
	public Employee add() {
		Employee employee = new Employee(101,"Tanmay", "Capgemini");
		 return service.add(employee);
	}
	
	@RequestMapping("/new")
	public Person getPerson() {
		Person person =dao.findById(101).get();
		//System.out.println(person);
		return person;
	}
}
