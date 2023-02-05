package com.java.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product {
private int prodId;
private String prodName;
private double prodPrice;
@Autowired // written at Property level
private Category prodCategory;
@Autowired // written at Property leve/ this dependency is injected in the Product at runtime
@Qualifier("v2")
private Vendor prodVendor;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int prodId, String prodName, double prodPrice, Category prodCategory, Vendor prodVendor) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	this.prodCategory = prodCategory;
	this.prodVendor = prodVendor;
}
public Product(int prodId, String prodName, double prodPrice) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
public Category getProdCategory() {
	return prodCategory;
}
public void setProdCategory(Category prodCategory) {
	this.prodCategory = prodCategory;
}
public Vendor getProdVendor() {
	return prodVendor;
}
public void setProdVendor(Vendor prodVendor) {
	this.prodVendor = prodVendor;
}
@Override
public String toString() {
	return "\nProduct [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodCategory="
			+ prodCategory + ", prodVendor=" + prodVendor + "]";
}

}
