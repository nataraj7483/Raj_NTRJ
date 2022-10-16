package com.xworkz.copy.code;

public class Tractor {
	
	public String name;
	public String brand;
	public long price;
	public String color;
	public int hp;
	public String model;
	
	public Tractor()
	{
		System.out.println("default constructor is printing");
	}
	
	public Tractor(String name,long price)
	{
		this.name=name;
		this.price=price;
		 System.out.println("Entered Tractor name and Brand");
		
	}
	
	public Tractor(long price,String name,String brand) {
	 this(name, price);
	 this.brand=brand;
	 System.out.println("Entered Tractor name,Brand and Color");
	}
	public Tractor( String name,long price, String brand ,int hp) {
		this(price,name,brand);
		this.hp=hp;
		 System.out.println("Entered Tractor name,price, Brand and hp");
		
	}
	public Tractor(String name,long price,String brand,int hp,String model) {
		this(brand,price,name,hp);
		this.model=model;
		 System.out.println("Entered Tractor name, Brand,hp and model");
	}
	public Tractor(String name, long price, String brand,int hp, String model, String color) {
		this(name,price,model,hp,brand);
		this.color=color;
		 System.out.println("Entered Tractor name, Brand,hp,model and color");
	}
	public Tractor(String name) {
		this.name=name;
		 System.out.println("Entered Tractor name");
	}
	
	
	
}
