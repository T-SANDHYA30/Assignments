package com.project.HibernateTemplateAndTransactionMangement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.HibernateTemplateAndTransactionMangement.dao.OrderDao;
import com.project.HibernateTemplateAndTransactionMangement.dao.PaymentDao;
import com.project.HibernateTemplateAndTransactionMangement.entities.Order;
import com.project.HibernateTemplateAndTransactionMangement.entities.Payment;

@Service
public class OrderService {
	
	@Autowired
	OrderDao orderDao;
	@Autowired
	PaymentDao paymentDao;
	
	@Transactional
	public void placeOrder(Order order, Payment payment) {
		
		Long id=orderDao.save(order);
		payment.setOrdId(id);
		paymentDao.save(payment);
		
	}

}
