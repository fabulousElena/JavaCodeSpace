package cn.itcast.caseDemo01;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("Manager","manager001",1000);
		Cooker c = new Cooker("厨师","cooker001");
		Waiter w1 = new Waiter("服务员1","waiter001");
		Waiter w2 = new Waiter("服务员2","waiter002");
		luckyEmployee();
		System.out.println(m.getBonus());
		m.Server();
		System.out.println(m.getName() + m.getID());
		c.Server();
		System.out.println(c.getName() + c.getID());
		w1.Server();
		System.out.println(w1.getName() + w1.getID());
		
		
	}
	
	//定义幸运员工
	public static void luckyEmployee() {
		String arr[] = {"厨师","经理","服务员1","服务员2"};
		Random r = new Random();
		int  j = r.nextInt(arr.length);
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[j] == arr[i]) {
				System.out.println("幸运员工是" + arr[i]);
				break;
				
			}
		}
	}

}
