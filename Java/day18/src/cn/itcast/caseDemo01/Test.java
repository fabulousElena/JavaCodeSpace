package cn.itcast.caseDemo01;
import java.util.Random;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager(null, null, 0);
		setManager(m);
		Waiter w1 = new Waiter(null, null);
		Waiter w2 = new Waiter(null, null);
		setWaiter(w1,w2);
		Cooker c = new Cooker(null, null);
		setCooker(c);
		while(true) {
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			switch (i) {
			case 1://����Ա��
				System.out.println("���������Ա�����ǣ�" + luckyEmployee() + "����������������ϲ��");
				break;
				
			case 2://����Ա����
				w1.vip();
			    break;
			
			case 3://��ʦ�Ӳ�
				c.vip();
				break;
			case 4://����Ա����
				w1.server();
				break;
			case 5:
				return;
			default:
				continue;
			
			}
			
			
		}
		
		
	}
	
	public static void setCooker(Cooker c) {
		c.setID("Cooker001");
		c.setName("����");
	}
	
	public static String luckyEmployee() {
		String arr[] = {"Manager001","Waiter001","Waiter002","Cooker001"};
		Random r = new Random();
		String j = null;
		int c =  r.nextInt(arr.length);
		for(int i = 0 ; i < arr.length ; i ++) {
			if(c == i) {
				j = arr[i];
				
			}
		}
		return j;
		
	}
	
	public static void setWaiter(Waiter w1,Waiter w2) {
		
		w1.setID("Waiter001");
		w2.setID("Waiter002");
		
		w1.setName("С��");
		w2.setName("С��");
		
	}
	
	public static void setManager(Manager m) {
		m.setBouns(1000);
		m.setID("Manager001");
		m.setName("С��");
	}

}
