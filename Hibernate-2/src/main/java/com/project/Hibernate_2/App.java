package com.project.Hibernate_2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Student;
import com.project.Hibernate_2.util.HibernateUtil;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        Student s=new Student(121,"sammy","python");
        session.save(s);
        System.out.println("object added successfully");
     
        
        //retrieve all students
        List<Student> studList=session.createQuery("From Student", Student.class).list();
        for(Student s2:studList)
        	System.out.println(s2);
        
        //delete by sid
        if(s!=null) {
        	session.delete(s);
        	session.save(s);
        	System.out.println("object deleted successfully");  	
        }
        
        //get by Id
		int idToFetch = 128; // The ID you want to retrieve
		Student student = session.get(Student.class, idToFetch);
		System.out.println("Id fetched successfully");
        
        tx.commit();
        
        
        session.close();
        factory.close();
        }
}
