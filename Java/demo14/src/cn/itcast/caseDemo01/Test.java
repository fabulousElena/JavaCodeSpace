package cn.itcast.caseDemo01;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("Manager","manager001",1000);
		Cooker c = new Cooker("��ʦ","cooker001");
		Waiter w1 = new Waiter("����Ա1","waiter001");
		Waiter w2 = new Waiter("����Ա2","waiter002");
		luckyEmployee();
		System.out.println(m.getBonus());
		m.Server();
		System.out.println(m.getName() + m.getID());
		c.Server();
		System.out.println(c.getName() + c.getID());
		w1.Server();
		System.out.println(w1.getName() + w1.getID());
		
		
	}
	
	//��������Ա��
	public static void luckyEmployee() {
		String arr[] = {"��ʦ","����","����Ա1","����Ա2"};
		Random r = new Random();
		int  j = r.nextInt(arr.length);
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[j] == arr[i]) {
				System.out.println("����Ա����" + arr[i]);
				break;
				
			}
		}
	}

}
