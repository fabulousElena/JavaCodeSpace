package cn.itcast.caseDemo01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 将酒店员工 厨师 服务员 经理 分别存储到三个集合中
 * 定义一个方法，同时遍历三个集合 ，在遍历的同时  还可以调用工作方法
 */
public class GenericTest {
	public static void main(String[] args) {
		//创建3个集合对象存储
		ArrayList<Cooker> cooker = new ArrayList<Cooker>();
		ArrayList<Manager> manager = new ArrayList<Manager>();
		ArrayList<Waiter> waiter = new ArrayList<Waiter>();
		cooker.add(new Cooker("zhangsan","001"));
		cooker.add(new Cooker("zhangsan1","002"));
		waiter.add(new Waiter("zhangsi","001"));
		waiter.add(new Waiter("zhangsi1","002"));
		manager.add(new Manager("xiaoming","001",3000));
		manager.add(new Manager("xiaoming1","002",2000));
		iterator(waiter);
		iterator(manager);
		iterator(cooker);
		
	}
	/*
	 * 定义方法同时遍历三个集合 ，在遍历的同时  还可以调用工作方法
	 * 用?通配符 迭代器it.next() 方法取出来的是Object类型 怎么调用work方法？
	 * 用强制转换  it.next() = Object o ==> Employee
	 * 方法的参数  ：可不可控制  传递Employee对象 ，也可以传递Employee子类对象
	 * 泛型的限定   本案例中Employee是固定的  但是子类 是无限的 
	 * ? extends Employee 限制的是父类，上限限定，可以传递Employee ，传递她的子类对象
	 * ? super   Employee 限制的是子类，下限限定，可以传递Employee ，传递她的父类对象
	 */
	public static void iterator(ArrayList<? extends Employee> array) {
		Iterator<? extends Employee> it = array.iterator();
		while(it.hasNext()) {
			//获取出的next（） 数据类型是什么  是Employee
			Employee e = it.next();
			System.out.println(e);
		}
	}

}
