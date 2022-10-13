package com.xworkz.copy.code;

public class Fish {
	
	public String name;
	public boolean type;
	public int price;
	public double weight;
	public float length;
	
	public Fish() {
		System.out.println("Fish fray");
		
	}
	public Fish(String name) {
		
		this.name=name;
		System.out.println("Ragu meenu");
		
	}
	public Fish(boolean type) {
		this.type=type;
		
	}
	public Fish(int price) {
    
		this.price=price;
		
	}
	public Fish(double weight) {
		
		this.weight=weight;
	}
	public Fish(float length) {
		
		this.length=length;
	}
	public Fish(String name, int price) {
		this.name=name;
		this.price=price;
		
	}
	public Fish(boolean type, double weight) {
		this.type=type;
		this.weight=weight;
	}
	public Fish(float length, int price, double weight) {
		this.length=length;
		this.price=price;
		this.weight=weight;
	}

}
