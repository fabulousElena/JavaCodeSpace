package copyDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_1Demo {

	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("f:\\7z1902-x64.exe");
			fos = new FileOutputStream("e:\\a.exe");
			
			int len = 0;
			
			byte[] b = new byte[1024*10];
			
			while ((len = fis.read(b)) != -1) {
				fos.write(b,0,len);
			}
		}catch(IOException ex) {
			throw new RuntimeException("复制异常");
		}finally{
			try{
				if(fos!=null)
					fos.close();
			}catch(IOException ex){
				throw new RuntimeException("释放资源失败");
			}finally{
				try{
					if(fis!=null)
						fis.close();
				}catch(IOException ex){
					throw new RuntimeException("释放资源失败");
				}
			}
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		
	}
}
