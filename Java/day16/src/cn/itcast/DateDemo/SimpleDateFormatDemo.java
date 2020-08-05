package cn.itcast.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �����ڽ��и�ʽ�����Զ��壩
 *   �����ڸ�ʽ������  java.text.DateFormat ������  ��ͨ����  Ҳ�г��󷽷� 
 *   ʵ������ʹ������java.text.SimpleDateFormat ����ʹ�ø�����ͨ
 *   ����  ��д�˳��󷽷�
 *   
 *   
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		fonction();
	}
	/*
	 * ��ζ����ڸ�ʽ��
	 * ���裺
	 *   1������SimpleDateFormat����
	 *     ����Ĺ��췽���У�д���ַ��������ں��ʣ��Լ����壩
	 *   2.��SimpleDateFormat����÷���format�����ڽ��и�ʽ��
	 *     ����ֵ��String format ��Date date���������ڶ��󣬷����ַ���
	 *    ����ģʽ
	 *        yyyy ���
	 *        MM   �·�
	 *        dd   ����(���е�)
	 *        HH   0-23Сʱ
	 *        mm   ����
	 *        ss   ��
	 *        
	 *        yyyy��MM��dd�� HH��mm����ss�� ���ֿ��������޸ģ�����������ַ������޸�MM  dd
	 *       
	 *   
	 */
	public static void fonction() {    
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
		
	}
}
