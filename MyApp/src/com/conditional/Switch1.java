package com.conditional;

public class Switch1 {
	public static void main(String[] args) {
		int a=5;
		switch(a) {
		case 1:
			System.out.println("Inside case 1");
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
		case 3:
			System.out.println("Inside case 3");
			break;
		case 4:
			System.out.println("Inside case 4");
			break;
		case 2+3:
			System.out.println("Inside case 5");
			break;
		
		default:
			System.out.println("Invalid");
		}
	}

}

