/*
 * ʵ����Ʒ�Ŀ�����
 *   ���ܣ�
 *     1.չʾ�û�ѡ��Ĺ����嵥
 *     2.����ѡ��Ĺ��ܱ�Ž��в�ͬ�Ĳ���
 *       A.չʾ���п��
 *       B.�޸Ŀ������
 *   ������
 *   1.չʾ�û��嵥��
 *     �����䣬�û����룬ѡ�������
 *   2.����ѡ�񣬵��ò�ͬ�ķ��� 
 *     switch��� 
 *     
 *     A��չʾ���
 *        ���洢��Ʒ���������
 *     B���޸Ŀ��
 *        �޸����еĿ������
 */
import java.util.Scanner;
public class changeInformation {
	public static void main(String[] args) {
		//ʹ�����鱣����Ʒ����Ϣ  
		//��ƷƷ�����ߴ磬�۸񣬿����  ����4������
		String[] brand = {"MacBookAir","ThinkPadT450"};
		double[] size = {13.3,15.6};
		double[] price = {3333.3,6666.6};
		int[] count = {0,0};
		while(true) {
		int choose = chooseFunction();
		switch (choose) {
		case 1:
			//���ò鿴����嵥�ķ���
			printStore(brand,size,price,count);
			break;
		case 2:
			//�����޸Ŀ��ķ���
			updateStore(brand,count);
			break;
		case 3:
			System.out.println("�������˳���");
			return ;
			//break;
		default :
			System.out.println("û���������,����������");
			break;
		
		}
		}
	}
	/*
	 * ���巽�����޸�������Ʒ�Ŀ������
	 *   �û�����һ�����޸�һ��
	 *   ����ֵ  û��
	 *   ���� �����������,Ʒ������
	 */
	public static void updateStore(String[] brand,int[] count) {
		//�������飬������һ�����޸�һ��
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < brand.length ; i++ ) {
			System.out.println("������"+brand[i]+"�����");
			//�������� ¼���棬�洢������������
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
	}
	
	/*
	 * ���巽����չʾ���еĿ���嵥������
	 * ����ֵ  û��
	 * ����  ����
	 */
	public static void printStore(String[] brand,double[] size,double[] price,int[] count) {
		System.out.println("----------------������----------------");
		System.out.println("Ʒ��                                �ߴ�              �۸�       �����");
		int totalCount = 0;
		int totalMoney = 0;
		for(int i = 0; i < brand.length ; i++ ) {
			System.out.println(brand[i]+"\t"+size[i]+"\t"+price[i]+"\t"+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
		}
		System.out.println("�ܿ��"+totalCount);
		System.out.println("�ܼ۸�"+totalMoney);
	} 
	
	/*
	 * ���巽����ʵ���û���ѡ���ܣ����ܵ������Ҫ����
	 * ����ֵ���� int
	 * ����  
	 */
	public static int chooseFunction() {
		System.out.println("--------������--------");
		System.out.println("1:�鿴����嵥");
		System.out.println("2���޸���Ʒ�������");
		System.out.println("3���˳�");
		System.out.println("������Ҫִ�еĲ������");
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		int chooseNumber = sc.nextInt();
		return chooseNumber;
	}
	
	
	

}
