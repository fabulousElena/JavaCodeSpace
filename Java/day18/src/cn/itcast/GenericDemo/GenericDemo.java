package cn.itcast.GenericDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * JDK 1.5  �������µİ�ȫ����   ��֤����İ�ȫ��
 * ���ͣ�ָ���˼����д洢���������͡� <��������>
 */
public class GenericDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("2d2dad");
		coll.add("dagdhh");
		coll.add("23r343");
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			String s = it.next();
			System.out.println(s.length());
		}
		
	}

}
