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
			System.out.println("复制失败");
			throw new RuntimeException("文件复制失败");
		}finally{
			try{
				if(fw!=null)
					fw.close();
			}catch(IOException ex){
				throw new RuntimeException("释放资源失败");
			}finally{
				try{
					if(fr!=null)
						fr.close();
				}catch(IOException ex){
					throw new RuntimeException("释放资源失败");
				}
			}
		}
		
	}
}
