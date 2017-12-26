package com.digitek.business;

public class MathOperation {

	public static void main(String[] args) {
	
		
   MathOperation ae = new MathOperation();
   
  int result1 = ae.addTwoNumbers(); 
   int result2 = ae.addThreeNumbers();
   
   MathOperation.addResult(result1, result2);
   ae.addDecimals();
   
   
   
   
   }
   
   public static int addTwoNumbers() {
           
           int a = 10;
           int b = 20;
           int result = a+b;
           System.out.println("result of 2 numbers:" + result);
                   return result;
       }
    
       public static int addThreeNumbers() {
           
           int a = 10;
           int b = 20;
           int c = 30;
           int result = a+b+c;
           System.out.println("result of 3 numbers:" + result);
           return result ;
	}
       
       public static int addResult(int result1, int result2) {
    	   int result = result1 + result2;
    	   
    	   System.out.println("sum of two result "+ result);
    	   
		return result;   
       }
       
       public static double addDecimals() {
		 
    	   double a = 13.666;
    	   double b = 11.555;
    	   double result = a+b;
    	   System.out.print("sum of two decimals numbers " + result);
		return result;
    	   
    	   
    	   
    	   
       }
       
       
       
       
       
       
       

}
