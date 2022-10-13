package com.xworkz.copy.boot;

import com.xworkz.copy.code.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish = new Fish("Gouri meenu");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("true");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish(250);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish(1.5);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish(1.6);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("Gouri meenu",250);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("true,1.5");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		fish=new Fish("1.6, 250,1.5");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		
		
		
		
		}

}
