package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {

	public static void main(String[] args) {
		//���Ͽ��Դ洢�������͵Ķ���
		//�����У���ָ���洢���������ͣ�����ʲô�����Դ档
		Collection coll = new ArrayList();
		coll.add("dwad");
		coll.add("232");
		
		//��������ô��ȡ
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			//it.next()��ȡ��������Object����
			//System.out.println(it.next());
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
