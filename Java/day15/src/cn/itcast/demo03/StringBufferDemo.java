package cn.itcast.demo03;

public class StringBufferDemo {
	public static void main(String[] args) {
		function();
		function2();
		function3();
	}
	/*
	 *StringBuffer
	 * toString()  �̳�Object ��дtoString����
	 * ���������������ַ�������ַ���
	 * 
	 */
	public static void function3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		buffer.append("1212121");
		System.out.println(buffer.toString());
	}
	
	/*
	 * StringBuffer��ķ���
	 * reverse���������������ַ���ת
	 */
	
	/*
	 * StringBuffer�෽��
	 * replace��int start ��int end ��String str��
	 * ��ָ����������Χ�ڵ������ַ��滻���µ��ַ�
	 */
	
	/*
	 * StringBuffer ����
	 * insert ��int index���������ͣ�
	 * �������������ݲ��뵽��������ָ��������
	 */
	
	/*
	 * StringBuffer����
	 * delete��int start ,int end ��ɾ���������е��ַ�
	 * ��ʼ������  ���ǿ�ʼ����  ����������
	 * ����ͷ������β
	 * 
	 */
	public static void function2() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		buffer.delete(1, buffer.length());
		buffer.insert(1, "dawdada");
		System.out.println(buffer);
	}
	
	/*
	 * StringBuffer�෽��
	 * append.�������
	 * append����ֵ  дreturn this
	 * ��������˭������ֵ����˭
	 * ����ֵ�����Լ��������Ի����Լ������÷���
	 * 
	 * 
	 */
	public static void function() {
		StringBuffer buffer = new StringBuffer();
		//����StringBuffer����append�򻺳���׷������
		buffer.append("3").append(false).append("dadwamasdakdkshk");
		System.out.println(buffer);
	}

}
