package cn.itcast.IntegerDemo;
/*
 * Integer�࣬��װ������������int ����ߴ�������
 * ���ַ���ת�ɻ�����������int
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * Integer��Ĺ��췽��
	 *   Integer��String s ��
	 *   �����ָ�ʽ���ַ������ݵ�Integer��Ĺ��췽����
	 *   ����Integer���󣬰�װ����һ���ַ���
	 *   �����췽���е� �ַ�����ת�ɻ����������ͣ����÷������Ǿ�̬�� intValue����
	 */
	public static void function3() {
		Integer in = new Integer("100"); 
		int i = in.intValue();
		System.out.println(--i);
	}
	
	/*
	 * ��ν���������int  ����ַ���  
	 * int => String  �κ����� + ���� �ͱ����String����
	 * ʹ��Integer���еľ�̬����toString()
	 */
	public static void function2() {
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		//������ת�ɽ����� toString��String s , int radix)
		System.out.println(Integer.toString(i,2));
	}
	
	/*
	 * Integer�ྲ̬���� parseInt��String s ��int radix��
	 * radix ����,����
	 * 110,2  ��˼��ǰ��������Ƕ�����  ���Ƿ���parseInt ���н����ʮ����
	 */
	public static void function1() {
		int i = Integer.parseInt("110", 2);
		System.out.println(i);
	}
	
	/**
	 * Integer���еľ�̬����parseInt��String s �����ػ�����������
	 * Ҫ���ַ������������ָ�ʽ��
	 */
	public static void function() {
		String s = "21";
		int i = Integer.parseInt(s);
		System.out.println(i+2);
	}

}
