package cn.itcast.demo02;

public class StringDemo04 {
	public static void main(String[] args) {
		function();
		function2();
		function3();
		function4();
		function5();
		function6();
		function7();
	}
	/*
	 * toUpperCase  ��Ϊ��д
	 * toLowerCase  ��ΪСд
	 */
	/*
	 * boolean equals(Object obj)
	 * ���������ַ��� ���������ַ����е��ַ��Ƿ���ȫ��ͬ
	 * �����ȫ��ͬ����true
	 * 
	 * boolean equalsIgnoreCase��String s��
	 * �����ַ������ж��ַ����е��ַ��Ƿ���ͬ�����Դ�Сд
	 */
	public static void function7() {
		String str1 = "Abc";
		String str2 = "abc";
		//�ֱ����equals��equalsIgnoreCase����
		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		System.out.println(b2);
	}
	
	/*
	 * char[] toCharArray���� ��һ���ַ���ת���ַ�����
	 * ���ܺ͹��췽���෴
	 */
	public static void function6() {
		String str = "ababc";
		//����String��ķ���toCharArray()
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i ++) {
			System.out.println(ch[i]);
		}
	}
	
	/*
	 * byte[] getBytes() ��һ���ַ���ת���ֽ����� 
	 * �˹��ܺ�String�Ĺ��췽���෴
	 * byte������صĹ��ܣ���ѯ�����
	 */
	public static void function5() {
		String str = "abc";
		//����String�෽��getBytes�ַ���ת���ֽ�����
		byte[] b = str.getBytes();
		for(int i = 0 ;i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	/*
	 * int indexOf(char ch)
	 * ����һ���ַ����ַ����е�һ�γ��ֵ�����
	 * �����ҵ��ַ������� ���򷵻�-1
	 */
	
	/*
	 * boolean contains
	 * �ж�һ���ַ����У��Ƿ������һ���ַ���
	 * 
	 */
	
	public static void function4() {
		String str = "sadawkdkdkkdkdkd";
		boolean b = str.contains("kdkd");
		System.out.println(b);
	}
	
	public static void function3() {
		String str = "howareyouboys";
		//����String��ķ���startWith
		boolean b = str.startsWith("h");
		System.out.println(b);
		//endWith�ж��Ƿ���ָ���ַ�����β
		
	}
	
	/*
	 * String substring(int beginIndex ,int endIndex)  ��ȡ�ַ�����һ����
	 * ���ص����ַ���
	 * index����ͷ������β��
	 * 
	 * String substring(int beginIndex)
	 * ֻ��ȡbegin������ַ�
	 */
	public static void function2() {
		String str = "howAreYouMyMan?";
		String str1 = str.substring(0, 3);
		System.out.println(str1);
	}
	
	/*
	 * int length���������ַ����ĳ���
	 * ���������ַ� 
	 */
	public static void function() {
		String str = "dwadwadsdafsagasdassjkdljasoldjl";
		//����String�෽��length  ��ȡ�ַ����ĳ���
		System.out.println(str.length());
	}

}
