package com.xworkz.copy.boot;
import com.xworkz.copy.code.Tea;
public class TeaRunner {

	public static void main(String[] args) {
		  
      Tea property=new Tea();
      System.out.println(property.name);
      System.out.println(property.type);
      System.out.println(property.price);
      System.out.println(property.color);
      System.out.println(property.weight);
      System.out.println(property.taste);
      System.out.println(property.brand);
      System.out.println(property.quantity);
      System.out.println(property.location);
      System.out.println(property.expiredate);
      System.out.println(property.manufacturedate);
      System.out.println(property.manufactureplace);
      System.out.println(property.benifits);
      System.out.println(property.advantages);
      System.out.println(property.disadvantages);
      System.out.println(property.uses);
      System.out.println(property.disease);
      
      System.out.println("////////////////////////////////////////////////////////////");
      
      property.expiredate=2022;
      property.manufacturedate=2021;
      property.benifits="Helthy";
      property.manufactureplace="Karnataka";
      property.advantages="Mind Relacks";
      property.disadvantages="Cancer";
      property.uses="Boost your humun system";
      
      System.out.println(property.expiredate);
      System.out.println(property.manufacturedate);
      System.out.println(property.manufactureplace);
      System.out.println(property.benifits);
      System.out.println(property.advantages);
      System.out.println(property.disadvantages);
      System.out.println(property.uses);
      System.out.println(property.disease);
      
      Tea property1=new Tea();
      property1.brand="Redlable";
      System.out.println(property1.brand);
      
     
	}

}
