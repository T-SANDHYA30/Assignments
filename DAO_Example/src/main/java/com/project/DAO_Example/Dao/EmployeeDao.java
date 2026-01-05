package com.project.DAO_Example.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.Predicate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Employee;
import com.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeDao implements EmployeeDaoInterface{

	@Override
	public List<Employee> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Employee> empList=session.createNamedQuery("Employee.findAll()",Employee.class);
		return null;
	}
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=new Employee(123,"swapna",56777,"java","devloper");
		session.save(e);
		transaction.commit();
		
	}
	@Override
	public Employee findById(int i) {
		// TODO Auto-generated method stub\
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Employee e=session.get(Employee.class,i);
		session.close();
		return e;
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();			
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		
	}

	@Override
	public List<Employee> findByDept(String dept) {
		Session session=HibernateUtil.buildSessionFactory().openSession();		
		Query<Employee> q= session.createNamedQuery("Employee.findByDept()",Employee.class);	
		List<Employee> empList=q.setParameter("dept", dept).list();
		session.close();
		return empList;
	}

	@Override
	public List<Employee> findByFilters(String dept, String desg, double salary) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.buildSessionFactory().openSession();		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		List<Predicate> predicates=new ArrayList<Predicate>();
		
		if(dept!=null&&!dept.isEmpty()) 
			predicates.add((Predicate)cb.equal(root.get("dept"), dept));

		
		if(desg!=null&&!desg.isEmpty()) 
			predicates.add((Predicate)cb.equal(root.get("desg"), desg));

		
		if(salary!=0) 
			predicates.add((Predicate)cb.greaterThanOrEqualTo(root.get("salary"), salary));
		
		
		cq.where(predicates.toArray(new Predicate[0]));
		
		List<Employee> empList=session.createQuery(cq).getResultList();
		session.close();
		return empList;
	}
	
	



}
