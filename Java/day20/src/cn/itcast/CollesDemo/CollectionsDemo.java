package cn.itcast.CollesDemo;

import java.util.ArrayList;
import java.util.*;

/*
 * ���ϲ����Ĺ�����
 *  Collections
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * Collections.binarySearch��̬����
	 * ��List���Ͻ��ж��������� ��������������List���ϣ����ݱ����ҵ�Ԫ��
	 */
	public static void function1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		int index = Collections.binarySearch(list, 19);
		System.out.println(index);
	}
	
	/*
	 * Collections.shuffle����
	 * ����List���Ͻ����������
	 */
	public static void function2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	/*
	 * Collections.sort��̬����
	 * ����List���Ͻ�����������
	 */
	public static void function() {
		//����List����
		List<String> list = new ArrayList<String>();
		list.add("daaaa");
		list.add("bbbb");
		list.add("ccccc");
		Collections.sort(list);
		System.out.println(list);
	}
}
