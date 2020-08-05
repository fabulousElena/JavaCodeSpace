package cn.itcast.ListDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 迭代器的并发修改异常，java.util.ConcurrentModificationException
 * 就是在遍历的过程中，使用了集合方法修改了集合的长度。这是不允许的。
 */
public class ListDemo01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("adbc1");
		list.add("adbc13");
		list.add("adbc12");
		list.add("adbc2");
		//对集合使用迭代器进行获取，获取的同时判断集合中是否存在“adbc2”对象
		//如果有，添加一个元素“ADBC1”
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			//对获取出的元素进行判断，是否有“adbc2”
			if(s.equals("adbc2")) {
				list.add("ADBC1");
			}
			System.out.println(s);
		}
	}

}
