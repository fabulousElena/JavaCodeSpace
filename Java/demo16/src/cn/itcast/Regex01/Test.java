package cn.itcast.Regex01;

public class Test extends Object{
	public static void main(String[] args) {
		String qq = "604154942";
		String regex = "[1-9][0-9]{4,14}";
		boolean flag2 = qq.matches(regex);
		System.out.println(flag2);
		System.out.println(regex);
		
		String phone = "18800022116";
		String regex1 = "1[34578][0-9]{9}";
		boolean b2 = phone.matches(regex1);
		System.out.println(b2);
		
		String s = "18-22-40-65";
		String r = "-";
		String[] result = s.split(r);
		System.out.println(result);
		
		String s1 = "Hello12345World6789012";
		String regex2 = "[0-9]";
		//String result = s.replaceAll(regex, "*");
		System.out.println(result);
	}
	
//	public boolean matches(String regex1) {
//		String qq = "604154942";
//		String regex = "[1-9][0-9]{4,14}";
//		return false;
//		
//	}
}
