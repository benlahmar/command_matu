package com.example.demo.entities;



public class Produit {

	long id;
	String desg;
	
	double price;
	int quantity;
	
	String descproduct;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescproduct() {
		return descproduct;
	}

	public void setDescproduct(String descproduct) {
		this.descproduct = descproduct;
	}
	
	
}
