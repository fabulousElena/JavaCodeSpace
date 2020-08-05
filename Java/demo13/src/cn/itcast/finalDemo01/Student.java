package cn.itcast.finalDemo01;

public final class Student extends Person{
	public Student() {
		super();
	}
	
	
	public Student(String name, int age) {
		super(name , age);
		System.out.println(this.getAge());
	}

}
