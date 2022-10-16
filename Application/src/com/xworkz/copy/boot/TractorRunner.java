package com.xworkz.copy.boot;

import com.xworkz.copy.code.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
	
		 Tractor tractor= new Tractor("Sonalika",700000);
		 System.out.println(tractor.name);
		 System.out.println(tractor.brand);
		 System.out.println(tractor.price);
		 System.out.println(tractor.color);
		 System.out.println(tractor.hp);
		 System.out.println(tractor.model);
		 
		 tractor=new Tractor(7000000,"Sonalika","sona");
		 System.out.println(tractor.price);
		 System.out.println(tractor.name);
		 System.out.println(tractor.brand);
		 
		 tractor=new Tractor("Sonalika",7000000,"sona",120);
		 System.out.println(tractor.name);
		 System.out.println(tractor.price);
		 System.out.println(tractor.brand);
		 System.out.println(tractor.hp);
		 
		 tractor=new Tractor("Sonalika",700000,"sona",120,"Rx 42 Mahabali");
		 System.out.println(tractor.name);
		 System.out.println(tractor.price);
		 System.out.println(tractor.brand);
		 System.out.println(tractor.hp);
		 System.out.println(tractor.model);
		 
		 tractor=new Tractor("Sonalika",700000,"sona",120,"Rx 42 Mahabali","Blue");
		 System.out.println(tractor.name);
		 System.out.println(tractor.price);
		 System.out.println(tractor.brand);
		 System.out.println(tractor.hp);
		 System.out.println(tractor.model);
		 System.out.println(tractor.color);
		 
		 tractor=new Tractor("Sonalika");
		 System.out.println(tractor.name);
		 
		 
		 
		 

	}

}
