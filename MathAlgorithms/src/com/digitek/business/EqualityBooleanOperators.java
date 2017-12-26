package com.digitek.business;


//Equality Operators
//== equal to
//!+ not equal to

//Boolean Operators
//> greater than
//>+ greater than or equal to
//< less than
//<+ less then or equal to


public class EqualityBooleanOperators {
	
	static int number1 = 20;
	static int number2 = 40;
	static int number3 = 60;
	
	public static void main(String[] args) {
		
		equalityOperators1();
		booleanOperator();
	}

	private static void equalityOperators1() {
		System.out.println("Relation Operator:");
		
		System.out.print("compait number1==number2:"+ (number1 == number2));
		
		System.out.print("compait number1==number2:"+ (number1 != number2));
		
		}
	
	private static void booleanOperator() {
		// greater than >
		
		System.out.println("Checking > operator");
		System.out.println("number1 > number2:" + (number1 > number2));
		System.out.println("number2 > number3:" + (number2 > number3));
		System.out.println("number3 > number1:" + (number3 > number1));
		
		//greater than or equal to >=
		System.out.println("Checking >= operator");
		System.out.println("number1 >= number2:" + (number1 >= number2));
		System.out.println("number2 >= number3:" + (number2 >= number3));
		System.out.println("number3 >= number1:" + (number3 >= number1));
		
		
		//less than operator
		System.out.println("Checking < operator");
		System.out.println("number1 < number2:" + (number1 < number2));
		System.out.println("number2 < number3:" + (number2 < number3));
		System.out.println("number3 < number1:" + (number3 < number1));
		
		
		//less than or equal to <=
		
		System.out.println("Checking <= operator");
		System.out.println("number1 <= number2:" + (number1 <= number2));
		System.out.println("number2 <= number3:" + (number2 <= number3));
		System.out.println("number3 <= number1:" + (number3 <= number1));
		
		
		
	}
	

}
