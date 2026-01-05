package com.project.Inheritance_hib;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.entities.IndianFood;
import com.entities.Vehicle;
import com.project.Inheritance_hib.util.HibernateUtil;


public class App {
	
	private static final Logger logger=LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
		logger.info("Application started");
        Session session=HibernateUtil.buildSessionFactory().openSession();
		logger.info("session created");
        Transaction tx=session.beginTransaction();
		logger.info("Transaction started");
        //Product p=new Product(124,"Dell Laptop");
		//Vehicle v=new Vehicle("V1", "4 wheeler");
		IndianFood i=new IndianFood(1, "Dosa", "veg");
		
		logger.info("persisent object inserted");

        session.save(i);
        tx.commit();
        session.close();
    }
}
