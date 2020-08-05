package copyDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("f:\\a.txt");
		fos = new FileOutputStream("e:\\b.txt");
		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
	}catch(IOException ex) {
		System.out.println(ex);
		throw new RuntimeException("�ļ�����ʧ�ܣ�");
	}finally {
		try {
			if(fos != null) {
				fos.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException("�ر��쳣");
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException ex) {
				throw new RuntimeException("�ر��쳣");
			}
		}
		
	}
	
}
}
