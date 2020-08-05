package cn.itcast.superDemo03;
/*
 * 无论如何，子类的所有的构造方法， 直接间接都必须调用父类的构造方法
 * 子类的构造方法，如果什么都不写，那么默认的构造方法就是super（）；
 */
public class Student extends Person{
	public Student() {
		this("wdwa");
		
	}
	
	public Student(String s) {
		super(3);
	}

}
