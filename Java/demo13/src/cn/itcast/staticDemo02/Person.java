package cn.itcast.staticDemo02;


public class Person {
	
	public static void main(String args[]) {
		Person p = new Person();
		p.setName("sdad");
		System.out.println(p.getName());
		Person.function();
		String d = Person.c;
		System.out.println(d);
		System.out.println(Interface.a);
		
		new Person();
		new Person().function();
		
	}
	
	public static final String c = "dwadw";
	public static void function() {
		System.out.println("这是静态方法");
	}
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
