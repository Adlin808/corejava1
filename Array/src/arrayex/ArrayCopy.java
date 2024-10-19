package arrayex;

public class ArrayCopy {

	public static void main(String[] args) {
		//single dimensional---Deep copy----Address are different
		int intArray[]= {0,1,2,3,4,5,6,7,8,9};
		int cloneArray[]=intArray.clone();
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++) {
			System.out.print(cloneArray[i]+" ");
		}
		
        //Multidimensional----Shallow copy----Address same
		int intArray1[][]= {{1,2,3,4,5},{6,7,8,9,0}};
		int cloneArray1[][]=intArray1.clone();
		System.out.println(intArray1[0][0]==cloneArray1[0][0]);
	}

}
