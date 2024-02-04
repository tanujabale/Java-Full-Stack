package com.encapsulation;

import java.util.Scanner;

public class App {
static Scanner sc= new Scanner(System.in);
static Student st=new Student();
public static void setData() {
	System.out.println("Enter Student roll no: ");
	int rollno=sc.nextInt();
	st.setRollno(rollno);
	
	System.out.println("Enter Student name: ");
	String name =sc.next();
	st.setName(name);
	
	System.out.println("Enter Student department: ");
	String department=sc.next();
	st.setDepartment(department);
	
}
public static void getData() {
	System.out.println("Student roll no: "+st.getRollno());
	System.out.println("Student name: "+st.getName());
	System.out.println("Student department: "+	st.getDepartment());
}

}
