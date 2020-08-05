package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
/*
 * 集合体系
 *   目标：集合本身是一个存储的容器
 *       必须要会使用集合存储对象
 *       遍历集合   取出对象
 *       集合自己的特性
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * 集合ArrayList  存储int类型整数
		 * 集合本身不接受基本类型， 但是java自动装箱  自动存储
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(16);
		arr.add(15);
		arr.add(14);
		arr.add(13);
		arr.add(12);
		for(int i = 0 ; i < arr.size(); i ++) {
			System.out.println(arr.get(i));
		}
		
		/*
		 * 集合存储自定义的Person类的对象
		 */
		ArrayList<Person> arr1 = new ArrayList<Person>();
		arr1.add(new Person("a",20));
		arr1.add(new Person("c",20));
		arr1.add(new Person("b",20));
		for(int i = 0 ; i < arr1.size() ; i ++) {
			System.out.println(arr1.get(i));
		}
	}

}
