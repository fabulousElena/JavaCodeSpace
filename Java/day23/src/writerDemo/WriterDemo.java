package writerDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
 *   �ַ������
 *     java.io.Writer �����ַ�������ĳ���
 *   д�ļ�,д�ı��ļ�
 *   
 *   д�ķ��� write
 *     write(int c) д1���ַ�
 *     write(char[] c)д�ַ�����
 *     write(char[] c,int,int)�ַ�����һ����,��ʼ����,д����
 *     write(String s) д���ַ���
 *     
 *   Writer���������� FileWriter
 *   
 *   ���췽��:  д�������Ŀ��
 *     File ���Ͷ���
 *     String �ļ���
 *     
 *   �ַ������д���ݵ�ʱ��,����Ҫ����һ������,ˢ�¹���
 *   flush()
 */
public class WriterDemo {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("f:\\1.txt");
		
		//д1���ַ�
		fw.write(100);
		fw.flush();
		
		//д1���ַ�����
		char[] c = {'a','b','c','d','e'};
		fw.write(c);
		fw.flush();
		
		//д�ַ�����һ����
		fw.write(c, 2, 2);
		fw.flush();
		
		//д���ַ���
		fw.write("hello");
		fw.flush();
		
		fw.close();
	}
}
