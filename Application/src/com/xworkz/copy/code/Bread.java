package com.xworkz.copy.code;

public class Bread {
	public String type;
	public char shape;
	public int price;
	public double quantity ;
	public String companyName;
	
	public Bread(){
		System.out.println("//////////////////////");
	}
	public Bread(String type) {
		
		this.type=type;
		System.out.println("///////////////////////////////////");
		
	}
	public Bread(char shape) {
		this.shape=shape;
		
		
	}
	public Bread(int price) {
    
		this.price=price;
		
	}
	public Bread(double quantity) {
		this.quantity=quantity;
	}
	public Bread(String companyName,int price) {
		this.companyName=companyName;
		this.price=price;
	}
	public Bread(String type,char shape ) {
		this.type=type;
		this.shape=shape;
		
	}
	public Bread(double quantity,int price ) {
		this.quantity=quantity;
		this.price=price;
	}
	public Bread(String type,int price,String companyName) {
		this.type=type;
		this.price=price;
		this.companyName=companyName;
	}


}
