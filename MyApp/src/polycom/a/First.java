package polycom.a;

public class First {
	public void m1(){

		System.out.println("No Parameters");
	}
	public void m1(int a) {
		System.out.println("Int Parameters");
	}
	public void m1(int a,String b) {
	System.out.println("Int & String Parameters");
}
	public static void main(String[] args) {
		First ft=new First();
		ft.m1();
		ft.m1(10);
		ft.m1(20,"Tanuja");
		
	}
}
