package bufferedReaderWriterDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 *   �ַ��������������
 *     java.io.BufferedWriter �̳� Writer
 *     д�뷽�� write () �����ַ�,�ַ�����,�ַ���
 *     
 *     ���췽��:
 *       BufferedWriter(Writer w)���������ַ������
 *       ����˭,�͸�Ч˭
 *         �ܴ��ݵ��ַ������ FileWriter, OutputStreamWriter
 *         
 *    BufferedWriter �����Լ����еķ���
 *      void  newLine() д����
 *      
 *       newLine()�ı��л���, \r\nҲ���ı�����
 *       ��������ƽ̨�޹���
 *       Windows  \r\n
 *       Linux    \n
 *       
 *       newLine()���н��,�Ͳ���ϵͳ���໥��ϵ
 *       JVM: ��װ����Windows�汾,newLine()д�ľ���\r\n
 *            ��װ����Linux�汾,newLine()д�ľ���\n
 */
public class BufferedWrierDemo {
	public static void main(String[] args) throws IOException{
		//�����ַ������,��װ�ļ�
		FileWriter fw = new FileWriter("c:\\buffer.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("���");
		bfw.newLine();
		bfw.flush();
		
		
		bfw.write("�Һú�");
		bfw.newLine();
		bfw.flush();

		bfw.write("��Ҷ���");
		bfw.flush();
		
		bfw.close();
		
	}
}

/*
 * 		
		bfw.write(100);
		bfw.flush();
		
		bfw.write("���".toCharArray());
		bfw.flush();*/
