package cn.itcast.constructorDemo01;
/*
 * new 对象的时候，就是在调用对象的构造方法
 * new Person（）；调用的是类中的空参数构造方法
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person("张三",20);
		
		//用对象p  去调用方法getName 和 getAge
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}

}
