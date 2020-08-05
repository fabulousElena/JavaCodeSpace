package cn.itcast.mapDemo2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map接口实现类 Hashtable
 * 底层数据结构也是哈希表，特点和HashMap是一样的
 * 区别在于Hashtable 线程安全集合，运行速度慢
 *       HashMap   线程不安全集合，运行速度快
 *       
 *       HashMap 允许存储null值，null键
 *       Hashtable不允许
 *       
 *       Hashtable子类Properties依然再用
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Map<String , String> map = new Hashtable<String,String>();
		map.put(null, null);
		System.out.println(map);
	}

}
