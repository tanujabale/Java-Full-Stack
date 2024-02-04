package com.conditional;

public class While6 {
	public static void main(String[] args) {
		boolean a=true;
		int i=10;
		while(a) {
			if(i==15) {
			a=false;
		}
		else
		{
			System.out.println(i);
		}
	    i++;
		}
}
}
