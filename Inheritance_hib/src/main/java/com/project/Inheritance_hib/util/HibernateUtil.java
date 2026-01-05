package com.project.Inheritance_hib.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

		private static SessionFactory sessionFactory=buildSessionFactory();
		
		public static SessionFactory buildSessionFactory() {
			
			try {
				
			Properties props=new Properties();
			props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties"));
			Configuration cfg =new Configuration();
			cfg.setProperties(props);
			cfg.addAnnotatedClass(com.entities.Product.class);
			cfg.addAnnotatedClass(com.entities.Laptop.class);
			cfg.addAnnotatedClass(com.entities.Bottle.class);
			cfg.addAnnotatedClass(com.entities.Vehicle.class);
			cfg.addAnnotatedClass(com.entities.Bike.class);
			cfg.addAnnotatedClass(com.entities.Car.class);
			cfg.addAnnotatedClass(com.entities.Food.class);
			cfg.addAnnotatedClass(com.entities.ContinentalFood.class);
			cfg.addAnnotatedClass(com.entities.IndianFood.class);
			
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
			
			return cfg.buildSessionFactory(builder.build());
			}
			catch(Exception e) {
				throw new ExceptionInInitializerError();
			}
		}
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}

	}
