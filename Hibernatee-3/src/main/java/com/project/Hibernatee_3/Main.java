package com.project.Hibernatee_3;

import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Orders;
import com.project.Hibernatee_3.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		 List<Orders> studList=session.createQuery("From Orders", Orders.class).list();
		 studList.forEach(System.out::println);
		 
//		 session.save(new Orders(120,LocalDate.of(2009,9,9),10000));
//		 session.save(new Orders(123,LocalDate.of(2019,9,9),10000));
//		 session.save(new Orders(121,LocalDate.of(2019,12,12),20000));
//		 session.save(new Orders(122,LocalDate.of(2020,10,10),30000));
		 session.save(new Orders(124,LocalDate.of(2022,10,10),25000));
		 session.save(new Orders(125,LocalDate.of(2020,12,10),3000));
		 session.save(new Orders(126,LocalDate.of(2024,11,10),300000));
//		 
		 //get all orders by cost
		 System.out.println("--------get orders by cost------------");
		 Query<Orders> q1=session.createQuery("From Orders where cost=:c");
		 q1.setParameter("c",10000);
		 q1.list().forEach(System.out::println);
		 
		 //get orders by date
		 System.out.println("--------get orders by date------------");
		 Query<Orders> q2=session.createQuery("From Orders where odate=:o");
		 q2.setParameter("o",LocalDate.of(2019, 12,12));
		 q2.list().forEach(System.out::println);
		 
		 //get orders by cost
		 System.out.println("--------get orders by between 4000 and 50000------------");
		 Query<Orders> q3=session.createQuery("From Orders where cost between min and max",Orders.class);
		 q3.setParameter("min",4000);
		 q3.setParameter("max",50000);
		 q3.list().forEach(System.out::println);
		 
		 
		 transaction.commit();
		 session.close();
		 
		 
		 

		
	 
		
	}

}
