/*
 *   �����Ķ����ʽ  ������д����İ����У�����д����һ���������棩
 *      ���η�  ����ֵ���� ���������� �������б�...��{
 *            �����Ĺ������� 
 *              ѭ�����жϡ��������Ƚϡ�����....
 *            return ; 
 *      }
 *      
 *     ���η����̶�д��  public static 
 *     ����ֵ���ͣ�����������󣬽������������
 *     ���������Զ������֣������ʶ���淶����������������Сд�������ÿ����������ĸ��д
 *     �����б���������������У��Ƿ���δ֪�����ݣ������δ֪�����ݣ������ڲ����б��С������������
 *     return��1�������ķ��أ�������Ľ������ ��2����������
 *     
 *     //���������ʹ�õ�ע������
 *       1���������ܶ�������һ����������
 *       2.��������д������
 *       3.��������д������б�
 *       4����������ֵ��void�������п���ʡ��return 
 *           return���治���д��룬��Ϊִ�в���
 *       5.��������ֵ���� ��return������������ͱ���ƥ��
 *       6.���������ظ�����
 *       7.���÷�����ʱ�򣬷���ֵ��void������д����������
 *       
 */
import java.util.Scanner;
public class methodDemo {

	public static void main(String[] args) {
		//���÷������÷���ִ������
		//�ڷ���main�У����� getArea����
		//int area = getArea(5,6);
		//System.out.println("�����"+ area);
		printRect();
		scannerInt();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		printRect_1(i,j);
		double k = average(10,3,4);
		System.out.println(k);

	}
	/*
	 * Ҫ�󣺼���һ�������ε������
	 * ���巽��������Ҫ��
	 * ��������������̣�
	 *   1,��ȷ���������������������  �����ʽ��Ӧ�ľ��Ƿ���ֵ����  int
	 *   2��������������У���û��δ֪������  δ֪����  �����εĳ��Ϳ�  δ֪���ݵ��������� int
	 *       δ֪���ı����������ڷ�����С�����ڣ��ö��ŷֿ�
	 */
	
	//public static int getArea(int w,int h) {
		//ʵ�ַ����Ĺ�������
		//int area = w * h ;
		//return w * h; 
	//}
	
	//����ķ�����ϰ
	public static void printRect() {
		for (int i = 0; i < 3;i++) {
			for (int  j = 0 ; j < 3 ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int scannerInt() {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		System.out.println(j);
		return j ;
		
	}
	public static void printRect_1(int m,int n) {
		for (int i = 0; i < m;i++) {
			for (int  j = 0 ; j < n ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
	public static double average(double i,double j,double k) {
		double n = (i + j + k)/3;
		return n;
	}
}

