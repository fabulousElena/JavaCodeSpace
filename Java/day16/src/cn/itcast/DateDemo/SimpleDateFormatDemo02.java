package cn.itcast.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * DateFormat�෽�� parse 
 * ���ַ�������Ϊ���ڶ���
 * Date parse��String s ���ַ���������ڶ���
 * �û������� 2050-2-35 == s 
 * String =>Date
 * Date=> String format
 */
public class SimpleDateFormatDemo02 {

	public static void main(String[] args) throws Exception {
		function();
	}
	
	/*
	 * ���ַ���ת��Date����
	 * DateFormat�෽��parse
	 * ���裺
	 *    1.����SimpleDateFormat����
	 *    ���췽���У�ָ�����ڸ�ʽ��
	 *    2.���������÷���Parse����������String  ����Date
	 *    
	 *    ע�⣺ʱ������ڵ�ģʽyyyy-MM-dd  ������ַ����е�ʱ������ƥ�䣬��ƥ��ͱ���
	 *    
	 *    ���ǣ��������û���������ģ��������ڲ�������  ��ѡ��
	 */
	public static void function() throws Exception{
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = s.parse("1995-02-03 15:6:22");
		System.out.println(date);
	}
}
