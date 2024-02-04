package com.kbp;

public class Calculator {
	int a=20;
	int b=10;
	public void getAddition(){
		System.out.println(a+b);
	}
    public void getSubtraction(){
    	System.out.println(a-b);
		
	}
    public void getMultiplication(){
    	System.out.println(a*b);
	
    }
    public void getDivision(){
    	System.out.println(a/b);
	
    }
public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.getAddition();
	cal.getSubtraction();
	cal.getMultiplication();
	cal.getDivision();
	
}
}
 