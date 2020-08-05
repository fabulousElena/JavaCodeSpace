package cn.itcast.mapDemo;

import java.util.HashMap;
import java.util.Map;

/*
 * Map接口中的常用方法
 *   使用Map接口的实现类 HashMap
 */
public class MapDemo {

	public static void main(String[] args) {
		function2();
	}
	/*
	 * 移除集合中的键值对
	 * V(返回被移除之前的值) remove（K）
	 */
	public static void function2() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String s = map.remove(2);
		System.out.println(map+s);
	}
	
	
	/*
	 * 通过键对象，获取值对象 
	 * V(值类型) get(K)
	 * 如果集合中没有这个键，就会返回null
	 */
	public static void function1() {
		//创建集合对象，作为键的对象，值的对象存储字符串
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.get(1);
		System.out.println(value);
	}
	
	
	/*
	 * 将键值对存储到集合中，
	 * V（值的类型） put(K,V) K=>作为键的对象   V=>作为值的对象
	 * 当存储的是重复的键的时候，会将原有的值覆盖 
	 * 方法的返回值一般返回null ，当存储重复键 的时候，
	 * 会返回 被覆盖之前的值
	 */
	public static void function() {
		//创建集合独享，HashMap ，存储对象，键是字符串，值是整数
		Map<String ,Integer> map = new HashMap<String , Integer>();
		map.put("a", 1);
		Integer i = map.put("a", 2);
		System.out.println(i);
		map.put("c", 3);
		System.out.println(map);
	}
}
