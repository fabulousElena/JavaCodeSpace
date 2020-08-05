package streamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *  ת����
 *    java.io.OutputStreamWriter �̳�Writer��
 *    ����һ���ַ��������д�ı��ļ�
 *    write()�ַ����ַ����飬�ַ���
 *    
 *    �ַ�ͨ���ֽڵ����������ַ���ת�ֽ���
 *    
 *    OutputStreamWriter ʹ�÷�ʽ
 *     ���췽����
 *       OutputStreamWriter(OuputStream out)�������е��ֽ������
 *       ���ǣ� �ֽ��������  FileOutputStream
 *       
 *      OutputStreamWriter(OutputStream out, String charsetName)
 *      String charsetName ���ݱ�������� GBK  UTF-8 
 *      
 *      OutputStreamWriter �и����࣬  FileWriter
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args)throws IOException {
		writeGBK();
//		writeUTF();
	}
	/*
	 * ת��������OutputStreamWriterд�ı�
	 * ����UTF-8�����д��
	 */
	public static void writeUTF()throws IOException{
		//�����ֽ�����������ļ�
		FileOutputStream fos = new FileOutputStream("f:\\utf.txt");
		//����ת�������󣬹��췽����֤�ֽ����������ָ���������UTF-8
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("���");
		osw.close();
	}
	
	/*
	 * ת�������� OutputStreamWriterд�ı�
	 * �ı�����GBK����ʽд��
	 */
	public static void writeGBK()throws IOException{
		//�����ֽ���������������ļ�
		FileOutputStream fos = new FileOutputStream("f:\\gbk.txt");
		//����ת�������󣬹��췽�������ֽ��������ʹ��GBK�����
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//ת����д����
		osw.write("���");
		
		osw.close();
	}
}
