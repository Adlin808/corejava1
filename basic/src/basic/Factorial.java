package basic;
import java.util.Scanner;

public class Factorial {
	

	public static void main(String[] args) {
		int factorial=1;
		//int number=6;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {//1*1=1---1*2=2----2*3=6----6*4=24----24*5=120
			factorial=factorial*i;}
			System.out.println("Factorial of number:"+factorial);
			
		}
		
		

	}


