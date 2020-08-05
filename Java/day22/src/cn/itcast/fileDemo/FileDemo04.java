package cn.itcast.fileDemo;



import java.io.File;

/*
 *  File类的判断功能
 */
public class FileDemo04 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 *  File判断功能
	 *  boolean isDirectory()
	 *  判断File构造方法中封装的路径是不是文件夹
	 *  如果是文件夹,返回true,不是文件返回false
	 *  
	 *  boolean isFile()
	 *  判断File构造方法中封装的路径是不是文件
	 */
	public static void function1(){
		File file = new File("F:\\杂项文件\\新建文件夹\\11.txt");
		if(file.exists()){
			boolean b = file.isDirectory();
			System.out.println(b);
		}else {
			System.out.println("不存在");
		}
		
	}
	
	/*
	 *  File判断功能
	 *  boolean exists()
	 *  判断File构造方法中封装路径是否存在
	 *  存在返回true,不存在返回false
	 */
	public static void function(){
		File file = new File("1");
		boolean b = file.exists();
		System.out.println(b);
	}
}
