package cn.itcast.constructorDemo03;

public class Test {

	public static void main(String[] args) {
		//创建Person的对象，调用的是空参数的构造方法
		Person p = new Person();
		System.out.println(p.getAge() + p.getName());
	}
}
