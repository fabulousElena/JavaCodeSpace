package cn.itcast.constructorDemo02;

public class Test {
	public static void main(String[] args) {
		//创建Person类的对象。就是再调用她的构造方法
		Person p = new Person("张三",20);
		Person p1 = new Person();
		System.out.println(p.getName() + p.getAge());
		System.out.println(p1.getName() + p1.getAge());
		p1.setAge(18);
		p1.setName("李四");
		System.out.println(p1.getName() + p1.getAge());
	}

}
