package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.entities.Passport;
import com.entities.Person;
import com.project.OrmMapping.util.HibernateUtil;

public class PersonDao implements PersonDaoInterface {
	
	private static final Logger logger=LoggerFactory.getLogger(PersonDao.class);

	@Override
	public List<Person> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		logger.info("Fetching all person details");
		List<Person> personList=session.createQuery("From Person",Person.class).list();
		session.close();
		return personList;
	}

	@Override
	public void addPerson(Person person) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(person);
		transaction.commit();
		logger.info("erson record added successfully");
		session.close();
		
	}

	@Override
	public Person findById(Long id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Passport p =session.get(Passport.class, id);
		session.close();
		logger.info("Person details with id {}, {}",id,p);
		return p;
	}

//	@Override
//	public Person findByPersonIdWithPassportDetails(Long id) {
//		return null;
//	}
//
	@Override
	public Passport findByPersonId(Long pid) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Passport> q=session.createQuery("From passport p where p.person.id=:pid",Passport.class);
		q.setParameter("pid",pid);
		Passport pass=q.getSingleResult();
		session.close();	
		return pass;
	}
}
