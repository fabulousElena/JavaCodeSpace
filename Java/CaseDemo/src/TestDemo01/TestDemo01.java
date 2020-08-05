package TestDemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TestDemo01 {
	public static void main(String[] args) {
		function3();
	}
	
	/*
	 * 迭代测试2
	 */
	public static void function3() {
		Collection<String> cl = new ArrayList<String>();
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		cl.add("adwadwada");
		Iterator<String> it = cl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		cl.add("爱我的挖的挖符文");
		System.out.println("================");
		for(Iterator<String> s = cl.iterator();s.hasNext();) {
			System.out.println(s.next());
		}
		
	}
	
	/*
	 * 迭代
	 */
	public static void function2() {
		Collection<String> cl = new ArrayList<String>();
		cl.add("等晚点");
		cl.add("大我才是");
		cl.add("达瓦大哥");
		cl.add("法法");
		cl.add("讽德诵功个");
		Iterator<String> it = cl.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/*
	 * 增强for
	 * for (数组类型  s : 数组名){
	 *      syso();
	 *   }
	 */
	public static void function() {
		int[] arr = {2,3,4,11,2,4,5,6,7,45,4,54,53,53,53,5,345,35,34,5,3};
		for(int i : arr) {
			System.out.println(i);
		}
		String s = Arrays.toString(arr);
		System.out.println(s);
		
	}
	

}
