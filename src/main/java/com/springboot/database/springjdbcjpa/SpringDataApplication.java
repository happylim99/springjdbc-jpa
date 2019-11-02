package com.springboot.database.springjdbcjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.database.springjdbcjpa.entity.Person;
import com.springboot.database.springjdbcjpa.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("User id 10001 - {}", repository.findById(10001));
//		logger.info("Delete user id 10003 - {}", dao.deleteById(10003));
//		logger.info("Find by id and name - {}", dao.findByIdName(10001, "melissa"));
		logger.info("Insert new - {}", repository.save(new Person("tara", "berlin", new Date())));
//		logger.info("update 10001 - {}", repository.save(new Person(10001, "seansean", "mymy", new Date())));
//		repository.deleteById(10003);
//		logger.info("All users - {}", repository.findAll());
	}

}
