package cn.itcast.fileDemo2;



import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {
	public boolean accept(File pathname) {
		//�жϻ�ȡ����Ŀ¼,ֱ�ӷ���true
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".java");
	}

}
