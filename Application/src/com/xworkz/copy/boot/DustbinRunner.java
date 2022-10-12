package com.xworkz.copy.boot;

import com.xworkz.copy.code.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		 Dustbin swatch=new Dustbin();
	      
	      System.out.println(swatch.type);
	      System.out.println(swatch.price);
	      System.out.println(swatch.color);
	      System.out.println(swatch.weight);
	  
	      System.out.println(swatch.brand);
	      System.out.println(swatch.quantity);
	      System.out.println(swatch.location);
	      System.out.println(swatch.expiredate);
	      System.out.println(swatch.manufacturedate);
	      System.out.println(swatch.manufactureplace);
	      System.out.println(swatch.benifits);
	      System.out.println(swatch.advantages);
	      System.out.println(swatch.disadvantages);
	      System.out.println(swatch.uses);
	      System.out.println(swatch.disease);
	      
	      System.out.println("////////////////////////////////////////////////////////////");
	      
	      swatch.expiredate=2022;
	      swatch.manufacturedate=2021;
	      swatch.benifits="Helthy";
	      swatch.manufactureplace="Karnataka";
	      swatch.advantages="Store waste";
	     
	      swatch.uses="To keep place clean";
	      
	      System.out.println(swatch.expiredate);
	      System.out.println(swatch.manufacturedate);
	      System.out.println(swatch.manufactureplace);
	      System.out.println(swatch.benifits);
	      System.out.println(swatch.advantages);
	      
	      System.out.println(swatch.uses);
	      
	      
	      Dustbin swatch1=new Dustbin();
	      swatch1.brand="Kia";
	      System.out.println(swatch.brand);
	      
	     

	}

}
