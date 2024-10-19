package com.edu.exce;
import java.util.Scanner;

class AgeCheckVoting extends Exception
{
	public AgeCheckVoting(String s) {
		super(s);//call super(exception)
   //class constructor{
	   
    }
}


class PersonAge{
	int age;
	void inputAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Age:");
		age=sc.nextInt();
		try {
			if(age<18) {
				throw new AgeCheckVoting("Not eligible for voting");
			}
			else {
				System.out.println("Eligible for voting");
			}
		}
		catch(AgeCheckVoting e) {
			e.printStackTrace();
		}
	}
}

public class CustomException {
	public static void main(String[] args){
		PersonAge ob=new PersonAge();
		ob.inputAge();
	}
  }


