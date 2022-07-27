package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.insert(new Course(1,"Learn JPA Now!","Rajeev"));
		repository.insert(new Course(2,"Learn Azure!","Rajeev"));
		repository.insert(new Course(3,"Learn Java!","Rajeev"));
		repository.insert(new Course(4,"Learn Angular!","Rajeev"));
		repository.insert(new Course(5,"Learn Full Stack!","Rajeev"));
		repository.insert(new Course(6,"Learn ML!","Rajeev"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(3));
		System.out.println(repository.findById(5));
	}
	
	

	
}
