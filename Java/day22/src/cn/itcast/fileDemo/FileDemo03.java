package cn.itcast.fileDemo;



import java.io.File;

/*
 *  File��Ļ�ȡ����
 */
public class FileDemo03 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * File��Ļ�ȡ����
	 * String getParent() ����String����
	 * File getParentFile()����File����
	 * ��ȡ��·��
	 */
	public static void function3(){
		File file = new File("d:\\eclipse\\eclipse.exe");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 * File���ȡ����
	 * String getAbsolutePath() ����String����
	 * File   getAbsoluteFile() ����File����
	 * ��ȡ����·��
	 * eclipse������,д����һ�����·��,����λ�ù��̸�Ŀ¼
	 */
	public static void function2(){
		File file = new File("src");
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	
	/*
	 * File���ȡ����
	 * long length()
	 * ����·���б�ʾ���ļ����ֽ���
	 */
	public static void function1(){
		File file = new File("F:\\�����ļ�\\�½��ļ���\\1.txt");
		long length = file.length();
		System.out.println(length);
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  String getName()
	 *  ����·���б�ʾ���ļ������ļ�����
	 *  ��ȡ·���е���󲿷ֵ�����
	 */
	public static void function(){
		File file = new File("F:\\�����ļ�\\�½��ļ���\\1.txt");
		String name = file.getName();
		System.out.println(name);
		
		/*String path = file.getPath();
		System.out.println(path);*/
//		System.out.println(file);
	}
}

