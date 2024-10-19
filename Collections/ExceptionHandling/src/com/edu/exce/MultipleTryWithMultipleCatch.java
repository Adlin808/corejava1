package com.edu.exce;

public class MultipleTryWithMultipleCatch {
	public static void main(String[] args) {
		int a=10, b=0, c=0;
		int ar[]= {5,7,8,1,2};
		try {
			c=a/b;//exception
		}
		catch(ArithmeticException e) {
			e.printStackTrace();	
		}
		try {
			ar[9]=34;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	
	
}
