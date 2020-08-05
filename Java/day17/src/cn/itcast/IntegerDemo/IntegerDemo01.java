package cn.itcast.IntegerDemo;
/*
 * Integer类中的其他方法
 * 包括三个方法，和两个静态的成员变量
 */
public class IntegerDemo01 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 * Integer类的三个静态方法
	 * 做进制的转换
	 * 十进制转成二进制  toBinarString（int）
	 * 十进制转成八进制  toOctalString(int)
	 * 十进制换成16进制 toHexString(int)
	 * 三个方法的返回值都是以String的形式出现
	 */
	public static void function1() {
		System.out.println(Integer.toBinaryString(999));
		System.out.println(Integer.toOctalString(999));
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer 的静态成员变量
	 * MAX_VALUE
	 * MIN_VALUE
	 */
	public static void function() {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}

}
