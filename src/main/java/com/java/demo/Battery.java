package com.java.demo;

public class Battery extends Electornics{
private int batteryId;
private String batteryName;
static {// gets executed at the time of class load (only once).
	System.out.println("class Battery loaded on method area. once at the time of class loading");
}
{
	System.out.println("gets executed at each object creation of Battery");
}
public Battery() {
	super();
	//System.out.println("No arg constructor of class Battery called.");
}

public Battery(int electronicC1, String electronicC2,  int batteryId, String batteryName) {
	
	super(electronicC1,electronicC2);
	this.batteryId = batteryId;
	this.batteryName = batteryName;
	System.out.println("Para Constructor called");
}

public Battery(int batteryId, String batteryName) {
	super();
	this.batteryId = batteryId;
	this.batteryName = batteryName;
}
public int getBatteryId() {
	return batteryId;
}
public void setBatteryId(int batteryId) {
	this.batteryId = batteryId;
}
public String getBatteryName() {
	return batteryName;
}
public void setBatteryName(String batteryName) {
	this.batteryName = batteryName;
}
@Override
public String toString() {
	return "\nBattery [batteryId=" + batteryId + ", batteryName=" + batteryName + "]" + super.toString() ;
}

}
