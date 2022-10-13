package com.xworkz.copy.boot;

import com.xworkz.copy.code.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat=new Boat();
		System.out.println(boat.name);
		System.out.println(boat.type);
		System.out.println(boat.companyName);
		System.out.println(boat.color);
		System.out.println(boat.owner);

		boat.name="Bluetooth";
		boat.companyName="Boat";
		boat.color="Red";
		boat.owner="NTRJ";
		
		System.out.println(boat.name);
		System.out.println(boat.companyName);
		System.out.println(boat.color);
		System.out.println(boat.owner);

		
		
		
		
	}

}
