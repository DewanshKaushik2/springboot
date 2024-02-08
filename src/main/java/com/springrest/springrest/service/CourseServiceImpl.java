package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Product;

@Service
public class CourseServiceImpl implements CourseService{
	
//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl() {
		//	list = new ArrayList<Course>();
		//		list.add(new Course(145, "Java", "this course java"));
		//		list.add(new Course(4343, "Java", "this course java"));
	}
	

	@Override
	public List<Product> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}


	@Override
	public Product getCourse(Integer courseId) {
		return courseDao.getOne(courseId);
		 
		// TODO Auto-generated method stub
		// 	Course c=null;
		// 	for(Course course:list) {
		// 		if(course.getId() == courseId) {
		// 			c=course;
		// 			break;
		// 		}
		// 	}
		// 	return c;
	}


	@Override
	public Product addCourse(Product course) {
		courseDao.save(course);
		return course;
		// TODO Auto-generated method stub
		// list.add(course);
	//	return course;
	}


	@Override
	public Product updateCourse(Product course) {
		courseDao.save(course);
		return course;
//		list.forEach(new Consumer<Course>() {
//			@Override
//			public void accept(Course t) {
//				if(t.getId() == course.getId()) {
//				t.setTitle(course.getTitle());
//				t.setDescription(t.getDescription());
//			}
//		}});
//		return course;
	}


	@Override
	public void deleteCourse(Integer parseLong) {
		Product entity=	courseDao.getOne(parseLong);
	courseDao.delete(entity); 
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

	
	
	
	
	
}
