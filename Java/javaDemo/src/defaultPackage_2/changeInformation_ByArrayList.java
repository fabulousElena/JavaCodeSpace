package defaultPackage_2;
import java.util.ArrayList;
import java.util.Scanner;
public class changeInformation_ByArrayList {
	public static void main (String[] args) {
		//定义集合
		ArrayList<storeKuCun> array = new ArrayList<storeKuCun>();
		System.out.println("欢迎进入库存查看与修改系统，清输入您要选择的功能：");
		addInformation(array);
		while(true) {
			int i = chooseFunction();
			switch(i) {
		
		case 1:
			//查看库存清单
			showStore(array);
			break;
			
		case 2:
			//修改库存数量
			changeInformation(array);
			showStore(array);
			break;
			
		case 3:
			//退出
			System.out.println("程序已退出。谢谢使用");
			return;
			
		default :
			System.out.println("没有这个功能,请重新输入");
			break;
		}
	}
		
	}
	//选择功能
	public static int chooseFunction() {
		System.out.println("--------库存管理--------");
		System.out.println("1: 查看库存清单");
		System.out.println("2：修改商品库存数量");
		System.out.println("3：退出");
		System.out.println("请输入要执行的操作序号");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	//修改库存信息
	public static void changeInformation(ArrayList<storeKuCun> array) {
		Scanner sc = new Scanner(System.in);
		//int j = sc.nextInt();
		//array.set(array.get(i).store, 300);//修改库存报错
		for(int j = 0; j < array.size() ; j++) {
			storeKuCun k = array.get(j);
			System.out.println("请输入"+k.brand +"修改后的库存");
			k.store = sc.nextInt();
			//System.out.print(k.store+"  \t");
		}		
	}
	
	//遍历商品信息 
	public static void showStore(ArrayList<storeKuCun> array) {
		double totalPrice = 0;
		int totalStore = 0;
		System.out.println("----------------库存查看系统-----------------");
		System.out.println("     品牌                                 价格                           尺寸          库存数");
		for(int i = 0 ;i < array.size(); i++) {
			storeKuCun s = array.get(i);
			System.out.println(s.brand+"   \t"+s.price+"   \t"+s.size+"   \t"+s.store);
			totalStore += s.store;
			totalPrice += s.price*s.store;
		}
		System.out.println("商品总价格为"+totalPrice);
		System.out.println("商品总库存为"+totalStore);
	}
	
	//添加商品信息
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

