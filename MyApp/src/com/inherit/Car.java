package com.inherit;

import java.util.Scanner;

public class Car {
	static {
		System.out.println("Welcome to cars");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your Company");
		
		System.out.println("Press 1 for Tata\nPress 2 for Toyota\nPress 3 for Mahindra");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("******Welcome to Tata*****");
			Operations.getTata();
			break;
		case 2:
			System.out.println("******Welcome to Toyota*****");
			Operations.getToyota();
			break;
		
		case 3:
			System.out.println("******Welcome to Mahindra*****");
			break;
		
		default:
			System.out.println("******Invalid*****");
		
		
			
		}
		
	}
}
