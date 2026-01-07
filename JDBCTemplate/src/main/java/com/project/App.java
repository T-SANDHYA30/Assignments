package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.beans.Movie;
import com.project.config.JdbcConfig;
import com.project.dao.MovieDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	MovieDao dao=ctx.getBean(MovieDao.class);
    	Movie m=new Movie(123,"Coolie","Tamil",4);
    	
    	dao.save(m);
//    	dao.findAll().forEach(System.out::println);
 //   	System.out.println(dao.findById(123));
    	
    	dao.update(m);
    	dao.findAll().forEach(System.out::println);
    	
    }
}
