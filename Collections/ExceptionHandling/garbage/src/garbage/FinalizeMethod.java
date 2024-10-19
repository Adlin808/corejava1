package garbage;

public class FinalizeMethod {
	String s;
	public FinalizeMethod(String s) {//parameterized constructor
		this.s=s;
	}
	

	public static void main(String[] args) {
		FinalizeMethod obj1=new FinalizeMethod("t1");
		FinalizeMethod obj2=new FinalizeMethod("t2");
		obj1=obj2;
		obj1=null;
		obj2=null;
		System.gc();
		
		// TODO Auto-generated method stub

	}
	protected void finalize() {
		System.out.println("Object previously referenced by "+ this.s +" is successfully garbage collected.");
	}

}
