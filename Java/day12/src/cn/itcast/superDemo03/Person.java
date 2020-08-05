package cn.itcast.superDemo03;
/*
 * 构造方法第一行，写this（） 还是super（）
 * 不能同时存在，可以任选其一 
 * 必须保证子类的所有构造方法可以调用父类的构造方法即可
 */
public class Person {
	public Person(int a ) {
		System.out.println(a);
	}

}
