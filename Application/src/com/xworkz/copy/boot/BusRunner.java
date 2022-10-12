package com.xworkz.copy.boot;

import com.xworkz.copy.code.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus bmtc=new Bus();
		System.out.println(bmtc.busNo);
		System.out.println(bmtc.starting);
		System.out.println(bmtc.destination);
		
		bmtc.busNo=2022;
		bmtc.starting="Koramangala";
		bmtc.destination="Mjestic";
		
		System.out.println(bmtc.busNo);
		System.out.println(bmtc.starting);
		System.out.println(bmtc.destination);
		
		
		

	}

}
