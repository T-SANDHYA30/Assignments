package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")

@NamedQueries({@NamedQuery(name="Orders.findByDate",query="From Orders where odate=:odate"),
@NamedQuery(name="orders.betweenCost",query="From Orders where cost between min and max")	
})
public class Orders {
	
	@Id
	private int oId;
	private LocalDate odate;
	private double cost;
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public LocalDate getOdate() {
		return odate;
	}
	public void setOdate(LocalDate odate) {
		this.odate = odate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Orders(int oId, LocalDate odate, double cost) {
		super();
		this.oId = oId;
		this.odate = odate;
		this.cost = cost;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [oId=" + oId + ", odate=" + odate + ", cost=" + cost + "]";
	}
	
	

}
