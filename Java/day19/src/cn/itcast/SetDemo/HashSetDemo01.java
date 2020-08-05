package cn.itcast.SetDemo;

import java.util.HashSet;

/*
 * HashSet集合的自身特点
 *   底层数据结构 ，哈希表 
 *   存储，取出都比较快
 *   线程不安全。意味着运行速度比较快
 */
public class HashSetDemo01 {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<String>();
//		hs.add(new String("abc1"));
//		hs.add(new String("abc1"));
//		hs.add(new String("abc2"));
//		hs.add(new String("abc2"));
//		System.out.println(hs);
		
		//将Person对象中的姓名，年龄，相同数据的看做同一个对象
		//想判断对象是否重复，必须依赖于对象自己的方法hashCode  和equals 
		HashSet<Person> p = new HashSet<Person>();
		p.add(new Person("a",20));
		p.add(new Person("a1",20));
		p.add(new Person("a2",20));
		p.add(new Person("a3",20));
		p.add(new Person("a4",20));
		System.out.println(p);
	}

}
 