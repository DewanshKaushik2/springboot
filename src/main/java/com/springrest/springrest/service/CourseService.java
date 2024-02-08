package com.springrest.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Product;


@Service
public interface CourseService {
	
public List<Product> getCourses();

public Product getCourse(Integer courseId);

public Product addCourse(Product course);

public Product updateCourse(Product course);

public void deleteCourse(Integer parseLong);



}
