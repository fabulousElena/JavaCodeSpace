package bufferedStreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  �ֽ�������Ļ�����
 *   java.io.BufferedOuputStream ����: ���ԭ���������д��Ч��
 *   BufferedOuputStream �̳� OutputStream
 *   ����,д�� write �ֽ�,�ֽ�����
 *   
 *   ���췽��:
 *     BufferedOuputStream(OuputStream out)
 *     ���Դ���������ֽ������, ���ݵ����ĸ��ֽ���,�Ͷ��ĸ��ֽ������Ч��
 *     
 *     FileOutputSteam
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args)throws IOException {
		//�����ֽ������,���ļ�
		//FileOutputStream fos = new FileOutputStream("c:\\buffer.txt");
		//�����ֽ�������������Ķ���,���췽����,�����ֽ������
		BufferedOutputStream bos = new
				BufferedOutputStream(new FileOutputStream("f:\\buffer.txt"));
		
		bos.write(55);
		String s = "dwadasdadwsadawwŶ��������";
		byte[] bytes = "HelloWorld".getBytes();
		
		bos.write(bytes);
		
		bos.write(bytes, 3, 2);
		bos.write(s.getBytes());
		
		bos.close();
	}
}
