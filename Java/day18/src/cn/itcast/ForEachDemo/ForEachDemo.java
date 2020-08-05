package cn.itcast.ForEachDemo;
import java.util.ArrayList;

/*
 * 增强for循环
 * 新的接口  java.lang.Iterable 
 *   Collection开始继承Iterable 
 *   Iterable 实现增强for循环
 *   
 *   格式：
 *   for( 数据类型 变量名 : 数据或者是集合){
 *        syso(变量)；
 *   }
 */
import cn.itcast.ArrayListDemo.Person;
public class ForEachDemo {
	public static void main(String[] args) {
		function3();
	}
	
	/*
	 * 增强for循环遍历集合
	 * 存储自定义的Person类型
	 */
	public static void function3() {
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(new Person("a",20));
		arr.add(new Person("b",30));
		for(Person p : arr) {
			System.out.println(p);
		}
	}
	
	/*
	 * for 对于对象数组遍历的时候，能否去调用对象的方法呢？
	 * yes
	 * 
	 */
	public static void function2() {
		String[] str = {"12da","wda223","2d4r"};
		for(String s : str) {
			System.out.println(s.length());
		}
	}
	
	/*
	 * 实现增强for循环  
	 * 好处：代码少  方便了对容器进行遍历
	 * 弊端：没有索引，不能操作容器内的元素
	 */
	public static void function() {
		int[] arr = {1,0};
		for(int i : arr) {
			System.out.println(i+1);
		}
		System.out.println(arr[0]);
	}

}
