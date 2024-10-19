package arrayex;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of friends u want:");
		int in=sc.nextInt();
		String b[]=new String[in];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.next();		}
		System.out.println("Element in array:");
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
