package streamDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  ת����
 *    java.io.InputStreamReader �̳� Reader
 *    �ַ�����������ȡ�ı��ļ�
 *    
 *    �ֽ������ַ������ˣ����ֽ���ת�ַ���
 *    
 *    ��ȡ�ķ���:
 *       read() ��ȡ1���ַ�����ȡ�ַ�����
 *    
 *    ���ɣ�  OuputStreamWriterд���ļ�
 *    InputStreamReader��ȡ�ļ�
 *    
 *    OuputStreamWriter(OuputStream out)�����ֽ������
 *    InputStreamReader(InputStream in) �������е��ֽ�������
 *      ���Դ��ݵ��ֽ��������� FileInputStream
 *    InputStreamReader(InputStream in,String charsetName) ���ݱ���������
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		readGBK();
//		readUTF();
	}
	/*
	 *  ת����,InputSteamReader��ȡ�ı�
	 *  ����UTF-8�����,��ȡ�ļ�utf
	 */
	public static void readUTF()throws IOException{
		//�����Լ�������,�����ı��ļ�
		FileInputStream fis = new FileInputStream("f:\\utf.txt");
		//����ת��������,���췽����,��װ�ֽ�������,ͬʱд�������
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		char[] ch = new char[1024];
		int len = isr.read(ch);
		System.out.println(new String(ch,0,len));
		isr.close();
	}
	/*
	 *  ת����,InputSteamReader��ȡ�ı�
	 *  ����ϵͳĬ�ϱ����,��ȡGBK�ļ�
	 */
	public static void readGBK()throws IOException{
		//�����Լ�������,�����ı��ļ�
		FileInputStream fis = new FileInputStream("f:\\gbk.txt");
		//����ת��������,���췽��,��װ�ֽ�������
		InputStreamReader isr = new InputStreamReader(fis);
		char[] ch = new char[1024];
		int len = isr.read(ch);
		System.out.println(new String(ch,0,len));
		
		isr.close();
	}
}





