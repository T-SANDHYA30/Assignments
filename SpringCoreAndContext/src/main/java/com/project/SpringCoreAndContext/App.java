package com.project.SpringCoreAndContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.SpringCoreAndContext.beans.Employee;
//import com.project.SpringCoreAndContext.beans.Hello;
import com.project.SpringCoreAndContext.beans.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("emp-bean.xml");
//        Hello h=(Hello) context.getBean("hello");
//        System.out.println(h.sayHello());
        
//        Person p=(Person) context.getBean("p");
//        System.out.println(p);
//        System.out.println(p.hashCode());
//        
//        Person p1=(Person) context.getBean("p");
//        System.out.println(p1.hashCode());
        
        Employee emp=(Employee) context.getBean("emp");
        System.out.println(emp);
        System.out.println(emp.hashCode());
        
        
        
    }
}
