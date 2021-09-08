package com.cg.first;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class day1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the zip code:");
		String input  = scanner.nextLine();
		
		Pattern pattern= Pattern.compile("[0-9]{6}");
		Matcher matcher= pattern.matcher(input);
		
		if (matcher.find()) {
			System.out.println("Matched");
		}
		
		else {
			System.out.println("Not Matched");
		}
		
		scanner.close();

	}

}
