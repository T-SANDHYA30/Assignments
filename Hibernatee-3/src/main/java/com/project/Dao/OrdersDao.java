package com.project.Dao;

import java.util.List;

import org.hibernate.Session;

import com.model.Orders;
import com.project.Hibernatee_3.util.HibernateUtil;



public class OrdersDao implements OrdersDaoInterface{

	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(int oId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Orders> findByCost(double Cost) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub\
				Session session=HibernateUtil.buildSessionFactory().openSession();
				Employee e=session.get(Employee.class,i);
				session.close();
		return null;
	}

	@Override
	public Orders updateOrder(Orders orders, int oId) {
		// TODO Auto-generated method stub
		return null;
	}

}
