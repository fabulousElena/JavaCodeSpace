package fileUploadDownloadDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileDemo {

	static byte[] b;
	public static void main(String[] args) throws Exception {
		JFileChooser fd = new JFileChooser();
		fd.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
		fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		if (f != null) {
		    System.out.println(f.getPath());
//		    String fileName = f.getPath();
//		    File file = new File(fileName);
//		    InputStream is = new FileInputStream(file);
//		    b = new byte[] {};
//		    b = inputStreamToByte(is);
		    uploadFiles(f);
		}
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 0) {
			downloadFiles(f);
			System.out.println("下载成功");
		}
		
		
	}

	
	public static void downloadFiles(File f) throws Exception {
		  cJDBC();
		  String sql = "SELECT * FROM sort WHERE myid = 15";
		  
		  
		  
		  b = new byte[1024*2];
		  PreparedStatement pst = cJDBC().prepareStatement(sql);
		  ResultSet rs = pst.executeQuery();
		  while(rs.next()) {
			  String s = rs.getString("mytitles");
			  File fileOut = new File("D:\\" + s);
			  if(!fileOut.exists()) {
				  fileOut.createNewFile();
			  }
			  FileOutputStream fileOutput = new FileOutputStream(fileOut);
			  InputStream is = rs.getBinaryStream("mycodes");
			  int size = 0;
			  while((size = is.read(b)) != -1) {
				  System.out.println(size);
				  fileOutput.write(b,0,size);
//				  fileOutput.close();
			  }
			  fileOutput.close();
		  }
		  
	}
	
	
	public static void uploadFiles(File f) throws Exception {
		    cJDBC();
		    File file = new File(f.getPath());
		    FileInputStream fileInput = new FileInputStream(file);
		    String sql = "INSERT INTO sort (mytitles,mycodes,mydate) VALUES (?,?,?)";
		    PreparedStatement pst = cJDBC().prepareStatement(sql);
		    pst.setString(1, f.getName());
		    pst.setAsciiStream(2, fileInput, (int)file.length());
		    pst.setString(3, "2");
		    pst.executeUpdate();
		    System.out.println("成功");
		    cJDBC().close();
		    pst.close();  
	}
	
	public static Connection cJDBC() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
		Connection con = DriverManager.getConnection(url,"root1","Zhang970716");
		return con;
	}
	
//	private static byte[] inputStreamToByte(InputStream is) throws Exception { 
//
//        ByteArrayOutputStream bAOutputStream = new ByteArrayOutputStream(); 
//
//        int ch; 
//
//        while((ch = is.read() ) != -1){ 
//
//            bAOutputStream.write(ch); 
//
//        } 
//
//        byte data [] =bAOutputStream.toByteArray(); 
//
//        bAOutputStream.close(); 
//
//        return data; 
//
//    } 
	
}
