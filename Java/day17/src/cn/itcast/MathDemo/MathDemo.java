package cn.itcast.MathDemo;
/*
 * ��ѧ����Ĺ�����  
 * java.lang.Math ��̬�������
 */
public class MathDemo {
	public static void main(String[] args) {
		function6();
	}
	
	/*
	 * static double round(double d)
	 * ��ȡ��������������   ȡ����
	 */
	public static void function6() {
		double d = Math.round(3.92541544330);
		System.out.println(d);
	}
	
	/*
	 * static double random() ����һ�������   0.0--1.0֮��
	 * ��Դ��Random��
	 * 
	 */
	public static void function5() {
		
		for(int i = 0 ; i < 10 ; i ++) {
			double d = Math.random();
		    System.out.println(d);
		}
	}
	
	/*
	 * static double sqrt(double a )
	 * ���ز�����ƽ����
	 */
	public static void function4() {
		double d = Math.sqrt(3);
		System.out.println(d);
	}
	
	/*
	 * static double pow��double a ,double b��
	 * ���ص�һ�������ĵڶ��������Ĵ���ֵ  a��b�η�
	 */
	public static void function3() {
		double d = Math.pow(2, 3.3);
		System.out.println(d);
	}
	
	/*
	 * static double floor��double d��
	 * ����С�ڻ��ߵ��ڲ���d���������
	 */
	
	/*
	 * static double ceil(double d)
	 * ���ش��ڻ��ߵ��ڲ���d����С����
	 */
	public static void function2() {
		double d = Math.ceil(53.1);
		System.out.println(d);
		double d1 = Math.floor(1.2);
		System.out.println(d1);
	}
	
	/*
	 * static int abs(int i )
	 * ���ز����ľ���ֵ
	 */
	public static void function() {
		int i = Math.abs(-99);
		System.out.println(i);
	}

}
