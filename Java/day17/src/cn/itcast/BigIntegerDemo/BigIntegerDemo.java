package cn.itcast.BigIntegerDemo;

import java.math.BigInteger;

/*
 * ���������������
 *     ����longȡֵ��Χ��������װ��BigInteger���͵Ķ���
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		function2();
	}
	
	/*
	 * BigInteger�������������
	 * ���÷�������   ����Ľ��Ҳֻ����BigInteger�Ķ���
	 */
	public static void function2() {
		BigInteger bi = new BigInteger("32131231111111121312321412512");
		BigInteger bi1 = new BigInteger("321312311111111212313113213213131321312321412512");
		
		//����֮�� add
		BigInteger b = bi.add(bi1);
		System.out.println(b);
		
		//����֮�� suntract
		BigInteger b2 = bi.subtract(bi1);
		System.out.println(b2);
		
		//����˻�   multiply 
		BigInteger b3 = bi.multiply(bi1);
		System.out.println(b3);
		
		//������   divide
		BigInteger b4 = bi1.divide(bi);
		System.out.println(b4);
	}
	
	/*
	 * BigInteger��Ĺ��췽��
	 *  �����ַ�����Ҫ�����ָ�ʽ��û�г�������
	 */
	public static void function() {
		BigInteger bi = new BigInteger("32131231111111121312321412512");
		System.out.println(bi);
		BigInteger bi1 = new BigInteger("321312311111111212313113213213131321312321412512");
		System.out.println(bi1);
		
	}

}
