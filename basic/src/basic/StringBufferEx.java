package basic;

public class StringBufferEx {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   //Mutable:we can change-->synchronization 
	//StringBuffer sb=new StringBuffer("Hi "); //synchronization
	   //StringBuilder is Aysnchronous and faster compare to String Buffer
	    StringBuilder sb=new StringBuilder("Hello");
		//StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("My String Before append  : "+sb);
		sb.append(" Everyone");
		System.out.println("My String after append  : "+sb);
		//System.out.println("Reverse String : "+sb.reverse());
		sb.insert(8, " learner");
		System.out.println("My String after insert  : "+sb);
		sb.delete(4, 10);
		System.out.println("My String after delete  : "+sb);
				
			}


		}


	


