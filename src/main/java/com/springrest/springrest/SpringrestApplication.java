package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springrest.springrest.config.MyConfigValues;
import com.springrest.springrest.dao.CourseDao;
 
@SpringBootApplication
public class SpringrestApplication {

    @Autowired
    private MyConfigValues values;
    
    @Autowired
    CourseDao courseDao;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
