package cn.itcast.BigIntegerDemo;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		/*
		 * ��������δ֪   
		 * ԭ���ڼ�����Ķ������У���ʾ����������ȷ��ɵ�
		 * �������͵ĸ������ݣ��ṩ�߾��ȵĸ�������BigDecimal
		 * ��BigInteger���㷽��һ��
		 */
		System.out.println(0.09+0.01);
		System.out.println(1.0-0.32);
		System.out.println(1.015*100);
		System.out.println(1.301/100);
		function();
		
	}
	
	/*
	 * BigDecimalʵ�ֳ�������
	 * divide(BigDecimal divisor, int scale, int roundingMode) 
	 * int scale:������λС��
	 * int int roundingMode�� ����ģʽ
	 * ����ģʽ�Ķ�API
	 * ROUND_UP ���ϼ�һ
	 * 
	 * ROUND_DOWN  ֱ����ȥ
	 * 
	 * static int ROUND_HALF_UP >=0.5  ֱ��+1
	 * 
	 * static int ROUND_HALF_DOWN 
	 */
	@SuppressWarnings("deprecation")
	public static void function() {
		BigDecimal b1 = new BigDecimal("1.301");
		BigDecimal b2 = new BigDecimal("100");
		BigDecimal b3 = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(b3);
	}

}
