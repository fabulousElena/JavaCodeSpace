package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
/*
 * ������ϵ
 *   Ŀ�꣺���ϱ�����һ���洢������
 *       ����Ҫ��ʹ�ü��ϴ洢����
 *       ��������   ȡ������
 *       �����Լ�������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * ����ArrayList  �洢int��������
		 * ���ϱ������ܻ������ͣ� ����java�Զ�װ��  �Զ��洢
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(16);
		arr.add(15);
		arr.add(14);
		arr.add(13);
		arr.add(12);
		for(int i = 0 ; i < arr.size(); i ++) {
			System.out.println(arr.get(i));
		}
		
		/*
		 * ���ϴ洢�Զ����Person��Ķ���
		 */
		ArrayList<Person> arr1 = new ArrayList<Person>();
		arr1.add(new Person("a",20));
		arr1.add(new Person("c",20));
		arr1.add(new Person("b",20));
		for(int i = 0 ; i < arr1.size() ; i ++) {
			System.out.println(arr1.get(i));
		}
	}

}
