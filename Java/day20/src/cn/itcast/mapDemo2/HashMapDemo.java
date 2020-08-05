package cn.itcast.mapDemo2;

import java.util.HashMap;
import java.util.Map;

/*
 * ʹ��HashMap���ϣ��洢�Զ���Ķ���
 * �Զ���Ķ�����Ϊ�����֣�Ҳ������Ϊֵ����
 */
public class HashMapDemo {

	public static void main(String[] args) {
		function1();
	}
	/*
	 * HashMap���� �洢�Զ���Ķ���Person ����Ϊֵ����
	 */
	public static void function() {
		HashMap<String,Person> map = new HashMap<String,Person>();
		map.put("beijing", new Person("����",20));
		map.put("tianjin", new Person("����1",201));
		map.put("shanghai", new Person("����2",202));
		for(String key : map.keySet()) {
			Person value = map.get(key);
			System.out.println(key + value);
		}
		System.out.println("==================");
		for(Map.Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
	
	/*
	 * HashMap�洢�Զ������Person ��Ϊ������
	 * ���Ķ�����Person���ͣ�ֵ�������ĸ�����
	 * ���뱣֤����Ψһ�ԣ�����洢�����Ķ�����дhashCode equals����
	 */
	public static void function1() {
		HashMap<Person,String> map = new HashMap<Person,String>();
		map.put(new Person("a",20), "����");
		map.put(new Person("b",20), "����2");
		map.put(new Person("c",20), "����1");
		map.put(new Person("a",20), "����");
		for(Person key : map.keySet()) {
			System.out.println(key+map.get(key));
		}
		System.out.println("=================");
		for(Map.Entry<Person, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
}
