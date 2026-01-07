package com.project.Hibernatee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Course c=new Course(1,"python");
        session.save(c);
        System.out.println("course details added successfully");     
        Student s= new Student(1,"sandhya","python","9888856784","sandhya@gmail.com");
        session.save(s);
        System.out.println("inserted successfully");
        
        
        Session s=session.get

	}

}
