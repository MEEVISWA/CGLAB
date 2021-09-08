package com.capgemini.lesson9;

class Labjava {
	static void procA() throws RuntimeException {
		try {
		String str = "Hello";
		System.out.println(str);
		str.equals("Hello");
		procB();
		System.out.println("Here....");
		}catch (RuntimeException e) {
			System.out.println("Handling ex in A");
		}
	}

	static void procB()throws RuntimeException{
		System.out.println("B");
		throw new RuntimeException();
	}
	
	public static void main(String a[]) {
		try {
			procA();
		} catch (RuntimeException e) {
			System.out.println("Caught RE");
		}
		
	}
}
