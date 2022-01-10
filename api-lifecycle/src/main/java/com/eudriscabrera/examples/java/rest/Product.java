package com.eudriscabrera.examples.java.rest;

/**
 * @author ecabrerar
 * @since Jul 31, 2021
 */
public class Product {
	private String code;
	private String description;
	private String name;
	private Integer qty;
	private double price;
	
	public Product(String code, String description, String name, Integer qty, double price) {
		super();
		this.code = code;
		this.description = description;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public Integer getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}
	
}
