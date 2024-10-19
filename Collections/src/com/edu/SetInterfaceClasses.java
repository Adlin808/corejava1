package com.edu;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceClasses {
	public static void main(String[] args) {
		System.out.println("HashSet");
		Set<Integer>sob=new HashSet<Integer>();//does not maintains the order
		                                       //unique values
		sob.add(45);
		sob.add(98);
		sob.add(87);
		sob.add(21);
		sob.add(87);
		sob.add(null);
		System.out.println(sob);
		System.out.println("LinkedHashSet");
		Set<Integer>sob1=new LinkedHashSet<Integer>();//maintain the order//unique
		sob1.add(45);
		sob1.add(98);
		sob1.add(87);
		sob1.add(21);
		sob1.add(87);
		sob1.add(null);
		System.out.println(sob1);
		System.out.println("TreeSet Elements");
		Set<Integer>sob2=new TreeSet<Integer>();//elements are sorted
		                                       //null not allowed
		sob2.add(45);
		sob2.add(98);
		sob2.add(87);
		sob2.add(21);
		sob2.add(87);
		sob2.add(76);
		System.out.println(sob2);
		//Iterator to display elements
		
		}

}
/*
*Setinterface will not duplicate values
*Hashset does not maintain the insertion order,null values
*LinkedHashSet maintains the order, null is allowed
*TreeSet:elements are sorted, null is not allowed
*/