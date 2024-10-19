package com.edu.exce;

public class MainApp {
	public static void main(String[] args) {
		int a=10, b=0, c=0;
		System.out.println("Before division");
		try {
			c=a/b;//c=10/0=5//exception:run time error
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			}
		System.out.println("c="+c);
		System.out.println("After Division");
    }
}