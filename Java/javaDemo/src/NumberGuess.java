import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		System.out.println("С��Ϸ����0-10֮�������");
		System.out.print("�����������֣�");
		Random ran= new Random();
		int i =  ran.nextInt(10)+1;
		Scanner sc =  new Scanner(System.in);
		while(true) {
			int j = sc.nextInt();
		if(j>i) {
			System.out.println("���´��ˣ��������²�~");
		}else if(j<i) {
			System.out.println("����С�ˣ��������²�~");
		}else if(j==i) {
			break;
		}
		}System.out.println("��ϲ�����¶�����");
	}

}
