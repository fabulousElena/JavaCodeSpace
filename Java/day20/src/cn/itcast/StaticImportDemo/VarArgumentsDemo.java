package cn.itcast.StaticImportDemo;
/*
 * �����Ŀɱ����
 * ǰ�᣺�����Ĳ�����������ȷ�������ǲ����ĸ�������
 * �﷨����������...������
 * �ɱ�����ı����Ͼ���һ������
 */
public class VarArgumentsDemo {

	public static void main(String[] args) {
		//����һ�����пɱ�����ķ��������ݵĲ�����������
		getSum();
		int sum = getSum(1,3,5,2,66,5,4,3,6,5,5,5,5,5,5,5);
		System.out.println(sum);
	}
	public static int getSum(int...a) {
		int sum = 0 ;
		for(int i : a) {
			sum = sum + i;	
		}
		return sum;
	}
	
	/*
	 * �ɱ������ע������
	 * 1.һ�������У��ɱ����ֻ����һ��
	 * 2.�ɱ��������д���ڲ����б�����һλ
	 */
	public static void function(int...a) {
		
	}
	
//	/*
//	 * ���巽������������������
//	 */
//	public static int getSum(int a,int b) {
//		return a + b;
//	}
}
