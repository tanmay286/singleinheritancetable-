package com.capgemini.jpasingletableinheritance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpasingletableinheritance.dao.PersonDao;
import com.capgemini.jpasingletableinheritance.entity.Employee;
import com.capgemini.jpasingletableinheritance.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	
	/*
	 * @Override public Person get(int id) { Person employee =
	 * dao.findById(id).get(); return employee; }
	 */


	@Override
	public Employee add(Employee employee) {
		Employee e = dao.save(employee);
		return e;
	}

}
