package com.encapsulation;

import java.util.Scanner;

public class Myap {
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    while(true) {
    	System.out.println("Press 1 for set Product data\nPress 2 for get Product data\nPress 3 for update Product data");
    	switch(sc.nextInt()) {
    	case 1:
    		 Operation.setData();
    		break;
    	case 2:
    		 Operation.getData();
    		break;
    	case 3:
   		 Operation.UpdateData();
   		break;	
    	
    	}
    }
	}

}
