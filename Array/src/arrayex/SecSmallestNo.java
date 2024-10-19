package arrayex;
import java.util.Scanner;
public class SecSmallestNo {

	public static int getSecondSmallest(int[]a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[1];//return second smallest number
		//return a[total-2];//return second largest number
		

	}
	public static void main(String args[]) {
		
		int a[]= {12,3,78,20,1};
		int b[]= {44,76,45,87,67,89,54};
		System.out.println("Second smallest:"+getSecondSmallest(a,5));
		System.out.println("Second smallest:"+getSecondSmallest(b,7));
		
	}

}
