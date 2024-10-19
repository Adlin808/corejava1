package com.edu.exce;

public class RunTimeException {

	public static void main(String[] args) {
		int a=10,b=2;
				float c;
		try {
			c=a/b;
			System.out.println("Value of C:"+c);
			int arr[]= {1,2,3,4};
			System.out.println("Value of arr[5]:"+arr[2]);
			String s="123";
			//String s="rtyu";
			System.out.println("Convert into number:"+Integer.parseInt(s));
		    String str="Hello";
			//String str=null;
			System.out.println("Length:"+str.length());
			int[] array=new int[-3];
			System.out.println("Array length:"+array.length);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException c1) {
			System.out.println(c1);
			
		}
		catch(NumberFormatException e2) {
			System.out.println(e2);
		}
		catch(NullPointerException e3) {
			System.out.println(e3);
		}
		catch(NegativeArraySizeException e4) {
			System.out.println(e4);
		}
		finally {
			System.out.println("End of program");
		}

	}

}
