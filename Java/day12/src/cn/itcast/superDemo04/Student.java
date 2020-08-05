package cn.itcast.superDemo04;
/*
 * Student类和worker类  有相同的成员变量  name  age
 * 根据继承的思想，共性抽取  形成父类
 * Person 抽取出来做父类
 */
public class Student extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

}
