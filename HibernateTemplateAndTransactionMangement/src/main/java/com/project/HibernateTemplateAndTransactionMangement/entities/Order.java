package com.project.HibernateTemplateAndTransactionMangement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ord_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ordId;
	private String productName;
	private int nou;
	private double amount;
	
	public Order(String productName, int nou, double amount) {
		super();
		this.productName = productName;
		this.nou = nou;
		this.amount = amount;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getNou() {
		return nou;
	}
	public void setNou(int nou) {
		this.nou = nou;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
