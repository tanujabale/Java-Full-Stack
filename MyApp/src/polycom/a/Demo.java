package polycom.a;

public class Demo {
	public static void m1(){

		System.out.println("Without Parameters");
	}
	public static void m1(int a) {
		System.out.println("Int Parameters");
	}
	public static void m1(int a,String b) {
	System.out.println("Int & String Parameters");
}
	public static void main(String[] args) {
		Demo ft=new Demo();
		ft.m1();
		ft.m1(10);
		ft.m1(20,"Tanuja");
		
	}
}
//in static overloading is possible