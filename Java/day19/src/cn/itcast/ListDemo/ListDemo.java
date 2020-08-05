package cn.itcast.ListDemo;

import java.util.List;
import java.util.ArrayList;

/*
 * List�ӿ���ϵ ���̳�Collection�ӿ�
 *   �����кܶ�ʵ���� 
 *    List�ӿ��ص㣺���������������ظ�Ԫ��
 *    ʵ���� ArrayList   LinkedList 
 *    
 *    List�ӿ��еĳ��󷽷� ����һ���ַ��������ĸ��ӿ�Collection��һ����
 *    List�ӿڵ��Լ����еķ��� �����������Ĺ��� 
 */
public class ListDemo {
	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * E set(int index , E)
	 * �޸�ָ�������ϵ�Ԫ��
	 * ���ر��޸�֮ǰ��Ԫ��
	 */
	public static void function2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int i = list.set(1, 233);
		System.out.println(i);
		System.out.println(list);
		
	}
	
	/*
	 * remove �Ƴ� 
	 * E remove(int index)
	 * �Ƴ�ָ�������ϵ�Ԫ��
	 * �����ر�ɾ��֮ǰ��Ԫ��
	 */
	public static void function1() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.4);
		list.add(1.3);
		list.add(1.2);
		list.remove(0);
		System.out.println(list.remove(1));
		System.out.println(list);
		
	}
	/*
	 * add(int index , E)
	 * ��Ԫ�ز��뵽�����ָ��������
	 * ���������Ĳ�������Ҫ��ֹԽ������
	 */
	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("adc1");
		list.add("adc2");
		list.add("adc3");
		list.add("adc4");
		System.out.println(list);
		list.add(1, "itssde");
		System.out.println(list);
		
	}

}
