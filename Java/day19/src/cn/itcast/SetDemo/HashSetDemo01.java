package cn.itcast.SetDemo;

import java.util.HashSet;

/*
 * HashSet���ϵ������ص�
 *   �ײ����ݽṹ ����ϣ�� 
 *   �洢��ȡ�����ȽϿ�
 *   �̲߳���ȫ����ζ�������ٶȱȽϿ�
 */
public class HashSetDemo01 {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<String>();
//		hs.add(new String("abc1"));
//		hs.add(new String("abc1"));
//		hs.add(new String("abc2"));
//		hs.add(new String("abc2"));
//		System.out.println(hs);
		
		//��Person�����е����������䣬��ͬ���ݵĿ���ͬһ������
		//���ж϶����Ƿ��ظ������������ڶ����Լ��ķ���hashCode  ��equals 
		HashSet<Person> p = new HashSet<Person>();
		p.add(new Person("a",20));
		p.add(new Person("a1",20));
		p.add(new Person("a2",20));
		p.add(new Person("a3",20));
		p.add(new Person("a4",20));
		System.out.println(p);
	}

}
 