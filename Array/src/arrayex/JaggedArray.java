package arrayex;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] jaggedArray=new int[4][];
		jaggedArray[0]=new int[] {1,4,5};
		jaggedArray[1]=new int[] {5,6,7,8};
		jaggedArray[2]=new int[] {8,9};
		jaggedArray[3]=new int[] {10,11,12,13};
		System.out.println("Length: "+jaggedArray.length);
		for(int i=0;i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.print(jaggedArray[i][j]+ " ");
				
			}
			System.out.println();
			
		}


		}

}
