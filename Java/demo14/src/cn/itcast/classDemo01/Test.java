package cn.itcast.classDemo01;

public class Test {
	public static Person method1() {
		Person p1 = new Person();
		return p1;
	}
	
	public static void method(Person p) {
		p.show();
		
	}
	public static void main(String[] args) {
		Person p = new Person();
		method(p);
		
		Person p1 = method1();
		p1.show();
		
		
	}

}
