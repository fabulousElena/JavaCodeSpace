package cn.itcast.StaticImportDemo;
/*
 * 方法的可变参数
 * 前提：方法的参数数据类型确定，但是参数的个数任意
 * 语法：数据类型...变量名
 * 可变参数的本质上就是一个数组
 */
public class VarArgumentsDemo {

	public static void main(String[] args) {
		//调用一个带有可变参数的方法，传递的参数可以任意
		getSum();
		int sum = getSum(1,3,5,2,66,5,4,3,6,5,5,5,5,5,5,5);
		System.out.println(sum);
	}
	public static int getSum(int...a) {
		int sum = 0 ;
		for(int i : a) {
			sum = sum + i;	
		}
		return sum;
	}
	
	/*
	 * 可变参数的注意事项
	 * 1.一个方法中，可变参数只能有一个
	 * 2.可变参数必须写啊在参数列表的最后一位
	 */
	public static void function(int...a) {
		
	}
	
//	/*
//	 * 定义方法，计算两个整数和
//	 */
//	public static int getSum(int a,int b) {
//		return a + b;
//	}
}
