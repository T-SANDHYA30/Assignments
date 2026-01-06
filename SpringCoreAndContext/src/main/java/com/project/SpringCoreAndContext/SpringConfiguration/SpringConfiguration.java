package com.project.SpringCoreAndContext.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.project.SpringCoreAndContext.beans.Course;
import com.project.SpringCoreAndContext.beans.Student;

@Configuration
@ComponentScan(basePackages="com.project.SpringCoreAndContext")
@PropertySource("classpath:data.properties")
public class SpringConfiguration {
	
//	@Bean
//	public Student getStudent() {
//		return new Student(22,"viswa",getCourse());
//	}
//	
//	@Bean
//	public Course getCourse() {
//		return new Course(22,"springboot");
//	}

}
