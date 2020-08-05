package cn.itcast.ListDemo;

import java.util.LinkedList;

/*
 * LinkedList �����ϵ����й���
 *   �����ص� ������ײ�ʵ�֣���ѯ������ɾ��
 *   
 *  ��������й��ܣ����ܶ�̬����
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		function1();
	}
	/*
	 * E getFirst(E e) ��ȡ����Ŀ�ͷ
	 * E getLast(E e) ��ȡ����Ľ�β
	 * E removeFirst(E e) �Ƴ�����������Ŀ�ͷ
	 * E removeLast(E e) �Ƴ�����������Ľ�β
	 * 
	 */
	public static void function1() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		if(!li.isEmpty()) {
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);
		}else {
			System.out.println("����Ϊ��");
		}
	}
	
	/*
	 * add(E e)
	 * addFirst(E)��ӵ�����Ŀ�ͷ
	 * addLast��E����ӵ�����Ľ�β
	 */
	public static void function() {
		LinkedList<String> li = new LinkedList<String>();
		li.addLast("abc");
		li.add("adbc");
		li.addFirst("12ss");
		System.out.println(li);
		
	}
}
