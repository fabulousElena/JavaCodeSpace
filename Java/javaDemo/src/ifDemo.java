/*
 * ��ʽ��if(����){
 *          if����ִ����
 *      }
 *      ��������������ǲ�������   
 * 
 */
import java.util.Scanner;
public class ifDemo {

	public static void main(String[] args) {
		int i = 5;
		if (i==5) {
			System.out.println("if���������true");
			i++;
		}
		System.out.println(i);
		
		/*if...else ����ʽ
		 * ��ʽ�� if(����){
		 *           if��ִ����
		 * }else{
		 *           else��ִ����
		 * }
		 */
		int j = 17;
		//�жϱ�������ż�������Զ� ������������=1��������=0��ż��
		if (j % 2 == 0) {
			System.out.println("��ż��");
		}else {
			System.out.println("������");
		 }
		
		//��ӡѧ���ɼ�
		Scanner Stu = new Scanner(System.in);
		int k = Stu.nextInt();
		if(100 >= k && k >= 80) {
			System.out.println("��ѧ���ĳɼ���"+k+"--�ɼ�����");
		}else if(80 > k && k >= 60) {
			System.out.println("��ѧ���ĳɼ���"+k+"--�ɼ�����");
		}else if(60 > k && k >=0) {
			System.out.println("��ѧ���ĳɼ���"+k+"--�ɼ�������");
		}else {
			System.out.println("������ĳɼ���ʽ����ȷ������������0-100");
		}
		

	}

}
