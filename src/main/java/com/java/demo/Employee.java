package com.java.demo;

public class Employee {
private int empId;
private String empName;
private double empSalary;
private String empRole;
static {
	System.out.println("static block gets executed when the Employee class gets laoded on method area.");
}
{
	System.out.println("instance block gets excuted at object creation");
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, double empSalary, String empRole) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empRole = empRole;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpRole() {
	return empRole;
}
public void setEmpRole(String empRole) {
	this.empRole = empRole;
}
@Override
public String toString() {
	return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empRole=" + empRole
			+ "]";
}


}
