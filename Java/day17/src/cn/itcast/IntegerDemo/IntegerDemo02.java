package cn.itcast.IntegerDemo;
/*
 * JDK1.5�Ժ���ֵ����ԣ��Զ�װ����Զ�����
 *   �Զ�װ�䣺�����������ͣ�ֱ�ӱ�Ϊ����
 *   �Զ����䣺�����е����ݱ�ػ�����������
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * �����Զ�װ��������Ŀ
	 * 
	 */
	public static void function3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i.equals(j));
		System.out.println(i==j);
		
		System.out.println("=============");
		
		Integer a = 500;
		Integer b = 500;
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println("=============");
		
		//������byte��Χ�ڣ�JVM��������new����
		Integer aa = 128;// Integer aa = new Integer(127);
		Integer bb = 128;// Integer bb = aa;
		System.out.println(aa.equals(bb));
		System.out.println(aa==bb);
		
	}
	
	public static void function2() {
		//�Զ�װ�����ı׶�   �п��ܳ��ֿ�ָ���쳣
		Integer in = null;
		in = in + 1 ;
		System.out.println(in);
		
	}
	
	//�Զ�װ�����ĺô���
	//���������ͺ���������ֱ������
	public static void function() {
		//�������ͣ����ñ���һ��ָ�����   �Զ�װ�䣬������������1 ��ֱ�ӱ���˶���
		Integer in = 1;// Integer in = new Integer(1);
		//in ��������������������  ���������ǲ����Ժͻ����������������
		//�Զ����䣬 �Զ��� ������������ ����Ϊ  ������������
		in = in + 1;
		System.out.println(in.toString());
	}

}
