package cn.itcast.GenericDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * JDK 1.5  出现了新的安全机制   保证程序的安全性
 * 泛型：指明了集合中存储的数据类型。 <数据类型>
 */
public class GenericDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("2d2dad");
		coll.add("dagdhh");
		coll.add("23r343");
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			String s = it.next();
			System.out.println(s.length());
		}
		
	}

}
