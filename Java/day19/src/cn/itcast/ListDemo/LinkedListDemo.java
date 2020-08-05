package cn.itcast.ListDemo;

import java.util.LinkedList;

/*
 * LinkedList 链表集合的特有功能
 *   自身特点 ：链表底层实现，查询慢，增删快
 *   
 *  子类的特有功能，不能多态调用
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		function1();
	}
	/*
	 * E getFirst(E e) 获取链表的开头
	 * E getLast(E e) 获取链表的结尾
	 * E removeFirst(E e) 移除并返回链表的开头
	 * E removeLast(E e) 移除并返回链表的结尾
	 * 
	 */
	public static void function1() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		if(!li.isEmpty()) {
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);
		}else {
			System.out.println("集合为空");
		}
	}
	
	/*
	 * add(E e)
	 * addFirst(E)添加到链表的开头
	 * addLast（E）添加到链表的结尾
	 */
	public static void function() {
		LinkedList<String> li = new LinkedList<String>();
		li.addLast("abc");
		li.add("adbc");
		li.addFirst("12ss");
		System.out.println(li);
		
	}
}
