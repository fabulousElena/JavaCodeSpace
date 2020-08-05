package cn.itcast.RegexDemo;
/*
 * 实现正则规则和字符串进行匹配   使用到字符串类的方法
 * String 类三个和正则表达式相关的方法
 *   Boolean matches(String 正则的规则)
 *   “abc”.matches("[a]")   返回true 
 *   
 *   String[] split(String 正则的规则)
 *   "abc".split("a")  使用规则将字符串进行切割
 *   
 *   String replaceAll （String 正则规则，String 字符串）
 *   "abc0123".replaceAll("[\\d]","#")
 *   按照正则的规则，替换字符串。
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
	 * "hellsd232h3kh23h43h4g3hjg22"将所有的数字换掉
	 * String类方法replaceAll（正则规则，替换后的字符串）
	 * 
	 */
	public static void replaceAll() {
		String str = "hellsd232h3kh23h43h4g3hjg22";
		str= str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
	
	/*
	 * 检查手机号码是否合法
	 * 1 开头  第二位可以是34578  第三位 0-9  手机号码十一位
	 * 
	 */
	public static void checkTel() {
		String telNumber  = "13123552566";
		boolean b = telNumber.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
	/*
	 * String 类方噶split对字符串进行切割
	 * 192.168.3.1 按照.进行切割字符串
	 */
	public static void split_3() {
		String str = "192.168.3.1";
		String[] strArr = str.split("\\.+");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	
	/*
	 *  String 类方噶split对字符串进行切割
	 *  18 42 50 23 按照空格切割字符
	 */
	public static void split_2() {
		String str = "18       42 50  23";
		String[] strArr = str.split(" +");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	/*
	 * String 类方噶split对字符串进行切割
	 * 12-25-35-95 按照-对字符串进行切割
	 */
	public static void split_1() {
		String str = "12-25-35-95";
		//按照-对字符串进行切割
		String[] strArr = str.split("-");
		for(int i = 0 ; i < strArr.length; i ++) {
			System.out.println(strArr[i]);
		}
	}
	
	/*
	 * 检查QQ号码是否合法
	 * 不能0开头   全数字  位数5  10位 
	 */
	public static void checkQQ() {
		String QQ = "123456";
		//检查QQ号码和规则是否匹配  String类的方法matches
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}

}
