package com.inherit;

import java.util.Scanner;

public class Operations {
	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Altroz\nPress 2 for Safari");
		int ch = sc.nextInt();
		Tata td=new Tata();
		switch(ch) {
		case 1:
			td.getAltrozInfo();
			break;
		case 2:
			td.getSafariInfo();
			break;
		default:
			System.out.println("Invalid");
		}
			
		}
		public static void getToyota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Fortuner\nPress 2 for Innova");
		int ch = sc.nextInt();
		Toyota td=new Toyota();
		switch(ch) {
		case 1:
			td.getFortunerInfo();
			break;
		case 2:
			td.getInnovaInfo();
			break;
		default:
			System.out.println("Invalid");
		}
		}
		public static void getMahindra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Thar\nPress 2 for Scorpio");
		int ch = sc.nextInt();
		Mahindra td=new Mahindra();
		switch(ch) {
		case 1:
			td.getTharInfo();
			break;
		case 2:
			td.getScorpioInfo();
			break;
		default:
			System.out.println("Invalid");
			
		}
	}

}
