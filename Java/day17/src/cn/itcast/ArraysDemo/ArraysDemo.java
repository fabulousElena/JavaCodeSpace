package cn.itcast.ArraysDemo;

import java.util.Arrays;

/*
 * ����Ĺ����ࡣ��������Ĳ���
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
	 * ���巽��������һ�����飬����洢����ʮ���˵Ŀ��Գɼ�
	 * ����������ĳɼ��洢��һ���µ������� �������µ�����
	 */
	public static int[] test(int[] arr) {
		Arrays.sort(arr);
		int[] result = new int[3];
		System.arraycopy(arr, arr.length-3, result, 0, 3);
		return result;
	}
	
	/*
	 * static String toString(����)
	 * ���������ַ���
	 */
	public static void function3() {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,23,45,66};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	
	/*
	 * static int binarySearch(���飬�����ҵ�Ԫ��)
	 * ����Ķ���������
	 * ����Ԫ���������г��ֵ�����
	 * ��������ҵ�Ԫ�ز����ڣ����ص���  ��-�����-1��
	 */
	public static void function2() {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,23,45,66};
		int index = Arrays.binarySearch(arr, 7);
		System.err.println(index);
	}
	
	/*
	 * static void sort(����)
	 * ��������������
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
