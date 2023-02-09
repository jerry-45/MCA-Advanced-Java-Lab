package com.hiraymca;

public class Employee {
	private String ename;
	private int eage;
	private int esal;
	
	public Employee(String ename, int eage, int esal) {
		super();
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
	}
	
	public Employee()
	{
		this.ename="Dukhiram";
		this.eage=75;
		this.esal=5000;
	}
	
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
	
	public void display()
	{
		System.out.println("Name="+ename);
		System.out.println("Age="+eage);
		System.out.println("Salary="+esal);
	}
}
