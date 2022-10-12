package com.xworkz.copy.boot;

import com.xworkz.copy.code.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
	  Chocolate Chocolate1 = new Chocolate();
	  System.out.println(Chocolate1.name);
	  System.out.println(Chocolate1.brand);
	  System.out.println(Chocolate1.flavour);
	  System.out.println(Chocolate1.price);
	  Chocolate1.name="cadbury";
	  Chocolate1.brand="kitkat";
	  Chocolate1.flavour="vanila";
	  Chocolate1.price=30;
	  System.out.println(Chocolate1.name);
	  System.out.println(Chocolate1.brand);
	  System.out.println(Chocolate1.flavour);
	  System.out.println(Chocolate1.price);

	}

}
