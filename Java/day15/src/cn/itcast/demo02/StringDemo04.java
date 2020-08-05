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
	 * toUpperCase  升为大写
	 * toLowerCase  降为小写
	 */
	/*
	 * boolean equals(Object obj)
	 * 方法传递字符串 ，贩毒案字符串中的字符是否完全相同
	 * 如果完全相同返回true
	 * 
	 * boolean equalsIgnoreCase（String s）
	 * 传递字符串，判断字符串中的字符是否相同，忽略大小写
	 */
	public static void function7() {
		String str1 = "Abc";
		String str2 = "abc";
		//分别调用equals和equalsIgnoreCase方法
		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		System.out.println(b2);
	}
	
	/*
	 * char[] toCharArray（） 将一个字符串转成字符数组
	 * 功能和构造方法相反
	 */
	public static void function6() {
		String str = "ababc";
		//调用String类的方法toCharArray()
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i ++) {
			System.out.println(ch[i]);
		}
	}
	
	/*
	 * byte[] getBytes() 将一个字符串转成字节数组 
	 * 此功能和String的构造方法相反
	 * byte数组相关的功能，查询编码表
	 */
	public static void function5() {
		String str = "abc";
		//调用String类方法getBytes字符串转成字节数据
		byte[] b = str.getBytes();
		for(int i = 0 ;i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	/*
	 * int indexOf(char ch)
	 * 查找一个字符在字符串中第一次出现的索引
	 * 被查找的字符不存在 ，则返回-1
	 */
	
	/*
	 * boolean contains
	 * 判断一个字符串中，是否包含另一个字符串
	 * 
	 */
	
	public static void function4() {
		String str = "sadawkdkdkkdkdkd";
		boolean b = str.contains("kdkd");
		System.out.println(b);
	}
	
	public static void function3() {
		String str = "howareyouboys";
		//调用String类的方法startWith
		boolean b = str.startsWith("h");
		System.out.println(b);
		//endWith判断是否以指定字符串结尾
		
	}
	
	/*
	 * String substring(int beginIndex ,int endIndex)  获取字符串的一部分
	 * 返回的新字符串
	 * index包含头不包含尾巴
	 * 
	 * String substring(int beginIndex)
	 * 只获取begin后面的字符
	 */
	public static void function2() {
		String str = "howAreYouMyMan?";
		String str1 = str.substring(0, 3);
		System.out.println(str1);
	}
	
	/*
	 * int length（）返回字符串的长度
	 * 包含多少字符 
	 */
	public static void function() {
		String str = "dwadwadsdafsagasdassjkdljasoldjl";
		//调用String类方法length  获取字符串的长度
		System.out.println(str.length());
	}

}
