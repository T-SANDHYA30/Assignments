package com.tax.TaxProject;

public abstract class Asset implements Taxable{
	
	private int id;
	private String name;
	private double taxAmount;
	
	public Asset(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

}
