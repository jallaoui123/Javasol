package com.qa.helloworld;

public class Conditionals {

	public static String div(double num1, double num2) {
		String result;

		if (num1 < num2) {
			result = "" + num1 / num2;
			return result;
		} else {
			result = "This cannot be performed";
			return result;
		}

	}
public static void main(String[] args) { 
	System.out.println(div(1,2));
	
	
}
}
