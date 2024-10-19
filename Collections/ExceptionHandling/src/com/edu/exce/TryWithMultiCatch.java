package com.edu.exce;

public class TryWithMultiCatch {
	public static void main(String[] args) {
		int a=10, b=2, c=0;
		int ar[]= {5,7,8,1,2};
		try {
			c=a/b;//exception
			ar[7]=34;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();	
		}
	   //catch(ArrayIndexOutOfBoundsException e) {
		//e.printStackTrace();
	//}
	   finally {
		System.out.println("Finally block executes always");
	}
	
	}
}
