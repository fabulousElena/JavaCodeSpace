package defaultPackage_2;
import java.util.ArrayList;
import java.util.Scanner;
public class changeInformation_ByArrayList {
	public static void main (String[] args) {
		//���弯��
		ArrayList<storeKuCun> array = new ArrayList<storeKuCun>();
		System.out.println("��ӭ������鿴���޸�ϵͳ����������Ҫѡ��Ĺ��ܣ�");
		addInformation(array);
		while(true) {
			int i = chooseFunction();
			switch(i) {
		
		case 1:
			//�鿴����嵥
			showStore(array);
			break;
			
		case 2:
			//�޸Ŀ������
			changeInformation(array);
			showStore(array);
			break;
			
		case 3:
			//�˳�
			System.out.println("�������˳���ллʹ��");
			return;
			
		default :
			System.out.println("û���������,����������");
			break;
		}
	}
		
	}
	//ѡ����
	public static int chooseFunction() {
		System.out.println("--------������--------");
		System.out.println("1: �鿴����嵥");
		System.out.println("2���޸���Ʒ�������");
		System.out.println("3���˳�");
		System.out.println("������Ҫִ�еĲ������");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	//�޸Ŀ����Ϣ
	public static void changeInformation(ArrayList<storeKuCun> array) {
		Scanner sc = new Scanner(System.in);
		//int j = sc.nextInt();
		//array.set(array.get(i).store, 300);//�޸Ŀ�汨��
		for(int j = 0; j < array.size() ; j++) {
			storeKuCun k = array.get(j);
			System.out.println("������"+k.brand +"�޸ĺ�Ŀ��");
			k.store = sc.nextInt();
			//System.out.print(k.store+"  \t");
		}		
	}
	
	//������Ʒ��Ϣ 
	public static void showStore(ArrayList<storeKuCun> array) {
		double totalPrice = 0;
		int totalStore = 0;
		System.out.println("----------------���鿴ϵͳ-----------------");
		System.out.println("     Ʒ��                                 �۸�                           �ߴ�          �����");
		for(int i = 0 ;i < array.size(); i++) {
			storeKuCun s = array.get(i);
			System.out.println(s.brand+"   \t"+s.price+"   \t"+s.size+"   \t"+s.store);
			totalStore += s.store;
			totalPrice += s.price*s.store;
		}
		System.out.println("��Ʒ�ܼ۸�Ϊ"+totalPrice);
		System.out.println("��Ʒ�ܿ��Ϊ"+totalStore);
	}
	
	//�����Ʒ��Ϣ
	public static void addInformation(ArrayList<storeKuCun> array) {
		storeKuCun kc1 = new storeKuCun();
		storeKuCun kc2 = new storeKuCun();
		storeKuCun kc3 = new storeKuCun();
		kc1.brand = "MacBookAir";
		kc1.price = 6666.66;
		kc1.size = 13.3;
		kc1.store = 10;
		kc2.brand = "ThinkPad";
		kc2.price = 7777.77;
		kc2.size = 15.6;
		kc2.store = 20;
		kc3.brand = "AsusKnight";
		kc3.price = 9999.99;
		kc3.size = 18.9;
		kc3.store = 100;
		array.add(kc1);
		array.add(kc2);
		array.add(kc3);
	}
}

