package com.edu.exce;
import java.util.Scanner;
public class DividebyZero {
	
	public static void main(String[] args) {
		float a,b,c=0;
		System.out.println("Enter a,b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Before Division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("c="+c);
		System.out.println("After division");
	}
}
		