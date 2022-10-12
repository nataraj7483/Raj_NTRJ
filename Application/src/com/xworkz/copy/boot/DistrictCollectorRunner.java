package com.xworkz.copy.boot;

import com.xworkz.copy.code.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector chitradurga=new DistrictCollector();
		
		System.out.println(chitradurga.name);
		System.out.println(chitradurga.age);
		System.out.println(chitradurga.district);
		System.out.println(chitradurga.batchNo);
		
		chitradurga.name="Raj";
		chitradurga.age=25;
		chitradurga.district="Chitradurga";
		chitradurga.batchNo=123;
		
		System.out.println(chitradurga.name);
		System.out.println(chitradurga.age);
		System.out.println(chitradurga.district);
		System.out.println(chitradurga.batchNo);
		

	}

}
