package cn.itcast.CalendarDemo;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo01 {

	public static void main(String[] args) {
		function();
//		function1();
//		function2();
//		function3();
		
	}
	/*
	 * Calendar����getTime����
	 * ����������ת��Date���ڶ���
	 */
	public static void function3() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}
	
	/*
	 * Calendar��add
	 * ������ƫ����������ָ��һ�������е��ַ�������������ƫ��
	 * add(int field , int value )
	 */
	public static void function2() {
		Calendar c = Calendar.getInstance();
		//�������е��������ƫ��280��
		c.add(Calendar.DAY_OF_MONTH, 280);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	
	/*
	 * Calendar��Set����
	 * ��������
	 * set��int field��int value��
	 *     field ���õ����ĸ������ֶ�
	 *     value ���ú�ľ�����ֵ
	 *     
	 * set��int year��int month ��int day��
	 * ��������������������
	 */
	public static void function1() {
		Calendar c = Calendar.getInstance();
		//�����·�   ���·����õ�2��
		c.set(Calendar.MONTH, 2);
		
		//ֱ��������������
		c.set(1970, 0, 0);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	
	/*
	 * Calendar���Get����
	 * ��ȡ�����ֶε�ֵ
	 * int  get��int��
	 * ����int  ����ȡ���Ǹ������ֶ�
	 * ����ֵ���ͱ�ʾ�����ֶεľ�����ֵ
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int secend = c.get(Calendar.SECOND);
		String date = year+"��"+month+"��"+day+"��" +  hour + ":"+minute + ":" + secend;
		System.out.println(date);
	}
}
