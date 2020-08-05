package cn.itcast.superDemo02;
/*
 * 子类构造方法的报错原因：找不到父类的空参数构造器
 * 子类中，没有手写构造。编译器默认添加的空参数
 * public Student(){
 *    super();
 * }
 * 要想编译成功，必须手写编写构造方法，请在super中加入参数
 */
public class Student extends Person{

	public Student(int a) {
		super(a);
		// TODO 自动生成的构造函数存根
	}

}
