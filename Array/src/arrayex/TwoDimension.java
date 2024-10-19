package arrayex;
import java.util.Scanner;
public class TwoDimension {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter length of columns:");
		int col=sc.nextInt();
		int arr[][]=new int[rows][col];
		int a[]=new int[5];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for (int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
				
		
		
		// TODO Auto-generated method stub

	}
	}
}
