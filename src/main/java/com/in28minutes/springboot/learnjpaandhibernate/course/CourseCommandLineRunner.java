package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJpaRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception{
		repository.save(new Course(1,"Learn JPA Now!","Rajeev"));
		repository.save(new Course(2,"Learn Azure!","Rajeev"));
		repository.save(new Course(3,"Learn Java!","Rajeev"));
		repository.save(new Course(4,"Learn Angular!","Rajeev"));
		repository.save(new Course(5,"Learn Full Stack!","Rajeev"));
		repository.save(new Course(6,"Learn ML!","Rajeev"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(5l)); //adding l, because method expects long
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Rajeev"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Full Stack!"));
		System.out.println(repository.findByName("Learn Full!"));
		
	}
	
	

	
}
