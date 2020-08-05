package cn.itcast.fileDemo1;


import java.io.File;

/*
 *  File���ȡ����
 *  list
 *  listFiles
 */
public class FileDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function2(){
		//��ȡϵͳ�е����и�Ŀ¼
		File[] fileArr = File.listRoots();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  File[] listFiles()
	 *  ��ȡ��,File���췽���з�װ��·���е��ļ����ļ����� (����һ��Ŀ¼)
	 *  ���ص���Ŀ¼�����ļ���ȫ·��
	 */
	public static void function1(){
		File file = new File("f:\\study");
		File[] fileArr = file.listFiles();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  String[] list()
	 *  ��ȡ��,File���췽���з�װ��·���е��ļ����ļ����� (����һ��Ŀ¼)
	 *  ����ֻ������
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
