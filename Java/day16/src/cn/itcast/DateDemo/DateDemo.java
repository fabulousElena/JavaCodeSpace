package cn.itcast.DateDemo;

import java.util.Date;

/*
 * ʱ���������
 * java.util.date
 * 
 * ������1000����==1��
 * 
 * �����0��  
 *    System.currentTimeMills����  ����long���Ͳ���
 *    ��ȡ��ǰ���ڵĺ���ֵ 1572015163180
 *    ʱ��ԭ�㣺��Ԫ1970��1��1����ҹ0��0��0  ������ֵ����0
 *    
 *  ��Ҫ��ʱ������ڵļ��� �����ں���ֵ
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		System.out.println(s);
		function();
		function1();
		function3();
		function2();
	}
	/*
	 * Date�� setTime��long�� ���ݺ���ֵ
	 * ����ֵת�����ڶ���
	 */
	public static void function2() {
		Date date = new Date();
		date.setTime(0);
		System.out.println(date);
	}
	
	/*
	 * Date��  getTime() ����ֵlong
	 * ���ص��Ǻ���ֵ
	 * ������ת���ɺ���ֵ
	 */
	public static void function3() {
		Date date = new Date();
		long l = date.getTime();
		System.out.println(l);
	}
	/*
	 * Date���long�����Ĺ��췽��
	 * Date��long����ʾ����ֵ
	 * ���ݺ���ֵ  ������ֵת������
	 * 
	 */
	public static void function1() {
		Date date = new Date(0);
		System.out.println(date);
	}
	
	/*
	 * date��Ŀղι�����
	 * ��ȡ�����ǵ�ǰ����ϵͳ��ʱ�������
	 */
	public static void function() {
		Date date = new Date();
		System.out.println(date);
	}

}
