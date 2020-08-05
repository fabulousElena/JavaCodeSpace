package fileUploadDownloadDemo;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02 {

	 
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		frame.setContentPane(jp);
		JDialog jd = new JDialog();
		jd.add(new JButton("°´Å¥"));
		jp.add(new JButton("°´Å¥"));
		
	}
}
