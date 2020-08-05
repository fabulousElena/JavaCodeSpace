package cn.itcast.ListDemo;

import java.util.List;
import java.util.ArrayList;

/*
 * List接口派系 ，继承Collection接口
 *   下面有很多实现类 
 *    List接口特点：有序，索引，可以重复元素
 *    实现类 ArrayList   LinkedList 
 *    
 *    List接口中的抽象方法 ，有一部分方法和她的父接口Collection是一样的
 *    List接口的自己特有的方法 ，带有索引的功能 
 */
public class ListDemo {
	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * E set(int index , E)
	 * 修改指定索引上的元素
	 * 返回被修改之前的元素
	 */
	public static void function2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int i = list.set(1, 233);
		System.out.println(i);
		System.out.println(list);
		
	}
	
	/*
	 * remove 移除 
	 * E remove(int index)
	 * 移除指定索引上的元素
	 * 并返回被删除之前的元素
	 */
	public static void function1() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.4);
		list.add(1.3);
		list.add(1.2);
		list.remove(0);
		System.out.println(list.remove(1));
		System.out.println(list);
		
	}
	/*
	 * add(int index , E)
	 * 将元素插入到链表的指定索引上
	 * 带有索引的操作，就要防止越界问题
	 */
	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("adc1");
		list.add("adc2");
		list.add("adc3");
		list.add("adc4");
		System.out.println(list);
		list.add(1, "itssde");
		System.out.println(list);
		
	}

}
