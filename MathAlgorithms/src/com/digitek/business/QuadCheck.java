package com.digitek.business;

import java.util.Scanner;

public class QuadCheck {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//Declare Variables
		double a = 1;
		double b = 5;
		double c = 6;
		
		double disc = 0; // store a temporary value to check
		
		double x1 = 0;
		double x2 =0;
		//Take Input 
		System.out.println("Input the value a, b and c for ax^2+b+c =0");
		System.out.print("Input a: ");
		a = s.nextDouble();
		System.out.print("Input b: ");
		b = s.nextDouble();
		System.out.print("Input c: ");
		c = s.nextDouble();
		
		
		// process Input
		disc = Math.pow(b,2)-4*a*c;
		if (disc > 0) {
		x1 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 =(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		//out put result
		System.out.println(" x1 =" + x1);
		System.out.println(" x2 =" + x2);
		}
		else if (disc== 0) {
			x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("There is one real root at x="+x1);
		}
		else {
		System.out.println("There are no real roots");
		}
		
	}

}
