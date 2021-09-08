package com.cg.first;

import java.lang.*;

public class Meena{
	
	
	int number;
	
	void displayName() {
		
		if(number>0)
		{
			System.out.println("Positive ");
		}
		else
		{
			System.out.println("Negative");
		}
	 
	
	
	
}
	public static void main(String arg[]) {
		Meena obj1 = new Meena();
		obj1.number= Integer.parseInt(arg[0]);
		
		
		obj1.displayName();
	}
}
