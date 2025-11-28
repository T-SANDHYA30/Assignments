package com.genrics;

public class Item {
	
	private int id;
	private String itemname;
	private double itemCost;
	public int getId() {
		return id;
	}
	public String getItemname() {
		return itemname;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	public Item(int id, String itemname, double itemCost) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.itemCost = itemCost;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", itemCost=" + itemCost + "]";
	}
	

}
