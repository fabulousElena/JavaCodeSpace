package cn.itcast.IntegerDemo;
/*
 * Integer���е���������
 * ����������������������̬�ĳ�Ա����
 */
public class IntegerDemo01 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 * Integer���������̬����
	 * �����Ƶ�ת��
	 * ʮ����ת�ɶ�����  toBinarString��int��
	 * ʮ����ת�ɰ˽���  toOctalString(int)
	 * ʮ���ƻ���16���� toHexString(int)
	 * ���������ķ���ֵ������String����ʽ����
	 */
	public static void function1() {
		System.out.println(Integer.toBinaryString(999));
		System.out.println(Integer.toOctalString(999));
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 * Integer �ľ�̬��Ա����
	 * MAX_VALUE
	 * MIN_VALUE
	 */
	public static void function() {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}

}
