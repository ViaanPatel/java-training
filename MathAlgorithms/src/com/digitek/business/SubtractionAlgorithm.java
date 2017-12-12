package com.digitek.business;

public class SubtractionAlgorithm
{
	//Addition Method - Example One
	public void additionExampleOne()
	{
		//Variables
		int a = 20;
		int b = 30;
		
		//Sum Variable
		int result = a - b;
		
		//Output
		System.out.println("a = " + a +" & b = " + b);
		System.out.println("Sum of a and b = " + result);
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		//Declare Class
		SubtractionAlgorithm add = new SubtractionAlgorithm();
		add.additionExampleOne(); //add additionExampleOne method to main
		
		
		
	}
}
