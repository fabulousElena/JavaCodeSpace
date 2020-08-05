package cn.itcast.demo01;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Person() {}
	
	/*
	 * 重写父类的toString（）
	 * 没有必要让调用者看到内存地址
	 * 重写要求 ：返回类中的所有成员变量的值
	 */
	
	public String toString() {
		return name+ age;
	}
	/*
	 * （非 Javadoc）
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 重写父类的方法，但是不改变父类方法的源代码,说明父类中的equals比较两个对象的地址
	 * 两个对象比较内存地址是没有意义的。
	 * 能不能比较两个对象的成员变量age
	 * 如果两个对象的成员变量相同 就返回 true  反之false
	 * 
	 * 重写父类的equals方法  自己定义对象的比较方式
	 */
	//public boolean equals(Object obj) {
	//return this == obj;	
	//}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		//对参数obj进行非空的判断  没有就直接跳出  return
		if(obj == null) {
			return false;
		}
		
		//对obj参数进行类型的向下转型 obj转成P2类型
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
		}
		return false;
		
		
		
	}
	

}
