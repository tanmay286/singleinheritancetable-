package com.capgemini.jpasingletableinheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpasingletableinheritance.entity.Employee;
import com.capgemini.jpasingletableinheritance.entity.Person;
@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {
	
}
