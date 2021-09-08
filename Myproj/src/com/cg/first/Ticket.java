package com.cg.first;

import java.lang.*;

public class Ticket{
	
	String first_name;
	String last_name;
	String gender;
	int age;
	double Weight;
	void displayName() {
	 
	System.out.println("First Name : " +first_name);
	System.out.println(" Last Name : " +last_name);
	System.out.println("Gender : " +gender);
	System.out.println("age : " +age);
	System.out.println(" Weight : " +Weight);
	
	
}
	public static void main(String arg[]) {
		Ticket obj1 = new Ticket();
		obj1.first_name= arg[0];
		obj1.last_name=arg[1];
		obj1.gender= arg[2];
		obj1.age= Integer.parseInt(arg[3]);
		obj1.Weight= Double.parseDouble(arg[4]);
		
		obj1.displayName();
	}
}
