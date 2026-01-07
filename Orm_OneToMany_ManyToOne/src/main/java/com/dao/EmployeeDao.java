package com.dao;

import java.util.List;

import org.hibernate.Session;

import com.project.Orm_OneToMany_ManyToOne.entities.Employee;
import com.util.HibernateUtil;

public class EmployeeDao {
	
	public List<Employee> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> elist=session.createQuery("From Employee",Employee.class).list();

		return elist;
	}
	
	public void addEmployee(Employee e) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> EmployeeList=session.createQuery("From Employee",Employee.class).list();
	}

}
