package cn.itcast.CaseDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception {
		function2();
	}
	/*
	 * 
	 * �������
	 * �߼����㷨
	 */
	public static void function2() throws ParseException {
		System.out.println("���������");
		int r = new Scanner(System.in).nextInt();
		Calendar c = Calendar.getInstance();
		c.set(r, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		if(c.get(Calendar.DAY_OF_MONTH) == 29) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
		
		
		
	}
	
	
	/*
	 * ����һ�����˶�����
	 * ��Ҫ����  �� ����   ���������
	 * �õ���������   ����ɺ���  ���мӼ�  Ȼ����ת��������  ���
	 * 
	 */
	public static void function() throws Exception {
		//Date date = new Date();
		//��ȡ��������
		System.out.println("���������ĳ�������  ��ʽ  yyyy-MM-dd");
		String birthdayString = new Scanner(System.in).next();
		//���ַ�������ת��Date����
		//����SimpleDateFormat����д���ڸ�ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate  = sdf.parse(birthdayString);
		
		//��ȡ���������
		Date todayDate = new Date();
		
		//����������ת�ɺ���ֵDate��ķ���  getTime����
		long birthday = birthdayDate.getTime();
		long today = todayDate.getTime();
		long i = today - birthday;
		
		
		if(i<0) {
			System.out.println("��������ȷ�ĳ�������");
			
		}else {
		
		System.out.println(i/1000/60/60/24);
		
		}
		
		
		
	}
	

}
