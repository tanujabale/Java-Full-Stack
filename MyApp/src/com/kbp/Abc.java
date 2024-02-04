package com.kbp;

public class Abc {
	public class A{
		static {
			System.out.println("Inside static block");
		}
		public class Def {
			public static void main(String[] args) {
				System.out.println("Inside main method");
			}

		}

	}

}
