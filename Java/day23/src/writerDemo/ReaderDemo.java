package writerDemo;

import java.io.FileReader;
import java.io.IOException;

/*
 *  �ַ���������ȡ�ı��ļ�,�����ַ��������ĳ���
 *    java.io.Reader
 *  ר�Ŷ�ȡ�ı��ļ�
 *  
 *  ��ȡ�ķ��� : read()
 *   int read() ��ȡ1���ַ�
 *   int read(char[] c) ��ȡ�ַ�����
 *   
 *   Reader���ǳ�����,�ҵ�������� FileReader
 *   
 *   ���췽��: ������Դ
 *     ����:
 *        File  ���Ͷ���
 *        String�ļ���
 */
public class ReaderDemo {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("f:\\1.txt");
		/*int len = 0 ;
		while((len = fr.read())!=-1){
			System.out.print((char)len);
		}*/
		char[] ch = new char[1024];
		int len = 0 ;
		while((len = fr.read(ch))!=-1){
			System.out.print(new String(ch,0,len));
		}
		
		fr.close();
	}
}
