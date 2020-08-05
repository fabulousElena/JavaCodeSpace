package cn.itcast.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * set接口特点   ：不重复元素  没索引
 * 
 * set接口实现类   HashSet （哈希表）
 * 特点：无序集合  ，存储和取出的顺序不同，没有索引，不存储相同元素,存储相同元素时候，只存储一个。
 * 代码编写上，和ArrayList完全一样
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("awd");
		set.add("awd1");
		set.add("awd2");
		set.add("awd3");
		set.add("awd4");
		set.add("awd5");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String s :set) {
			System.out.println(s);
		}
		
	}
}
