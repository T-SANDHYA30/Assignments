package com.project.HibernateTemplateAndTransactionMangement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Long ordId;
	private double amount;
	private String paymentType;
	private String status;
	
	public Payment(Long ordId, double amount, String paymentType, String status) {
		super();
		this.ordId = ordId;
		this.amount = amount;
		this.paymentType = paymentType;
		this.status = status;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long id2) {
		this.ordId = id2;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
