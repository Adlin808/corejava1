package com.edu.exce;
class EmployeeException extends Exception{
	public EmployeeException(String s) {
		super(s);
	}
}
class Employee{
	public void checkId(int eid) {
		try{
			if(eid<0 || eid>=999) {
				throw new EmployeeException("Invalid Employee ID");
			}else {
				System.out.println("Employee ID is valid");
			}
	}catch(EmployeeException e) {
		e.printStackTrace();
	}
		
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Employee eob=new Employee();
		eob.checkId(1000);
	}

}
