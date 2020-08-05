package cn.itcast.mapDemo;

import java.util.HashMap;
import java.util.Map;

/*
 * Map�ӿ��еĳ��÷���
 *   ʹ��Map�ӿڵ�ʵ���� HashMap
 */
public class MapDemo {

	public static void main(String[] args) {
		function2();
	}
	/*
	 * �Ƴ������еļ�ֵ��
	 * V(���ر��Ƴ�֮ǰ��ֵ) remove��K��
	 */
	public static void function2() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String s = map.remove(2);
		System.out.println(map+s);
	}
	
	
	/*
	 * ͨ�������󣬻�ȡֵ���� 
	 * V(ֵ����) get(K)
	 * ���������û����������ͻ᷵��null
	 */
	public static void function1() {
		//�������϶�����Ϊ���Ķ���ֵ�Ķ���洢�ַ���
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.get(1);
		System.out.println(value);
	}
	
	
	/*
	 * ����ֵ�Դ洢�������У�
	 * V��ֵ�����ͣ� put(K,V) K=>��Ϊ���Ķ���   V=>��Ϊֵ�Ķ���
	 * ���洢�����ظ��ļ���ʱ�򣬻Ὣԭ�е�ֵ���� 
	 * �����ķ���ֵһ�㷵��null �����洢�ظ��� ��ʱ��
	 * �᷵�� ������֮ǰ��ֵ
	 */
	public static void function() {
		//�������϶���HashMap ���洢���󣬼����ַ�����ֵ������
		Map<String ,Integer> map = new HashMap<String , Integer>();
		map.put("a", 1);
		Integer i = map.put("a", 2);
		System.out.println(i);
		map.put("c", 3);
		System.out.println(map);
	}
}
