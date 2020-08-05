package cn.itcast.fileDemo;
import java.io.File;

/*
 *  File��Ĺ��췽��
 *  ����������ʽ
 */
public class FileDemo01 {

	public static void main(String[] args) {
		function2();
	}
	/*
	 *  File(File parent,String child)
	 *  ����·��,����File���͸�·��,�ַ�����·��
	 *  �ô�: ��·����File����,��·������ֱ�ӵ���File�෽��
	 */
	public static void function2(){
		File parent = new File("d:");
		File file = new File(parent,"eclipse");
		System.out.println(file);
	}
	
	/*
	 *  File(String parent,String child)
	 *  ����·��,�����ַ�����·��,�ַ�����·��
	 *  �ô�: ����������·������·��
	 */
	public static void function1(){
		File file = new File("d:","eclipse");
		System.out.println(file);
	}
	
	
	/*
	 *  File(String pathname)
	 *  ����·����: ����д���ļ���,����д��һ���ļ�
	 *  c:\\abc   c:\\abc\\Demo.java
	 *  ��·����װFile���Ͷ���
	 */
	public static void function() {
		File file = new File("f:\\�����ļ�\\1.txt");
		System.out.println(file);
	}
}










