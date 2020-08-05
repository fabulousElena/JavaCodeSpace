package cn.itcast.RegexDemo;
/*
 * ʵ�����������ַ�������ƥ��   ʹ�õ��ַ�����ķ���
 * String ��������������ʽ��صķ���
 *   Boolean matches(String ����Ĺ���)
 *   ��abc��.matches("[a]")   ����true 
 *   
 *   String[] split(String ����Ĺ���)
 *   "abc".split("a")  ʹ�ù����ַ��������и�
 *   
 *   String replaceAll ��String �������String �ַ�����
 *   "abc0123".replaceAll("[\\d]","#")
 *   ��������Ĺ����滻�ַ�����
 */
public class RegexDemo {
	public static void main(String[] args) {
		checkQQ();
		checkTel();
		split_1();
		split_2();
		split_3();
		replaceAll();
	}
	/*
	 * "hellsd232h3kh23h43h4g3hjg22"�����е����ֻ���
	 * String�෽��replaceAll����������滻����ַ�����
	 * 
	 */
	public static void replaceAll() {
		String str = "hellsd232h3kh23h43h4g3hjg22";
		str= str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
	
	/*
	 * ����ֻ������Ƿ�Ϸ�
	 * 1 ��ͷ  �ڶ�λ������34578  ����λ 0-9  �ֻ�����ʮһλ
	 * 
	 */
	public static void checkTel() {
		String telNumber  = "13123552566";
		boolean b = telNumber.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
	/*
	 * String �෽��split���ַ��������и�
	 * 192.168.3.1 ����.�����и��ַ���
	 */
	public static void split_3() {
		String str = "192.168.3.1";
		String[] strArr = str.split("\\.+");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	
	/*
	 *  String �෽��split���ַ��������и�
	 *  18 42 50 23 ���տո��и��ַ�
	 */
	public static void split_2() {
		String str = "18       42 50  23";
		String[] strArr = str.split(" +");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	/*
	 * String �෽��split���ַ��������и�
	 * 12-25-35-95 ����-���ַ��������и�
	 */
	public static void split_1() {
		String str = "12-25-35-95";
		//����-���ַ��������и�
		String[] strArr = str.split("-");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	
	/*
	 * ���QQ�����Ƿ�Ϸ�
	 * ����0��ͷ   ȫ����  λ��5  10λ 
	 */
	public static void checkQQ() {
		String QQ = "123456";
		//���QQ����͹����Ƿ�ƥ��  String��ķ���matches
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}

}
