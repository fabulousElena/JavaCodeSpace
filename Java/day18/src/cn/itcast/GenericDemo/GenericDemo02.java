package cn.itcast.GenericDemo;

import java.util.ArrayList;

/*
 * 带有泛型的类 
 *   ArrayList<E> 
 *   E : Element  元素   E的实际思想 就是一个变量
 *   ArrayList<Integer>  E 接受到的类型  就是所谓的Integer类型
 *   public static ArrayList<E>(){
 *   
 *   }
 */
public class GenericDemo02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(32323);
		arr.add(32323232);
		//ArrayList<Integer> 集合有个方法  <T> toArray(T[] a )
		Integer[] a = new Integer[arr.size()];
		Integer[] j = arr.toArray(a);
		for (Integer k : j) {
			System.out.println(k); 
		}
	}

}
