package com.xworkz.copy.code;

public class Boat {
	
	public String name;
	public String color;
	public String companyName;
	public char type ;
	public String owner;
	
	public Boat() {
		System.out.println("Headphone");
		
	}
	public Boat(String name) {
		
		this.name=name;
		System.out.println("Boat");
		
	}
	public Boat(String color,char type) {
		this.color=color;
		this.type=type;
		
	}
	public Boat(String companyName,char type,String owner) {
    
		this.companyName=companyName;
		this.type=type;
		this.owner=owner;
		
	}
	public Boat(char type,String color) {
		this.type=type;
		this.color=color;
	}
	public Boat( String color, String name) {
		this.color=color;
		this.name=name;
	}
	public Boat(char type, String companyName, String name, String color ) {
		this.type=type;
		this.companyName=companyName;
		this.name=name;
		this.color=color;
		
	}
	public Boat(String owner,char type,String name,String color ) {
		this.owner=owner;
		this.type=type;
		this.name=name;
		this.color=color;
	}
	public Boat(String name,char type,String color, String companyName, String owner) {
		this.name=name;
		this.type=type;
		this.color=color;
		this.companyName=companyName;
		this.owner=owner;
	}


}
