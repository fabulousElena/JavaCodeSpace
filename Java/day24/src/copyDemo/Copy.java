package copyDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  �ļ����Ʒ�ʽ,�ֽ���,һ��4����ʽ
 *  1. �ֽ�����д�����ֽ�                    125250 ����            4457 
 *  2. �ֽ�����д�ֽ�����                    193    ����  OK  34
 *  3. �ֽ�������������д�����ֽ�     1210   ����            55
 *  4. �ֽ�������������д�ֽ�����     73     ����  OK  6
 */
public class Copy {
	public static void main(String[] args)throws IOException {
		long s = System.currentTimeMillis();
		copy_4(new File("f:\\7z1902-x64.exe"), new File("e:\\7z1902-x64.exe"));
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
	/*
	 * ����,ʵ���ļ�����
	 *  4. �ֽ�������������д�ֽ�����
	 */
	public static void copy_4(File src,File desc)throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0 ;
		byte[] bytes = new byte[1024];
		while((len = bis.read(bytes))!=-1){
			bos.write(bytes,0,len);
		}
		bos.close();
		bis.close();
	}
	/*
	 * ����,ʵ���ļ�����
	 *  3. �ֽ�������������д�����ֽ�
	 */
	public static void copy_3(File src,File desc)throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0 ;
		while((len = bis.read())!=-1){
			bos.write(len);
		}
		bos.close();
		bis.close();
	}
	
	/*
	 * ����,ʵ���ļ�����
	 *  2. �ֽ�����д�ֽ�����
	 */
	public static void copy_2(File src,File desc)throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		int len = 0 ;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes))!=-1){
			fos.write(bytes,0,len);
		}
		fos.close();
		fis.close();
	}
	
	/*
	 * ����,ʵ���ļ�����
	 *  1. �ֽ�����д�����ֽ�
	 */
	public static void copy_1(File src,File desc)throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		int len = 0 ;
		while((len = fis.read())!=-1){
			fos.write(len);
		}
		fos.close();
		fis.close();
	}
}
