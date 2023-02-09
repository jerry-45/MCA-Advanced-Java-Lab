package com.hiraymca;

public class Employee {
	private String ename;
	private int eage;
	private int esal;
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEage() {
		return eage;
	}
	
	public void setEage(int eage) {
		this.eage = eage;
	}
	
	public int getEsal() {
		return esal;
	}
	
	public void setEsal(int esal) {
		this.esal = esal;
	}
	
	public void display() {
		System.out.println("Name: " + ename +
				"\nAge: " + eage + "\nSalary: " + esal);
	}
}
