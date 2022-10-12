package com.xworkz.copy.boot;

import com.xworkz.copy.code.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer Developer1=new Developer();
		System.out.println(Developer1.name);
		System.out.println(Developer1.education);
		System.out.println(Developer1.experience);
		System.out.println(Developer1.salary);
		System.out.println(Developer1.company);
		
		Developer1.name="Raj";
		Developer1.education="Engineering";
		Developer1.experience=5;
		Developer1.salary=25000;
		Developer1.company="Cognizent";
		
		System.out.println(Developer1.name);
		System.out.println(Developer1.education);
		System.out.println(Developer1.experience);
		System.out.println(Developer1.salary);
		System.out.println(Developer1.company);
		

	}

}
