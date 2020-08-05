package cn.itcast.MathDemo;
/*
 * 数学计算的工具类  
 * java.lang.Math 静态方法组成
 */
public class MathDemo {
	public static void main(String[] args) {
		function6();
	}
	
	/*
	 * static double round(double d)
	 * 获取参数的四舍五入   取整数
	 */
	public static void function6() {
		double d = Math.round(3.92541544330);
		System.out.println(d);
	}
	
	/*
	 * static double random() 返回一个随机数   0.0--1.0之间
	 * 来源是Random类
	 * 
	 */
	public static void function5() {
		
		for(int i = 0 ; i < 10 ; i ++) {
			double d = Math.random();
		    System.out.println(d);
		}
	}
	
	/*
	 * static double sqrt(double a )
	 * 返回参数的平方根
	 */
	public static void function4() {
		double d = Math.sqrt(3);
		System.out.println(d);
	}
	
	/*
	 * static double pow（double a ,double b）
	 * 返回第一个参数的第二个参数的次幂值  a的b次方
	 */
	public static void function3() {
		double d = Math.pow(2, 3.3);
		System.out.println(d);
	}
	
	/*
	 * static double floor（double d）
	 * 返回小于或者等于参数d的最大整数
	 */
	
	/*
	 * static double ceil(double d)
	 * 返回大于或者等于参数d的最小整数
	 */
	public static void function2() {
		double d = Math.ceil(53.1);
		System.out.println(d);
		double d1 = Math.floor(1.2);
		System.out.println(d1);
	}
	
	/*
	 * static int abs(int i )
	 * 返回参数的绝对值
	 */
	public static void function() {
		int i = Math.abs(-99);
		System.out.println(i);
	}

}
