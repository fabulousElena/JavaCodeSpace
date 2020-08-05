package cn.itcast.staticDemo01;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();
		p.a = 200;
		System.out.println(p.a);
		System.out.println(p1.a);
		System.out.println(Person.a);
		Person.function();
		
	}

}
