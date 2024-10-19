//Throw keyword is used to throw user defined error message
package com.edu.exce;
import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		try {
			if(b==0) {
				throw new ArithmeticException("Divide by Zero error");
				
			}//if ends
			else {
				c=a/b;
				System.out.println("Answer for a/b is:"+c);}
		}//try ends
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		}
	}


