package TestDemo01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.event.ChangeListener;


public class TestDemo02{

	public static void main(String[] args) {
		func();
		
		
	}
	static JButton jb;
	static Timer time;
	static JProgressBar jpg;
	static ActionEvent e;
	static double fileLength = 1000;
	static double downloadLength = 0;
	static double percent = 0;
	public static void func() {
		
		JFrame frame = new JFrame("测试");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
//		frame.setResizable(false);
		JPanel jp = new JPanel();
		frame.setContentPane(jp);
		jp.setVisible(true);
		jp.setLayout(new FlowLayout());
		JDesktopPane jd = new JDesktopPane();
		jd.setLayout(new FlowLayout());
		jp.add(jd);
		JInternalFrame ji = new JInternalFrame("下载",true);
		
		
		jpg = new JProgressBar();
		jpg.setMaximum(0);
		jpg.setMaximum(100);
		jpg.setValue(0);
		jpg.setStringPainted(true);
		
		jb = new JButton("确定");
		jb.setVisible(true);
		jd.add(jb);
		
		ji.setVisible(true);
		jd.add(ji);
		ji.add(jpg);
		
		
		DecimalFormat df = new DecimalFormat("0");
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				for(int i = 0 ; i < fileLength ; i ++) {
					downloadLength = downloadLength + 1;
					percent =(downloadLength) /  fileLength;
					double number = percent * 100;
					System.out.println(df.format(number));
					
				}
			}
		});
		
	}
}


	
	
