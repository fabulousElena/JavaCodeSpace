package cn.itcast.throwDemo;
/*
 * 异常的处理方式
 *   try .. catch   
 *   格式  
 *     try{
 *        被检查的代码
 *        可能出现的代码
 *     }catch(异常类名  变量){
 *        异常的处理方式
 *     }finally{
 *        必须要执行的代码
 *     }
 */
public class ExceptionDemo02 {

	public static void main(String[] args){
		int[] arr = null;
		try {
			int i = getArray(arr);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("程序结束");
	}
	
	/*
	 * 定义方法，在方法中抛出异常
	 */
	public static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
		//对数组判空 
		if(arr == null) {
			//手动抛出异常,抛出空指针异常
			throw new NullPointerException("数组不存在");
		}
		//对数组的索引进行判断
		if(arr.length < 3) {
			//手动抛出异常，抛出数组的索引越界异常
			throw new ArrayIndexOutOfBoundsException("数组越界异常");
		}
		return arr[3]+1;
	}
	
}
