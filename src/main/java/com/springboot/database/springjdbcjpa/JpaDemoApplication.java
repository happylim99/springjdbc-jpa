package com.springboot.database.springjdbcjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.springboot.database.springjdbcjpa.entity.Person;
import com.springboot.database.springjdbcjpa.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 - {}", repository.findById(10001));
//		logger.info("Delete user id 10003 - {}", dao.deleteById(10003));
//		logger.info("Find by id and name - {}", dao.findByIdName(10001, "melissa"));
		logger.info("Insert 10004 - {}", repository.insert(new Person("tara", "berlin", new Date())));
		logger.info("update 10001 - {}", repository.update(new Person(10001, "seansean", "mymy", new Date())));
		repository.deleteById(10003);
		logger.info("All users - {}", repository.findAll());
	}

}
