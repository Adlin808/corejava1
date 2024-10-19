package com.edu;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Resizable array
		ArrayList lob=new ArrayList();
		lob.add(34);
		lob.add(87.4f);
		lob.add(9.56);
		lob.add("Hello");
		lob.add(true);
		System.out.println(lob);
		
		ArrayList<Integer>Iob=new ArrayList<>();
		Iob.add(34);
		Iob.add(67);
		Iob.add(56);
		System.out.println(Iob);
		//for loop
		for(int i:Iob) {
			System.out.println(i);
		}
		
		
		ArrayList<Float>Fob=new ArrayList<>();
		Fob.add(34.6f);
		Fob.add(67.5f);
		Fob.add(56.3f);
		System.out.println(Fob);
		//for loop
		for(float i:Fob) {
			System.out.println(i);
		}
		ArrayList<Double>dob=new ArrayList<>();
		dob.add(34.6);
		dob.add(67.3);
		dob.add(56.9);
		System.out.println(dob);
		//for loop
		for(double i:dob) {
			System.out.println(i);
		}
		ArrayList<String>sob=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		/*sob.add("Adlin");
		sob.add("Daisy");
		sob.add("Peter");
		System.out.println(sob);
		//for loop
		for(String i:sob) {
			System.out.println(i);*/
			System.out.println("Enter the names:");
			int n=3;
			String name;
			for(int i=0;i<n;i++) {
				name=sc.next();
				sob.add(name);
				System.out.println(sob);
			}

}}
