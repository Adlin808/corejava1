package com.edu.exce;

public class ArrMain {
	public static void main(String[] args) {
		int a[]= {6,4,2};
		System.out.println("Before Array element display");
		System.out.println("First element"+a[0]);
		System.out.println("second element"+a[1]);
		System.out.println("Third element"+a[2]);
		try {
			System.out.println("Fourth element"+a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
			
		}
		System.out.println("Hello everyone");
		
	}  

	
		
	
}
