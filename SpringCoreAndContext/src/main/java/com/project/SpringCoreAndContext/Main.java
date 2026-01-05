package com.project.SpringCoreAndContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.SpringCoreAndContext.SpringConfiguration.SpringConfiguration;
import com.project.SpringCoreAndContext.beans.Student;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student s=(Student) context.getBean(Student.class);
		System.out.println(s);
		context.close();
	}

}
