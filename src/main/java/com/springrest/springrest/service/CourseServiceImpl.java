package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Courses> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Courses>();
		list.add(new Courses(145, "Java", "this course java"));
		list.add(new Courses(4343, "Java", "this course java"));
	}
	

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	
	
	
	
	
}
