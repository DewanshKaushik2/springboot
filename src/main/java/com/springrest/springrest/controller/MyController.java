package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.entity.Product;
import com.springrest.springrest.service.CourseService;

@RestController
@RequestMapping("/home")
public class MyController {
	// last time = 55:05
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}

	// get the courses 
	@GetMapping("/courses")
	public List<Product> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Product getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/courses")
	public Product addCourse(@RequestBody Product course) {
		return courseService.addCourse(course);
	}
	
	//update course using PUT request
	@PutMapping("/courses")
	public Product updateCourse(@RequestBody Product course) {
		return courseService.updateCourse(course);
	}
	
	//delete the course
	@DeleteMapping("courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			courseService.deleteCourse(Integer.parseInt(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
