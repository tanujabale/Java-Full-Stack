package com.kbp;

public class Data {
	static {
		System.out.println("Inside static block");
	}

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
	}

}
//if static block and main method are in same class then static block can be executed first.