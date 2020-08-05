package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * Collection接口中的方法
 * 是集合中所有实现类必须拥有的方法
 * 使用Collection接口的实现类，进行程序的演示
 * ArrayList  implement List 
 * List extends Collection
 * 方法的执行，都是实现类的重写方法
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * remove(Object obj)移除集合中指定的元素
	 * 返回boolean  
	 */
	private static void function3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		System.out.println(coll);
		
		boolean b = coll.remove("adcggdad");
		System.out.println(b);
		System.out.println(coll);
		
	}
	/*
	 * Object[] toArray()  
	 * 把集合中的元素转成数组中的元素
	 * 返回的是一个存储对象的数组  数组存储的数据类型是Object   
	 */
	private static void function2() {
		// TODO 自动生成的方法存根
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		
		Object[] obj = coll.toArray();
		for(int i = 0 ; i < obj.length ; i ++) {
			System.out.println(obj[i]);
		}
	}

	/*
	 * 学习了三种长度表现形式
	 * 数组.length  属性  返回int
	 * 字符串.length()  方法  返回int
	 * 集合.size()  方法  返回int 
	 */
	
	/*
	 * Collection 接口方法
	 * boolean contains（Object o） 判断对象是否存在集合中，对象存在返回true
	 * 方法参数是Object类型
	 */
	private static void function1() {
		// TODO 自动生成的方法存根
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		boolean b = coll.contains("adcggdad");
		System.out.println(b);
		int i = coll.size();
		System.out.println(i);
	}

	/*
	 * Collection接口的方法  
	 * void clear （）清空集合中的所有元素
	 * 集合容器本身依然存在
	 */
	public static void function() {
		//接口的多态调用
		Collection<String> coll = new ArrayList<String>();
		coll.add("adv");
		coll.add("advdw");
		coll.add("adsav");
		coll.add("agddfdv");
		System.out.println(coll);
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		coll.clear();
		coll.add("adsav");
		coll.add("agddfdv");
		System.out.println(coll);
		
		
	}

}
