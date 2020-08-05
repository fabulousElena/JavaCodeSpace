package writerDemo;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("f:\\a.txt");
			fw = new FileWriter("e:\\a.txt");
			
			int len = 0;
			char[] ch = new char[1024];
			
			while((len = fr.read(ch)) != -1) {
//				System.out.println(new String(ch,0,len));
				fw.write(ch,0,len);
				fw.flush();
			}
			
		}catch(IOException ex) {
			System.out.println("����ʧ��");
			throw new RuntimeException("�ļ�����ʧ��");
		}finally{
			try{
				if(fw!=null)
					fw.close();
			}catch(IOException ex){
				throw new RuntimeException("�ͷ���Դʧ��");
			}finally{
				try{
					if(fr!=null)
						fr.close();
				}catch(IOException ex){
					throw new RuntimeException("�ͷ���Դʧ��");
				}
			}
		}
		
	}
}
