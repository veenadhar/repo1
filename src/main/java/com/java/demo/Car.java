package com.java.demo;

import javax.print.attribute.standard.MediaSize.Engineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
private int carId;
private String carName;

private Battery battery;

private MusicSystem musicSystem;
private Engine engine;

private Electornics justForcompr;

static {// gets executed at the time of class load (only once).
	System.out.println("class Car loaded on method area. once at the time of class loading");
}
{
	System.out.println("gets executed at each object creation of Car");
}
public Car() {
	super();
	//System.out.println("No args constructor for class Car called");
}


@Autowired // constructor based autowiring
public Car(int carId, String carName, Battery battery, MusicSystem musicSystem, Engine engine,Electornics justForcompr) {
	super();
	System.out.println("Para constructor called. in class Ca");
	this.carId = carId;
	this.carName = carName;
	this.battery = battery;
	this.musicSystem = musicSystem;
	this.engine = engine;
	this.justForcompr=justForcompr;
	System.out.println("Para constructor called.");
	
}


public int getCarId() {
	return carId;
}


public void setCarId(int carId) {
	this.carId = carId;
}


public String getCarName() {
	return carName;
}


public void setCarName(String carName) {
	this.carName = carName;
}


public Battery getBattery() {
	return battery;
}


public void setBattery(@Qualifier("bt1")Battery battery) {
	this.battery = battery;
}


public MusicSystem getMusicSystem() {
	return musicSystem;
}


public void setMusicSystem(MusicSystem musicSystem) {
	this.musicSystem = musicSystem;
}


public Engine getEngine() {
	return engine;
}


public void setEngine(Engine engine) {
	this.engine = engine;
}


public Electornics getJustForcompr() {
	return justForcompr;
}

// setter based autowiring
public void setJustForcompr (@Qualifier("Elec") Electornics justForcompr) {
	this.justForcompr = justForcompr;
}


@Override
public String toString() {
	return "\nCar [carId=" + carId + ", carName=" + carName + ", battery=" + battery + ", musicSystem=" + musicSystem
			+ ", engine=" + engine + ", justForcompr=" + justForcompr + "]";
}

}
