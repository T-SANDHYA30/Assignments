package com.project.HibernateTemplateAndTransactionMangement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.project.HibernateTemplateAndTransactionMangement.config.AppConfig;
import com.project.HibernateTemplateAndTransactionMangement.entities.Order;
import com.project.HibernateTemplateAndTransactionMangement.entities.Payment;
import com.project.HibernateTemplateAndTransactionMangement.service.OrderService;



public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	OrderService service=(OrderService)context.getBean(OrderService.class);
    	Order order=new Order("Laptop",3,150000.0);
    	Payment payment=new Payment(null,150000.0,"phonepay","pending");
    	service.placeOrder(order, payment);
		

    }
}
