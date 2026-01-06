package com.project.spEL.beans;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Order {
	
	@Value("${Order.ordId}")
	private int ordId;
	@Value("#{T(java.time.LocalDate).parse('${Order.ordDate}')}")
	private LocalDate ordDate;
	@Value("${Order.ordCost}")
	private double ordCost;
	//@Value("#{'${Order.itemList}'.split(',')}")
	@Value("${Order.itemList}")
	private Set<String> itemList;
	@Value("#{'${Order.customerName}'.toUpperCase()}")
	private String customerName;
	
	@Value("#{${Order.ordCost}>5000?'PREMIUM':'NORMAL'}")
	private String orderType;
	@Value("#{T(java.time.LocalDate).parse('${Order.ordDate}').plusDays(5)}")
	private LocalDate deliveryDate;
	
	@Value("#{${Order.ordCost}>7000?${Order.ordCost}*0.10:0}")
	private double discount;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int ordId, LocalDate ordDate, double ordCost, Set<String> itemList, String customerName) {
		super();
		this.ordId = ordId;
		this.ordDate = ordDate;
		this.ordCost = ordCost;
		this.itemList = itemList;
		this.customerName= customerName;
		
	}
	public Order(String orderType, LocalDate deliveryDate, double discount) {
		super();
		this.orderType = orderType;
		this.deliveryDate = deliveryDate;
		this.discount = discount;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public void setOrdDate(LocalDate ordDate) {
		this.ordDate = ordDate;
	}
	public void setOrdCost(double ordCost) {
		this.ordCost = ordCost;
	}
	public void setItemList(Set<String> itemList) {
		this.itemList = itemList;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordDate=" + ordDate + ", ordCost=" + ordCost + ", itemList=" + itemList
				+ ", customerName=" + customerName + ", orderType=" + orderType + ", deliveryDate=" + deliveryDate
				+ ", discount=" + discount + "]";
	}


	
	

}
