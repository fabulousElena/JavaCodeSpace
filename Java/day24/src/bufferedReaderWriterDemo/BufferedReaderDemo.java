package bufferedReaderWriterDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  �ַ�������������
 *    java.io.BufferedReader �̳� Reader
 *    ��ȡ���� read() �����ַ�,�ַ�����
 *    ���췽��:
 *      BufferedReader(Reader r)
 *      ����������ַ�������
 *         FileReader  InputStreamReader
 *         
 *     BufferedReader�Լ��Ĺ���
 *     String readLine() ��ȡ�ı��� \r\n
 *     
 *     ������ȡ����ĩβ,����null
 *     С�ص�:
 *       ��ȡ���ݵķ���һ�㶼�з���ֵ
 *       int û�з��صĶ��Ǹ���
 *       �������� �Ҳ�������null
 *       boolean �Ҳ�������false
 *       
 *       String s = null
 *       String s ="null"
 *       
 *       readLine()���������е���Ч�ַ�,û��\r\n
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		int lineNumber = 0;
		//�����ַ�����������������,���췽�������ַ�������,��װ����Դ�ļ�
		BufferedReader bfr = new BufferedReader(new FileReader("f:\\a.txt"));
		//���û������ķ��� readLine()��ȡ�ı���
		//ѭ����ȡ�ı���, �������� readLine()����null
		String line = null;
		while((line = bfr.readLine())!=null){
			lineNumber++;
			System.out.println(lineNumber+"  "+line);
		}
		bfr.close();
	}
}

/*
 * String line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
 */



