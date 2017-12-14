package com.digitek.business;

public class QuadCheck {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		//Declare Variables
		double a = 1;
		double b = 5;
		double c = 6;
		
		double disc = 0; // store a temporary value to check
		
		double x1 = 0;
		double x2 =0;
		//Take Input - Do this later
		
		
		// process Input
		disc = Math.pow(b,2)-4*a*c;
		
		if (disc >= 0) {
		x1 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 =(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		//out put result
		System.out.println(" x1 =" + x1);
		System.out.println(" x2 =" + x2);
		}		
		else {
		System.out.println("There are no real roots");
		}
		
	}

}
