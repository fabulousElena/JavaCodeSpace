package cn.itcast.mapDemo2;

import java.util.LinkedHashMap;

/*
 * LinkedHashMap�̳�HashMap
 * ��֤������˳��
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String , String> link = new LinkedHashMap<String , String>();
		link.put("1", "2");
		link.put("12", "21");
		link.put("13", "22");
		link.put("14", "22");
		System.out.println(link);
	}
}
