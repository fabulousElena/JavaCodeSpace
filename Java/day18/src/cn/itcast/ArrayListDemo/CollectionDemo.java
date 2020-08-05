package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * Collection�ӿ��еķ���
 * �Ǽ���������ʵ�������ӵ�еķ���
 * ʹ��Collection�ӿڵ�ʵ���࣬���г������ʾ
 * ArrayList  implement List 
 * List extends Collection
 * ������ִ�У�����ʵ�������д����
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * remove(Object obj)�Ƴ�������ָ����Ԫ��
	 * ����boolean  
	 */
	private static void function3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		System.out.println(coll);
		
		boolean b = coll.remove("adcggdad");
		System.out.println(b);
		System.out.println(coll);
		
	}
	/*
	 * Object[] toArray()  
	 * �Ѽ����е�Ԫ��ת�������е�Ԫ��
	 * ���ص���һ���洢���������  ����洢������������Object   
	 */
	private static void function2() {
		// TODO �Զ����ɵķ������
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		
		Object[] obj = coll.toArray();
		for(int i = 0 ; i < obj.length ; i ++) {
			System.out.println(obj[i]);
		}
	}

	/*
	 * ѧϰ�����ֳ��ȱ�����ʽ
	 * ����.length  ����  ����int
	 * �ַ���.length()  ����  ����int
	 * ����.size()  ����  ����int 
	 */
	
	/*
	 * Collection �ӿڷ���
	 * boolean contains��Object o�� �ж϶����Ƿ���ڼ����У�������ڷ���true
	 * ����������Object����
	 */
	private static void function1() {
		// TODO �Զ����ɵķ������
		Collection<String> coll = new ArrayList<String>();
		coll.add("adcggdad");
		coll.add("adcdwadad");
		coll.add("agfdcdad");
		coll.add("adcddwaad");
		boolean b = coll.contains("adcggdad");
		System.out.println(b);
		int i = coll.size();
		System.out.println(i);
	}

	/*
	 * Collection�ӿڵķ���  
	 * void clear ������ռ����е�����Ԫ��
	 * ��������������Ȼ����
	 */
	public static void function() {
		//�ӿڵĶ�̬����
		Collection<String> coll = new ArrayList<String>();
		coll.add("adv");
		coll.add("advdw");
		coll.add("adsav");
		coll.add("agddfdv");
		System.out.println(coll);
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		coll.clear();
		coll.add("adsav");
		coll.add("agddfdv");
		System.out.println(coll);
		
		
	}

}
