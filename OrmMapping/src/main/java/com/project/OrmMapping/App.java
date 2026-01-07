package com.project.OrmMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dao.PassportDao;
import com.dao.PersonDao;
import com.entities.Passport;
import com.entities.Person;

/**
 * Hello world!
 */
public class App {
	private static final Logger logger=LoggerFactory.getLogger(PassportDao.class);
    public static void main(String[] args) {
    	
    	logger.info("app started");
        Passport pass1=new Passport("India12");
        logger.info("passport generated {}",pass1);
        Person person=new Person("sandhay", "9233367880","sunnY@gamil.com");
        person.setPassport(pass1);
        logger.info("Person object created successfull {}",person);
        PersonDao dao=new PersonDao();
        //dao.addPerson(person);
        //dao.findAll().forEach(System.out::println);
        PassportDao dao1=new PassportDao();
        System.out.println(dao.findById(1l));
        logger.info("dao updated person status");
        logger.info("app closed");
    }
}
