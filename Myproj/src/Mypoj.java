package com.cg.first;
import java.lang.*;

public class Mypoj{
	
	String first_name;
	String last_name;
	String full_name;
	void displayName() {
	full_name= first_name + ""+ last_name; 
	System.out.println("Full Name : " +full_name);
}
	public static void main(String args[]) {
		Mypoj obj1 = new Mypoj();
		obj1.first_name="Meenakshi ";
		obj1.last_name="Viswanadha";
		obj1.displayName();
	}
}
