package com.capgemini.lesson9;

public class Sample {

	public static void main(String[] args) {
		int num1, num2, res;
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			res = num1 / num2;
			System.out.println(res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1st Catch ArrayIndex issue handled");
			String msg = e.getMessage();
			if (msg.equals("1")) {
				num1 = Integer.parseInt(args[0]);
				num2 = 1;
				res = num1 / num2;
				System.out.println(res);
			} else if (msg.equals("0")) {
				num1 = 10;
				num2 = 1;
				res = num1 / num2;
				System.out.println(res);
			} else {
				System.out.println(e);
			}

		} catch (ArithmeticException e) {
			System.out.println("2nd Catch Arithmetic issue handled");
			System.out.println(e.getMessage());
			//num1 = Integer.parseInt(args[0]);
			//num2 = 1;
			//res = num1 / num2;
			//System.out.println(res);
		} catch (NumberFormatException e) {
			System.out.println("3rd catch Number format Exception handled");
			//System.out.println(e.getMessage());
			System.out.println(10/1);
		} catch (Exception e) {
			System.out.println("4th catch General Exception");
			System.out.println(e);
		}

	}

}

