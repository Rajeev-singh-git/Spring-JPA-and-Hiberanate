package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{

	
	//We can also define custom method, just take care of naming convention 
	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String course);
	
	

}
