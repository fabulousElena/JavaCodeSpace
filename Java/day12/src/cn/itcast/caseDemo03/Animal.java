package cn.itcast.caseDemo03;

public class Animal {
	private String name;
	private int age;
	
	public void eat() {
		System.out.println("Animal�ڳԷ�");
	}
	
	public void sleep() {
		System.out.println("Animal��˯��");
	}
	
	public Animal() {
		super();
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

	public Animal(String name , int age) {
		super();
		this.name = name ;
		this.age = age;
	}
	
	

}
