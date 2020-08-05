package cn.itcast.CollesDemo;

import java.util.ArrayList;
import java.util.*;

/*
 * 集合操作的工具类
 *  Collections
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * Collections.binarySearch静态方法
	 * 对List集合进行二分搜索法 方法参数，传递List集合，传递被查找的元素
	 */
	public static void function1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		int index = Collections.binarySearch(list, 19);
		System.out.println(index);
	}
	
	/*
	 * Collections.shuffle方法
	 * 对于List集合进行随机排列
	 */
	public static void function2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	/*
	 * Collections.sort静态方法
	 * 对于List集合进行升序排列
	 */
	public static void function() {
		//创建List集合
		List<String> list = new ArrayList<String>();
		list.add("daaaa");
		list.add("bbbb");
		list.add("ccccc");
		Collections.sort(list);
		System.out.println(list);
	}
}
