package cn.itcast.GenericDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ���з��͵Ľӿ�
 *   public interface List<E>{
 *   
 *   }
 *   
 *   ʵ���࣬��ʵ�ֽӿڣ�����᷺�͡�
 *   
 *   ���͵�ͨ���  
 *     ? 
 */
public class GenericDemo03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		arr.add("21");
		arr.add("23d");
		set.add(2123);
		set.add(2324);
		
		iterator(arr);
		iterator(set);
		
	}
	/*
	 * ���巽����ͬʱ������������
	 * ����ֵ  �� 
	 * ���� �� ��ôʵ�� ���Ȳ���дArrayList Ҳ����дhashset
	 * д����  ���߹�ͬʵ�ֵĽӿ�
	 */
	public static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			//it.next() ��ȡ�Ķ��󵽵���ʲô���ͣ�
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
