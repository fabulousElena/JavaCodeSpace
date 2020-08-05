package cn.itcast.IntegerDemo;
/*
 * JDK1.5以后出现的特性，自动装箱和自动拆箱
 *   自动装箱：基本数据类型，直接变为对象
 *   自动拆箱：对象中的数据变回基本数据类型
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * 关于自动装箱拆箱的题目
	 * 
	 */
	public static void function3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i.equals(j));
		System.out.println(i==j);
		
		System.out.println("=============");
		
		Integer a = 500;
		Integer b = 500;
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println("=============");
		
		//数据在byte范围内，JVM不会重新new对象
		Integer aa = 128;// Integer aa = new Integer(127);
		Integer bb = 128;// Integer bb = aa;
		System.out.println(aa.equals(bb));
		System.out.println(aa==bb);
		
	}
	
	public static void function2() {
		//自动装箱拆箱的弊端   有可能出现空指针异常
		Integer in = null;
		in = in + 1 ;
		System.out.println(in);
		
	}
	
	//自动装箱拆箱的好处。
	//将基本类型和引用类型直接运算
	public static void function() {
		//引用类型，引用变量一定指向对象   自动装箱，基本数据类型1 ，直接变成了对象
		Integer in = 1;// Integer in = new Integer(1);
		//in 本质上是引用数据类型  引用类型是不可以和基本数据类型运算的
		//自动拆箱， 自动把 引用数据类型 拆箱为  基本数据类型
		in = in + 1;
		System.out.println(in.toString());
	}

}
