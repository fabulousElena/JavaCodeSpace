package cn.itcast.mapDemo2;

import java.util.HashMap;
import java.util.Map;

/*
 * 使用HashMap集合，存储自定义的对象
 * 自定义的对象作为键出现，也可以作为值出现
 */
public class HashMapDemo {

	public static void main(String[] args) {
		function1();
	}
	/*
	 * HashMap集合 存储自定义的对象Person ，作为值出现
	 */
	public static void function() {
		HashMap<String,Person> map = new HashMap<String,Person>();
		map.put("beijing", new Person("张三",20));
		map.put("tianjin", new Person("张三1",201));
		map.put("shanghai", new Person("张三2",202));
		for(String key : map.keySet()) {
			Person value = map.get(key);
			System.out.println(key + value);
		}
		System.out.println("==================");
		for(Map.Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
	
	/*
	 * HashMap存储自定义对象Person 作为键出现
	 * 键的对象是Person类型，值的类型哪个都行
	 * 必须保证键的唯一性，必须存储到键的对象，重写hashCode equals方法
	 */
	public static void function1() {
		HashMap<Person,String> map = new HashMap<Person,String>();
		map.put(new Person("a",20), "李悦");
		map.put(new Person("b",20), "李悦2");
		map.put(new Person("c",20), "李悦1");
		map.put(new Person("a",20), "李悦");
		for(Person key : map.keySet()) {
			System.out.println(key+map.get(key));
		}
		System.out.println("=================");
		for(Map.Entry<Person, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
}
