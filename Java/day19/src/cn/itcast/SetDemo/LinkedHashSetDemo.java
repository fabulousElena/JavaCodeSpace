package cn.itcast.SetDemo;

import java.util.LinkedHashSet;

/*
 *  LinkedHashSet��������Ĺ�ϣ��ʵ��
 *  �̳���HashSet
 *  
 *  LinkedHashSet����˳�� ������˳��
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(100);
		l.add(1090);
		l.add(102);
		l.add(1003);
		l.add(10402);
		l.add(1070);
		l.add(1040);
		System.out.println(l);
		
	}
}
