package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����еĵ�����
 *    ��ȡ������Ԫ�صķ�ʽ
 *   �ӿ�Iterator  ���������󷽷�
 *     Boolean hasNext���� �жϼ����л���û�п���ȡ������Ԫ��  ����з���true
 *     next���� ȥ�������е���һ��Ԫ�� 
 *     
 *   Iterator�ӿڣ�Ҫ��ʵ���࣬��д�ӿڷ���
 *     Collection �ӿ��ж�����һ������ Iterator
 *     Iterator iterator()
 *    ArrayList ��д����iterator���� ������Iterator�ӿڵ�ʵ�������
 *    ʹ��ArrayList���ϵĶ���  
 *    Iterator it = array.iterator()   ���н����Iterator�ӿڵ�ʵ�������
 *    it �ǽӿ�ʵ����Ķ���   it.hasNext()   it.next(); 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("juju6");
		coll.add("juju5");
		coll.add("juju4");
		coll.add("juju3");
		coll.add("juju2");
		coll.add("juju1");
		Iterator<String> i = coll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	

}
