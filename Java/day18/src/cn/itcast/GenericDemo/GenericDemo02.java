package cn.itcast.GenericDemo;

import java.util.ArrayList;

/*
 * ���з��͵��� 
 *   ArrayList<E> 
 *   E : Element  Ԫ��   E��ʵ��˼�� ����һ������
 *   ArrayList<Integer>  E ���ܵ�������  ������ν��Integer����
 *   public static ArrayList<E>(){
 *   
 *   }
 */
public class GenericDemo02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(32323);
		arr.add(32323232);
		//ArrayList<Integer> �����и�����  <T> toArray(T[] a )
		Integer[] a = new Integer[arr.size()];
		Integer[] j = arr.toArray(a);
		for (Integer k : j) {
			System.out.println(k); 
		}
	}

}
