package com.java.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Electornics {
private int electronicC1;
private String electronicC2;
static {// gets executed at the time of class load (only once).
	System.out.println("class Electronics loaded on method area. once at the time of class loading");
}
{
	System.out.println("gets executed at each object creation of Electronics");
}
public Electornics() {
	super();
	//System.out.println("No arg constructor of class Electronics called.");
}


public Electornics(int electronicC1, String electronicC2) {
	super();
	this.electronicC1 = electronicC1;
	this.electronicC2 = electronicC2;
	System.out.println("Para Constructor called");
}

public int getElectronicC1() {
	return electronicC1;
}
public void setElectronicC1(int electronicC1) {
	this.electronicC1 = electronicC1;
}
public String getElectronicC2() {
	return electronicC2;
}
public void setElectronicC2(String electronicC2) {
	this.electronicC2 = electronicC2;
}
@Override
public String toString() {
	return "\nElectornics [electronicC1=" + electronicC1 + ", electronicC2=" + electronicC2 + "]";
}



}
