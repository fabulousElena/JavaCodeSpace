/*
 * 方法的重载特性 （overload）
 * 在同一个类中，允许出现同名的方法，只要方法的参数列表即可，这样就是重载
 * 参数列表不同：参数的个数、数据类型、顺序
 * 
 * 方法重载的注意事项：
 *   1.参数列表必须不同，相同就会报错
 *   2.方法的重载和参数里的变量名无关 （int a ,int b）==(int i ,int j)
 *   3.方法的重载和返回值类型无关
 *   4.方法的重载和修饰符无关
 * ：技巧：重载只看方法名和参数列表
 * 
 * 方法调用中的参数传递问题
 *   1.方法参数是基本数据类型
 *   2.方法参数是引用类型--传递的是内存地址
 */

public class methodOverLoadDemo {

	public static void main(String[] args) {
		//对于重载的调用，是根据参数传递进行区分
		System.out.println(getSum(2.1,3));
		int a = 1;
		int b = 2;
		change(a,b);
		System.out.println(a);
		System.out.println(b);
		int[] arr = {1,2,3,4};
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr[2]);
		
	}
	public static void change(int [] arr) {
		arr[2] = 100;
	}
	
	public static void change(int a,int b) {
		a = a+b;
		b = b+a;
	}
	
	//对参数求和，利用方法的重载特性
	public static int getSum(int a, int b) {
		System.out.println("两个int参数");
		return a+b;
	}
	
	public static int getSum(int a,int b,int c) {
		System.out.println("三个int参数");
		return a+b+c;
	}
	
	public static double getSum(double a,double b) {
		System.out.println("两个double参数");
		return a+b;
	}
	/*public static int getSum(int a, int  b) {
		return a + b ;
	}
	
	public static double getSumDouble(double a , double b) {
		return a + b;
	}
	
	public static int getSum3(int a,int b,int c) {
		return a+b+c;
	}*/

}
