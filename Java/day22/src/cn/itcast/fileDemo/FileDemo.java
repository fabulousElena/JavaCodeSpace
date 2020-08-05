package cn.itcast.fileDemo;

import java.io.File;

/*
 *  java.io.File
 *    将操作系统中的,文件,目录(文件夹),路径,封装成File对象
 *    提供方法,操作系统中的内容
 *    File与系统无关的类
 *    文件 file
 *    目录 directory
 *    路径 path
 */
public class FileDemo {

	public static void main(String[] args) {
		//File类静态成员变量
		//与系统有关的路径分隔符
		System.out.println(File.pathSeparator);
		//输出结果是 ; 路径分隔符，目录分隔符 LINUX分隔符是 : 
		
		//与系统有关的默认名称分隔符
		System.out.println(File.separator);//向右 \  目录名称分割  Linux /
	}
}
