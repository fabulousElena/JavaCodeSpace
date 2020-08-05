package cn.itcast.demo01;

import java.util.ArrayList;

public class TestEquals {
	public static void main(String[] args) {
		//Person类会继承object类，继承下来了父类方法equals
		Person p1 = new Person("张三",25);
		Person p2 = new Person("lisi",25);
		
		//Person对象p1 调用父类的方法equals进行对象的比较
		boolean b = p1.equals(p2);
		System.out.println(b);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean c = p1.equals(null);
		System.out.println(c);
	}

}
