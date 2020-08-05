package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {

	public static void main(String[] args) {
		//集合可以存储任意类型的对象
		//集合中，不指定存储的数据类型，集合什么都可以存。
		Collection coll = new ArrayList();
		coll.add("dwad");
		coll.add("232");
		
		//迭代器怎么获取
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			//it.next()获取出来的是Object类型
			//System.out.println(it.next());
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}
