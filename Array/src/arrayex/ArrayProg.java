package arrayex;
import java.util.Scanner;

public class ArrayProg {
	//array is immutable

	public static void main(String[] args) {
		int a[]= {1,2,3};//fixed element
		System.out.println("a[1] : " +a[1]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
		int b[]=new int[4];//dynamic
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
			}
		System.out.println("Element in my array B:");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	

	}

}
