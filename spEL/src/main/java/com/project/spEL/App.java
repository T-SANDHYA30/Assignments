package com.project.spEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.spEL.Config.ConfigClass;
import com.project.spEL.beans.Order;

//import com.project.spEL.beans.SpELDemoClass;
import com.project.spEL.beans.SpELPrgDemo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
//    	Order o=(Order) context.getBean(Order.class);
//		System.out.println(o);

//	    
//	    SpELDemoClass spelBean =(SpELDemoClass) context.getBean("SpELDemoClass");
//	    spelBean.printAll();
	    
	    SpELPrgDemo spelPrgBean=(SpELPrgDemo)context.getBean("spELPrgDemo");
	    spelPrgBean.runExpression();
    }
}
