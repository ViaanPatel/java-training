package com.digitek.business;

public class IfElseStatement {

	public static void main(String[] args) {
		ReportCard(50);
	}
		public static void ReportCard(int marks) {
		
		if(marks > 35) {
			System.out.println("result:"+ "pass");
			
		}else {
			System.out.println("result:" + "fail");
		}
	}
		
	}
