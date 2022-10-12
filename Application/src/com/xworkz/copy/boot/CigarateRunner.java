package com.xworkz.copy.boot;

import com.xworkz.copy.code.Cigarate;

public class CigarateRunner {

	public static void main(String[] args) {
		
		 Cigarate smoke=new Cigarate();
	      
	      System.out.println(smoke.type);
	      System.out.println(smoke.price);
	      System.out.println(smoke.color);
	      System.out.println(smoke.weight);
	      System.out.println(smoke.taste);
	      System.out.println(smoke.brand);
	      System.out.println(smoke.quantity);
	      System.out.println(smoke.location);
	      System.out.println(smoke.expiredate);
	      System.out.println(smoke.manufacturedate);
	      System.out.println(smoke.manufactureplace);
	      System.out.println(smoke.disadvantages);
	      System.out.println(smoke.uses);
	      System.out.println(smoke.disease);
	      
	      System.out.println("////////////////////////////////////////////////////////////");
	      
	      smoke.expiredate=2022;
	      smoke.manufacturedate=2021;
	      smoke.manufactureplace="Karnataka";
	      smoke.disadvantages="Cancer";
	      
	      
	      System.out.println(smoke.expiredate);
	      System.out.println(smoke.manufacturedate);
	      System.out.println(smoke.manufactureplace);
	      System.out.println(smoke.disadvantages);
	      System.out.println(smoke.uses);
	      System.out.println(smoke.disease);
	      
	      Cigarate smoke1=new Cigarate();
	      smoke1.brand="Redlable";
	      System.out.println(smoke.brand);
	      
	     

	}

}
