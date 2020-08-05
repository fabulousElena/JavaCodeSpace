package copyDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  ʹ�û�����������,�����ı��ļ�
 *  ����Դ  BufferedReader+FileReader ��ȡ
 *  ����Ŀ�� BufferedWriter+FileWriter д��
 *  ��ȡ�ı���, ��һ��,дһ��,д����
 */
public class Copy_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new FileReader("c:\\w.log"));	
		BufferedWriter bfw = new BufferedWriter(new FileWriter("d:\\w.log"));
		//��ȡ�ı���, ��һ��,дһ��,д����
		String line = null;
		while((line = bfr.readLine())!=null){
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
		bfr.close();
	}
}
