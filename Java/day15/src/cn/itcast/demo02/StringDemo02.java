package cn.itcast.demo02;

public class StringDemo02 {

	public static void main(String[] args) {
		//�ַ������巽�� ����   ֱ�Ӹ�ֵ=   ʹ��String��Ĺ��췽��
		String str1 = new String ("ad");
		String str2 = "ad";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
