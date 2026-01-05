package com.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long itemId;
	@Size(min=3,message="Id must me more than 3 char")
	private String itemName;
	//@DecimalMin(value="1000",message="Item cost must be more than 1000 rs/-")
	private double itemCost;
	public Item(String itemName, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
}
