package com.springboot.database.springjdbcjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.springboot.database.springjdbcjpa.entity.Person;
import com.springboot.database.springjdbcjpa.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users - {}", dao.findAll());
		logger.info("User id 10002 - {}", dao.findById(10001));
		logger.info("Delete user id 10003 - {}", dao.deleteById(10003));
		logger.info("Find by id and name - {}", dao.findByIdName(10001, "melissa"));
		logger.info("Insert 10003 - {}", dao.insert(new Person(10003, "tara", "berlin", new Date())));
		logger.info("update 10001 - {}", dao.update(new Person(10001, "seansean", "mymy", new Date())));
	}

}
