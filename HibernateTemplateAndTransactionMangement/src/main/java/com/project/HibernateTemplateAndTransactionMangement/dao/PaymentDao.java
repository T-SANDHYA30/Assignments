package com.project.HibernateTemplateAndTransactionMangement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.project.HibernateTemplateAndTransactionMangement.entities.Payment;

@Repository
public class PaymentDao {
	
	@Autowired
	HibernateTemplate template;
	
	public Long save(Payment p) {
		return (Long) template.save(p);
		
	}
	
	public Payment findById(int pid) {
		return template.get(Payment.class, pid);
	}

}
