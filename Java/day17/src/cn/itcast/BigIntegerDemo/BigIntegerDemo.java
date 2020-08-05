package cn.itcast.BigIntegerDemo;

import java.math.BigInteger;

/*
 * 超级大的整数运算
 *     超过long取值范围整数，封装成BigInteger类型的对象
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * BigInteger对象的四则运算
	 * 调用方法计算   计算的结果也只能是BigInteger的对象
	 */
	public static void function2() {
		BigInteger bi = new BigInteger("32131231111111121312321412512");
		BigInteger bi1 = new BigInteger("321312311111111212313113213213131321312321412512");
		
		//计算之和 add
		BigInteger b = bi.add(bi1);
		System.out.println(b);
		
		//计算之差 suntract
		BigInteger b2 = bi.subtract(bi1);
		System.out.println(b2);
		
		//计算乘积   multiply 
		BigInteger b3 = bi.multiply(bi1);
		System.out.println(b3);
		
		//计算商   divide
		BigInteger b4 = bi1.divide(bi);
		System.out.println(b4);
	}
	
	/*
	 * BigInteger类的构造方法
	 *  传递字符串，要求数字格式，没有长度限制
	 */
	public static void function() {
		BigInteger bi = new BigInteger("32131231111111121312321412512");
		System.out.println(bi);
		BigInteger bi1 = new BigInteger("321312311111111212313113213213131321312321412512");
		System.out.println(bi1);
		
	}

}
