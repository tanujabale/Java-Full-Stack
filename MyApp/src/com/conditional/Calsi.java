package com.conditional;

import java.util.Scanner;

public class Calsi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1");
		int a=sc.nextInt();

		System.out.println("Enter number 2");
		int b=sc.nextInt();

		System.out.println("Choose Operation");
		int calculator =sc.nextInt();
		switch(calculator) {
		case 1:
			System.out.println("Addition:"+a+b);
			break;
		case 2:
			System.out.println("Subtraction:"+(a-b));
			break;
		
		case 3:
			System.out.println("Multiplication:"+a*b);
			break;
		
		case 4:
			System.out.println("Division:"+a/b);
			break;
		
		}
		
	}	
	
}
