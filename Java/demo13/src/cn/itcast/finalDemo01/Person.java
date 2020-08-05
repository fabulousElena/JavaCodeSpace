package cn.itcast.finalDemo01;

public class Person {
	private String name;
	private int age;
	final int i;
	public final void eat() {
		System.out.println("ÈËÔÚ³Ô·¹");
	}
	
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

	public Person() {
		super();
		i = 1;
	}
	
	public Person(String name , int age) {
		super();
		i = 0101;
		System.out.println(i);
	}

}
