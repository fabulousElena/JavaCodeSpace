package cn.itcase.ArraysDemo01;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int arr[] = {12,32,54,99,3,6,44};
		for(int i = 0; i < arr.length ; i ++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.println();
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length ; i ++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		System.out.println(Arrays.binarySearch(arr, 99));
		
	}

}
