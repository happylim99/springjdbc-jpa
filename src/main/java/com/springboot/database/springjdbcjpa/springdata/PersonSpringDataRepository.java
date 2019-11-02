package com.springboot.database.springjdbcjpa.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.database.springjdbcjpa.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
