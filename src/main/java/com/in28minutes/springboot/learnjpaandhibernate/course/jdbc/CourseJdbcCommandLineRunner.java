package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.insert(new Course(1,"Learn AWS Now!","Rajeev"));
		repository.insert(new Course(2,"Learn Azure!","Rajeev"));
		repository.insert(new Course(3,"Learn Java!","Rajeev"));
		repository.insert(new Course(4,"Learn Angular!","Rajeev"));
		repository.insert(new Course(5,"Learn Full Stack!","Rajeev"));
		repository.insert(new Course(6,"Learn ML!","Rajeev"));
		
		repository.deleteById(2);
	}
	
	

	
}
