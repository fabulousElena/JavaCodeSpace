package fileUploadDownloadDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Test01 {
	public static void main(String args[]) throws IOException {
		test1();
		

	}
	
	public static Object test1() {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setDialogTitle("选择要保存到的文件夹");
		fc.setMultiSelectionEnabled(false);
		fc.showSaveDialog(fc);
		if (!(fc.getSelectedFile()==null)) {
			System.out.println("path==="+fc.getSelectedFile().getPath());
		}
		
		return fc.getSelectedFile().getPath();
	}

}
