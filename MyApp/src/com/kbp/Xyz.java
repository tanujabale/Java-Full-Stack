package com.kbp;

public class Xyz {
public static void m1() {
	System.out.println("Inside m1");

}
public void m2() {
	System.out.println("Inside m2");

}
public static void main(String[] args) {
 Xyz.m1();
 //Xyz.m2();//shows error beacause there is no static keyword so we need to create object 
 Xyz x = new Xyz();
 x.m2();
}
}
