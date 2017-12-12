package com.digitek.business;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MathOperation ae = new MathOperation();
   ae.addTwoNumbers();
   ae.addThreeNumbers();
   }
   
   public static void addTwoNumbers() {
           
           int a = 10;
           int b = 20;
           int result = a+b;
           System.out.println("result of 2 numbers:" + result);
                   
       }
       
       public static void addThreeNumbers() {
           
           int a = 10;
           int b = 20;
           int c = 30;
           int result = a+b+c;
           System.out.println("result of 3 numbers:" + result);
	}

}
