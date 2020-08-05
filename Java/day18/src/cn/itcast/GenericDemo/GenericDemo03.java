package cn.itcast.GenericDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 带有泛型的接口
 *   public interface List<E>{
 *   
 *   }
 *   
 *   实现类，先实现接口，不理会泛型。
 *   
 *   泛型的通配符  
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
	 * 定义方法，同时迭代两个集合
	 * 返回值  无 
	 * 参数 ： 怎么实现 ，既不能写ArrayList 也不能写hashset
	 * 写父类  或者共同实现的接口
	 */
	public static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			//it.next() 获取的对象到底是什么类型？
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
