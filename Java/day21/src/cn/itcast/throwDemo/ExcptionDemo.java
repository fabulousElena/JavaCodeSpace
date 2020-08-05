package cn.itcast.throwDemo;
/*
 * 异常中的关键字 
 *   throw ，在方法的内部，抛出异常的对象
 *   throw 的后面，必须写new的对象，对象必须是异常的对象Exception或者其子类
 *   
 *   方法中声明异常关键字 throws
 *   用于在方法的声明上，标明出来此方法可能出现异常
 *   请调用者处理
 *   throws后面必须写异常类的类名 
 *   
 *   调用了一个抛出异常的方法，调用者就必须处理，不处理就编译失败
 */
public class ExcptionDemo {

	public static void main(String[] args) throws Exception {
		
		int[] arr1 = {};
		getArray(arr1);
	}
	//对数组的最后索引乘以2 返回
	public static int getArray(int[] arr) throws Exception{
		//对方法的参数，进行合法性的判断 ，进行判断是不是null 
		if(arr.equals(null)) {
			//抛出异常的形式老告诉调用者
			//关键字  throw 必须写在方法的内部  
			throw new Exception("传参错误");
		}
		
		//继续对数组进行判断，判断数组中是不是有元素
		if(arr.length == 0) {
			//抛出异常的形式，告诉调用者，数组没有元素
			throw new Exception("数组没有元素");
		}
		
		int i  = arr.length-1;
		return i*2;
	}
}
