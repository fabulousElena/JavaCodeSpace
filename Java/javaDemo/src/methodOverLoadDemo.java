/*
 * �������������� ��overload��
 * ��ͬһ�����У��������ͬ���ķ�����ֻҪ�����Ĳ����б��ɣ�������������
 * �����б�ͬ�������ĸ������������͡�˳��
 * 
 * �������ص�ע�����
 *   1.�����б���벻ͬ����ͬ�ͻᱨ��
 *   2.���������غͲ�����ı������޹� ��int a ,int b��==(int i ,int j)
 *   3.���������غͷ���ֵ�����޹�
 *   4.���������غ����η��޹�
 * �����ɣ�����ֻ���������Ͳ����б�
 * 
 * ���������еĲ�����������
 *   1.���������ǻ�����������
 *   2.������������������--���ݵ����ڴ��ַ
 */

public class methodOverLoadDemo {

	public static void main(String[] args) {
		//�������صĵ��ã��Ǹ��ݲ������ݽ�������
		System.out.println(getSum(2.1,3));
		int a = 1;
		int b = 2;
		change(a,b);
		System.out.println(a);
		System.out.println(b);
		int[] arr = {1,2,3,4};
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr[2]);
		
	}
	public static void change(int [] arr) {
		arr[2] = 100;
	}
	
	public static void change(int a,int b) {
		a = a+b;
		b = b+a;
	}
	
	//�Բ�����ͣ����÷�������������
	public static int getSum(int a, int b) {
		System.out.println("����int����");
		return a+b;
	}
	
	public static int getSum(int a,int b,int c) {
		System.out.println("����int����");
		return a+b+c;
	}
	
	public static double getSum(double a,double b) {
		System.out.println("����double����");
		return a+b;
	}
	/*public static int getSum(int a, int  b) {
		return a + b ;
	}
	
	public static double getSumDouble(double a , double b) {
		return a + b;
	}
	
	public static int getSum3(int a,int b,int c) {
		return a+b+c;
	}*/

}
