package com.encapsulation;

import java.time.LocalTime;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private LocalTime Time;
	private String UpdatedStatus;
	private double pricewithGST;

	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
	public String getUpdatedStatus() {
		return UpdatedStatus;
	}
	public void setUpdatedStatus(String updatedStatus) {
		UpdatedStatus = updatedStatus;
	}
	
	public double getPricewithGST() {
		return pricewithGST;
	}
	public void setPricewithGST(double pricewithGST) {
		this.pricewithGST = pricewithGST;
	}

}
