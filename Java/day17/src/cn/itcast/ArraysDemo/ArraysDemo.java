package cn.itcast.ArraysDemo;

import java.util.Arrays;

/*
 * 数组的工具类。包含数组的操作
 * java.util.Arrays
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//function3();
		int[] arr = {11,32,55,88,66,86,44,90};
		int[] arr1 = test(arr);
		String s = Arrays.toString(arr1);
		System.out.println(s);
	}
	
	/*
	 * 定义方法，接受一个数组，数组存储的是十个人的考试成绩
	 * 将最后三名的成绩存储到一个新的数组中 并返回新的数组
	 */
	public static int[] test(int[] arr) {
		Arrays.sort(arr);
		int[] result = new int[3];
		System.arraycopy(arr, arr.length-3, result, 0, 3);
		return result;
	}
	
	/*
	 * static String toString(数组)
	 * 将数组变成字符串
	 */
	public static void function3() {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,23,45,66};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	
	/*
	 * static int binarySearch(数组，被查找的元素)
	 * 数组的二分搜索法
	 * 返回元素在数组中出现的索引
	 * 如果被查找的元素不存在，返回的是  （-插入点-1）
	 */
	public static void function2() {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,23,45,66};
		int index = Arrays.binarySearch(arr, 7);
		System.err.println(index);
	}
	
	/*
	 * static void sort(数组)
	 * 对数组升序排列
	 * 
	 */
	public static void function() {
		int[] arr = {321,313,43,5,6,8,45,4,8,668,7};
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
		}
	}

}
