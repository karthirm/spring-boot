package com.learning.springboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.courses.bean.Course;

@RestController
public class CourseController {

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return List.of(new Course(1, "Learn Docker", "Safari books"),
				new Course(2, "Learn Java 8 features", "Java Techs"));
	}
	
//	//http://localhost:8080/1
//	@GetMapping("/courses")
//	public  String getCourse(@RequestParam long id) {
//		System.out.println("inside method");
//		return "id:" + id;
//		//return new Course(id, "Learn Angular with Java, Spring", "java guider book");
//	}
	
	//http://localhost:8080/1
		@GetMapping("/courses/{id}")
		public Course getCourseDetails(@PathVariable long id) {
			return new Course(id, "Learn Angular with Spring", "Max-cha");
		}
	
}
