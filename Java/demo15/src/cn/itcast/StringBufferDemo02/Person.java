package cn.itcast.StringBufferDemo02;

public class Person {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("hahah");
		s.insert(2, "3");
//		s.delete(1, 3);
//		s.replace(2, 3, "sb");
//		String st = s.toString();
		System.out.println(s.toString());
	}

}
