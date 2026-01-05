package com.project.Hibernatee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Course c=new Course(1,"python");
        session.save(c);
        tx.commit();
        System.out.println("course details added successfully");
        
        
//        Student s= new Student(1,"sandhya","python","9888856784","sandhya@gmail.com");
//        session.save(s);
//        tx.commit();
//        System.out.println("inserted successfully");
    }
}