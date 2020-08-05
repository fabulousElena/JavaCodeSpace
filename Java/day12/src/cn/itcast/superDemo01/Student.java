package cn.itcast.superDemo01;
/*
 * 在子类中，使用super（）的方式，调用父类的构造方法
 * super（）调用的是父类的空参数构造方法
 * super（参数）调用的是父类的有参数构造方法
 * 
 * 子类的构造方法，有一个默认添加的构造方法
 * 注意！！：子类构造方法的第一行有一个隐式的代码super();
 * public Student (){
 *     super();
 * }目的是调用父类的构造方法
 * 
 * 
 */
public class Student extends Person{
	public Student () {
		//super();
	}

}
