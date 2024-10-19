package com.edu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>sob=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("No.of names to be added");
		int n=sc.nextInt();
		System.out.println("Enter" +n+ "names");
		for(int i=0;i<n;i++) {
			String name=sc.next();
			sob.add(name);
		}
		System.out.println(sob);
		System.out.println("Enter the name to be search");
		String sname=sc.next();
		if(sob.contains(sname)) {
			System.out.println(sname+ "is present");
			
		}
		else {
			System.out.println(sname+ 
					"Not present");
			
		}
		System.out.println("Enter name to be removed");
		String rn=sc.next();
		sob.remove(rn);
		System.out.println("After removing linked list is"+sob);
		List<String>slist=new LinkedList<String>();
		slist.add("Peter");
		slist.add("Adlin");
		sob.addAll(slist);
		System.out.println("After adding Linkedlist is"+sob);
		sob.clear();
		System.out.println("After clear method"+sob);}

}
