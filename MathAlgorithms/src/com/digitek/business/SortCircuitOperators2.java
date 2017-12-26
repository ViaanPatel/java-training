package com.digitek.business;
/*
 * && And operator
 * //  OR operator
 *
 */

public class SortCircuitOperators2 {

private static void ShortCircuitOperators2() {
ShortCircuitOperators2();
	
}

public static void shortCircuitOperators2() {

int number1= 10;
int number2 = 40;
int number3 = 30;

// && operator looks for the first false expression and gets out of the comparison check
boolean resultAND = (number1 < number2) && compare2And3(number2, number3);
System.out.println("resultAND:" + resultAND);

// || operator looks for the first true expression and gets out of the comparison check
boolean resultOR = (number1 > number2) || compare2And3(number2, number3)|| compare2And3(number2, number1);
System.out.println("resultAND:" + resultOR);

}

private static boolean compare2And3(int number2, int number3) 
{
     System.out.println("compare2And3");
     return  number2 < number3;
  
}
     
}
