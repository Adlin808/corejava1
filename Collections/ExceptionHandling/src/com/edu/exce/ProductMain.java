package com.edu.exce;
import java.util.Scanner;

class ProductException extends Exception{
	public ProductException(String s) {
		super(s);
	}
}
class Product{
	public void ProductPriceCheck(float price) {
		try{
			if(price<0 || price>=9999) {
				throw new ProductException("Invalid product price");
			}else {
				System.out.println("Product price is valid");
			}
	}catch(ProductException e) {
		e.printStackTrace();
	}
		
	}
}
public class ProductMain {
	public static void main(String[] args) {
		float price;
		System.out.println("Enter the price:");
		Scanner sc=new Scanner(System.in);
		price=sc.nextFloat();
		Product Pob=new Product();
		Pob.ProductPriceCheck(price);
	}
}


