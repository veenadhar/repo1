package com.java.demo;

public class Engine {
private int engineId;
private String enginePart1;
private String enginePart2;
static {// gets executed at the time of class load (only once).
	System.out.println("class Engine loaded on method area. once at the time of class loading");
}
{
	System.out.println("gets executed at each object creation of Engine");
}
public Engine() {
	super();
	//System.out.println("No arg constructor of class Engine called.");
}
public Engine(int engineId, String enginePart1, String enginePart2) {
	super();
	this.engineId = engineId;
	this.enginePart1 = enginePart1;
	this.enginePart2 = enginePart2;
}
public int getEngineId() {
	return engineId;
}
public void setEngineId(int engineId) {
	this.engineId = engineId;
}
public String getEnginePart1() {
	return enginePart1;
}
public void setEnginePart1(String enginePart1) {
	this.enginePart1 = enginePart1;
}
public String getEnginePart2() {
	return enginePart2;
}
public void setEnginePart2(String enginePart2) {
	this.enginePart2 = enginePart2;
}
@Override
public String toString() {
	return "\nEngine [engineId=" + engineId + ", enginePart1=" + enginePart1 + ", enginePart2=" + enginePart2 + "]";
}


}
