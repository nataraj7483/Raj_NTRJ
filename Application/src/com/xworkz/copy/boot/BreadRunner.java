package com.xworkz.copy.boot;

import com.xworkz.copy.code.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread=new Bread();
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		bread.type="Bread";
		bread.shape='M';
		bread.price=25;
		bread.quantity=2.0;
		bread.companyName="NTRJ";
		
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		

		
	
		

	}

}
