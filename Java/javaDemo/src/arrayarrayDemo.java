/*
 * ��ά����
 *     �����д洢�Ļ�������
 *     
 *     ���巽ʽ  ��
 *         int[][] arr = new int[3][4];
 *         ����һ����ά����
 *         [3]  ��ʾ����ά�����У�������һά����
 *         [4]  ��ʾ������һά�����У�ÿ������ĳ�����4
 *         
 *         ��򵥵Ķ�ά���鶨�巽ʽ  
 *         int[][] arr = { {1,3} , {3,5,6} , {2,3,4,5,6} };
 *         
 *     ��ά����ı���
 *       ��ά�����У��洢�ļ���һά���飬ÿ��һά����ĳ��Ȳ�ͬ
 *       
 *       ���� ��forѭ��  ������ά����
 *            ѭ�������У�forѭ���ٴα���һά����
 */
import java.util.Random;
public class arrayarrayDemo {

	public static void main(String[] args) {
		System.out.println("��ά�������");
		//int[][] arr = new int[3][4];
		int[][] arr = { {1,3} , {3,5,6} , {2,3,4,5,6} , {2,3}};
		System.out.println(arr[2][3]);
		//��ѭ�� ������ά����
		for (int i = 0; i < arr.length; i++ ) {
			//��ѭ��������ÿ��һά���顣 arr[0] arr[1] arr[2] arr[i]
			for (int j = 0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		//��˾�����ܺ�
		int[][] arr1 = { {11,12},{21,22,23}, {31,32,33,34} };
		int teamtotal = 0 ;
		int cpytotal = 0 ;
		for (int n = 0; n < arr1.length ; n++ ) {
			for ( int m = 0 ; m < arr1[n].length ; m++ ) {
				//С�����۶����
				teamtotal = arr1[n][m] + teamtotal ;
			}
			System.out.println("��"+ (n+1) +"С������۶���"+teamtotal+ "��Ԫ");
			//�����۶����
			cpytotal = cpytotal + teamtotal;
			//С�����۶���� �������´�ѭ���洢��һС�����۷ݶ���ֵ
			teamtotal = 0;
		}
		System.out.println("��������ܶ���"+cpytotal + "��Ԫ");
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		
		//���������
		/*
		 * ���������  ��
		 *      1  �洢���� 
		 *      2 Ԥ�������˵�����
		 *      3 �����һ���˵�����
		 */
		
		//�洢������Ҫ�������洢�������С�
		//����洢���� ���������������� ��String
		String [] names = {"����","����","����","�","С��","����","С��"};
		for ( int i = 0; i < names.length ; i++ ) {
			System.out.print(names[i]+"  ");
		}
		System.out.println();
		Random ran = new Random();
		int j = ran.nextInt(names.length);
		System.out.println("�������ͬѧΪ��"+ names[j]);
		
	}

}
