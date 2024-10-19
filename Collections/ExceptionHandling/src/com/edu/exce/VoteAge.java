package com.edu.exce;
import java.util.Scanner;

public class VoteAge { 
	public static void checkAge(int age) {
		try {
			if(age<18) {
				throw new ArithmeticException("Not eligible for voting");
				
			}
			else {
				System.out.println("You are eligible for voting");
			}
		}//try
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		int personAge;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age;");
		personAge=sc.nextInt();
		checkAge(personAge);
	}
}
