package cn.itcast.fileDemo1;


import java.io.File;

/*
 *  File类获取功能
 *  list
 *  listFiles
 */
public class FileDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function2(){
		//获取系统中的所有根目录
		File[] fileArr = File.listRoots();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File类的获取功能
	 *  File[] listFiles()
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回的是目录或者文件的全路径
	 */
	public static void function1(){
		File file = new File("f:\\study");
		File[] fileArr = file.listFiles();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File类的获取功能
	 *  String[] list()
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回只有名字
	 */
	public static void function(){
		File file = new File("c:");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String str : strArr){
			System.out.println(str);
		}
	}
}
