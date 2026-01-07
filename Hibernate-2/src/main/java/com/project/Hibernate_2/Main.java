package com.project.Hibernate_2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Student;
import com.project.Hibernate_2.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		//getAllStudents()
		 List<Student> studList=session.createQuery("From Student", Student.class).list();
		 studList.forEach(System.out::println);
	 
		 //addStudent();
//		 session.save(new Student(120,"sunny","python"));
//		 session.save(new Student(130,"swapna","python"));
//		 session.save(new Student(131,"sunny","spring"));
//		 session.save(new Student(132,"abhi","spring"));
		 
		 
		 //getAllStudentsBYCourse()	 
		 Query<Student> q1=session.createQuery("From Student where course=:c");
		 q1.setParameter("c","java");
		 q1.list().forEach(System.out::println);
		 
		 //getAllStudents whose name starts with s
		 Query<Student> q2=session.createQuery("From Student where sname like 'a%'");
		 q2.list().forEach(System.out::println);
		 
		 //get only id and name
		 studList.forEach(s->System.out.println(s.getSid()+" "+s.getSname()));
		 
		 
		 //count
		 Query<Student> q3=session.createQuery("select count(*) from Student");
		 System.out.println(q3.uniqueResult());
		 
		 //count no of students in each course
		 Query<Object[]> q4=session.createQuery("select course,count(course) from Student group by course");
		 q4.list().forEach(s->System.out.println(s[0]+" "+s[1]));
		 
		 //using named query
		 
		 Query<Student> q5=session.createNamedQuery("Student.findAll",Student.class);
		 System.out.println("-------Using named query--------");
		 q5.list().forEach(System.out::println);
		 
		 
		 System.out.println("-------find course Using named query--------");
		 Query<Student> q6=session.createNamedQuery("Student.findByCourse",Student.class);
		 q6.setParameter("course", "spring");
		 q6.list().forEach(System.out::println);
		 
		 
		 System.out.println("-------count students Using named query--------");
		 Query<Long> q7=session.createNamedQuery("Student.count",Long.class);
		 System.out.println(q7.uniqueResult());
		 
		 Query<Object[]> q8=session.createNamedQuery("Student.groupByCourse",Object[].class);
		 q8.list().forEach(s->System.out.println(s[0]+" "+s[1]));
		 
		transaction.commit();
		session.close();
	}

}
