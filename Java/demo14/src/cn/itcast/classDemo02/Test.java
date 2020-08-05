package cn.itcast.classDemo02;

public class Test {
	public static void main(String[] args) {
		Person p = new Student();
		method1().show();
		//p.show();
		method(p);
		
	}
	public static void method(Person p) {
		p.show();
	}
	
	public static Person method1() {
		Person a= new Student();
		return a;
	}
}
