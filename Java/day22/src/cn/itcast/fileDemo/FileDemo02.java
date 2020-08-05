package cn.itcast.fileDemo;



import java.io.File;
import java.io.IOException;

/*
 *  File��Ĵ�����ɾ������
 *  �ļ�������Ŀ¼
 */
public class FileDemo02 {
	public static void main(String[] args)throws IOException {
		function2();
	}
	/*
	 *  File���ɾ������
	 *  boolean delete()
	 *  ɾ�����ļ��������ļ���,��File���췽���и���
	 *  ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
	 *  ɾ������,���߻���վ,ֱ�Ӵ�Ӳ����ɾ��
	 *  ɾ���з���,���������
	 */
	public static void function2(){
		File file = new File("F:\\�����ļ�\\1.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	
	/*
	 *  File�����ļ��й���
	 *  boolean mkdirs() ��������ļ���
	 *  ������·��Ҳ��File���췽���и���
	 *  �ļ����Ѿ�������,���ڴ���
	 */
	public static void function1(){
		File file = new File("F:\\�����ļ�\\abc");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	
	/*
	 *  File�����ļ��Ĺ���
	 *  boolean createNewFile()
	 *  �������ļ�·�����ļ���,��File���췽���и���
	 *  �ļ��Ѿ�������,���ڴ���
	 *  ֻ�ܴ����ļ�
	 */
	public static void function()throws IOException{
		File file = new File("F:\\�����ļ�\\a.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}

