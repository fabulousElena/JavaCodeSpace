package cn.itcast.fileDemo;



import java.io.File;

/*
 *  File����жϹ���
 */
public class FileDemo04 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 *  File�жϹ���
	 *  boolean isDirectory()
	 *  �ж�File���췽���з�װ��·���ǲ����ļ���
	 *  ������ļ���,����true,�����ļ�����false
	 *  
	 *  boolean isFile()
	 *  �ж�File���췽���з�װ��·���ǲ����ļ�
	 */
	public static void function1(){
		File file = new File("F:\\�����ļ�\\�½��ļ���\\11.txt");
		if(file.exists()){
			boolean b = file.isDirectory();
			System.out.println(b);
		}else {
			System.out.println("������");
		}
		
	}
	
	/*
	 *  File�жϹ���
	 *  boolean exists()
	 *  �ж�File���췽���з�װ·���Ƿ����
	 *  ���ڷ���true,�����ڷ���false
	 */
	public static void function(){
		File file = new File("1");
		boolean b = file.exists();
		System.out.println(b);
	}
}
