package com.project.HibernateTemplateAndTransactionMangement.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.project.HibernateTemplateAndTransactionMangement.entities.Order;

@Repository
public class OrderDao {
	
	HibernateTemplate hibernateTemplate;
	
	public Long save(Order order) {
		return (Long) hibernateTemplate.save(order);
	}
	
	public Order findById(Long ordid) {
		return hibernateTemplate.get(Order.class, ordid);
	}

}
