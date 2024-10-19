
package com.edu;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class EduStudent{
	int sid;
	String sname;
	float sfees;
	public EduStudent(int sid, String sname, float sfees) {
		super(); //Object class constructor is called
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "EduStudent [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	}
class StudentSortSid implements Comparator<EduStudent>{

	@Override
	public int compare(EduStudent o1, EduStudent o2) {
		if(o1.sid==o2.sid) 
			return 0;
		else if(o1.sid<o2.sid)
			return -1;
		else
			return 1;				
	
}
	

}
class StudentSortName implements Comparator<EduStudent>{
	@Override
	public int compare(EduStudent o1, EduStudent o2) {
		return o1.sname.compareToIgnoreCase(o2.sname);
	}
}

class StudentSortFees implements Comparator<EduStudent>{

	@Override
	public int compare(EduStudent o1, EduStudent o2) {
		if(o1.sfees==o2.sfees) 
			return 0;
		else if(o1.sfees<o2.sfees)
			return -1;
		else
			return 1;}
}
public class StudentMainTreeset {
	public static void main(String[] args) {
		EduStudent s1=new EduStudent(5,"Nalini",78654.5f);
		EduStudent s2=new EduStudent(2,"Devika",7665.4f);
		EduStudent s3=new EduStudent(3,"Shivamma",7643.2f);
		StudentSortSid sob=new StudentSortSid();
		Set<EduStudent> tob=new TreeSet<EduStudent>(sob);
	    tob.add(s1);
		tob.add(s2);
		tob.add(s3);
		System.out.println(tob);
	
	     //based on name
	     StudentSortName sob1=new StudentSortName();
	     Set<EduStudent> tob1=new TreeSet<EduStudent>(sob1);
         tob1.add(s1);
	     tob1.add(s2);
	     tob1.add(s3);
	     System.out.println(tob1);
	
	     //based on fees
	     StudentSortFees sob2=new StudentSortFees();
	     Set<EduStudent> tob2=new TreeSet<EduStudent>(sob2);
         tob2.add(s1);
	     tob2.add(s2);
	     tob2.add(s3);
	     System.out.println(tob2);
	
	     
	}
	
}
	




