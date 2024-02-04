package com.encapsulation;

import java.util.Scanner;

public class Myapp {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
 while(true) {
	System.out.println("Press 1 foe set Student data\nPress 2 for get Student data");
	switch(sc.nextInt()) {
	case 1:
		App.setData();
		break;
	case 2:
		App.getData();
		break;
	}
 }
 }
}
