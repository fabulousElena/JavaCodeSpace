package cn.itcast.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * set�ӿ��ص�   �����ظ�Ԫ��  û����
 * 
 * set�ӿ�ʵ����   HashSet ����ϣ��
 * �ص㣺���򼯺�  ���洢��ȡ����˳��ͬ��û�����������洢��ͬԪ��,�洢��ͬԪ��ʱ��ֻ�洢һ����
 * �����д�ϣ���ArrayList��ȫһ��
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("awd");
		set.add("awd1");
		set.add("awd2");
		set.add("awd3");
		set.add("awd4");
		set.add("awd5");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String s :set) {
			System.out.println(s);
		}
		
	}
}
