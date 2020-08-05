package cn.itcast.BigIntegerDemo;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		/*
		 * 计算结果，未知   
		 * 原因：在计算机的二进制中，表示浮点数不精确造成的
		 * 超级大型的浮点数据，提供高精度的浮点运算BigDecimal
		 * 和BigInteger运算方法一样
		 */
		System.out.println(0.09+0.01);
		System.out.println(1.0-0.32);
		System.out.println(1.015*100);
		System.out.println(1.301/100);
		function();
		
	}
	
	/*
	 * BigDecimal实现除法运算
	 * divide(BigDecimal divisor, int scale, int roundingMode) 
	 * int scale:保留几位小数
	 * int int roundingMode： 保留模式
	 * 保留模式阅读API
	 * ROUND_UP 向上加一
	 * 
	 * ROUND_DOWN  直接舍去
	 * 
	 * static int ROUND_HALF_UP >=0.5  直接+1
	 * 
	 * static int ROUND_HALF_DOWN 
	 */
	@SuppressWarnings("deprecation")
	public static void function() {
		BigDecimal b1 = new BigDecimal("1.301");
		BigDecimal b2 = new BigDecimal("100");
		BigDecimal b3 = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(b3);
	}

}
