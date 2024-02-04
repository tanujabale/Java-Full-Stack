package com.kbp;

public class E {
	{
		System.out.println("Non static block");
	}
public E() {
	System.out.println("Constructor");

}
static {
	System.out.println("static block");

}
}
