package com.encapsulation;

import java.time.LocalTime;
import java.util.Scanner;

public class Operation {
	static Scanner sc= new Scanner(System.in);
	static Product pr=new Product();
	public static void setData() {
		System.out.println("Enter Product Id:");	
		int Id=sc.nextInt();
		pr.setProductId(Id);
		
        System.out.println("Enter Product name:");	
		String name =sc.next();
		pr.setProductName(name);
			
        System.out.println("Enter Product Price:");	
		double Price =sc.nextDouble();
		double pricewithGST=Price*1.18;
		pr.setPrice(Price);
		pr.setPricewithGST(pricewithGST);
		
		pr.setTime(LocalTime.now());
		pr.setUpdatedStatus("Product is new and not updated after regestration");
		
		
		
		
	}
	public static void getData() {
		System.out.println("Product Id:"+pr.getProductId());
		System.out.println("Product name:"+pr.getProductName());
		System.out.println("Product Price:"+pr.getPrice());
		System.out.println("Product Price with GST:"+pr.getPricewithGST());
		System.out.println("Latest Updated status:"+pr.getTime());
		System.out.println(" Updated status:"+pr.getUpdatedStatus());
		
	}
	
	public static void UpdateData() {
		System.out.println("Press 1 for update ProductId\nPress 2 for update Product Name\nPress 3 for Update Product Price ");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Enter new Product Id");
			pr.setProductId(sc.nextInt());
			pr.setTime(LocalTime.now());
			pr.setUpdatedStatus("ID is updated");
			break;
		case 2:
			System.out.println("Enter new Product name");
			pr.setProductId(sc.nextInt());
			pr.setTime(LocalTime.now());
			pr.setUpdatedStatus("Product is updated");
			break;
			
		case 3:
			System.out.println("Enter new Product price");
			pr.setProductId(sc.nextInt());
			pr.setTime(LocalTime.now());
			pr.setUpdatedStatus("Price is updated");
			break;
			
			
		}
	}

	
	
}
