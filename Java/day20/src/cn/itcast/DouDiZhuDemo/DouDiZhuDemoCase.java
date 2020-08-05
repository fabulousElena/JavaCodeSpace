package cn.itcast.DouDiZhuDemo;
/*
 *  实现模拟斗地主的功能
 *    1  组合牌
 *    2  洗牌
 *    3  发牌
 *    4  看牌
 */
import java.util.*;
public class DouDiZhuDemoCase {
	
	static final String s001 = "Player1";
	static final String s002 = "Player2";
	static final String s003 = "Player3";
	public static void main(String[] args) {
		
		//1.组合牌
		//创建map集合，键是编号，值是集合
		HashMap<Integer,String> pooker = new HashMap<Integer,String>();
		//创建ArrayList集合存储编号
		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		//定义出13个点数的数组
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6",
				"5","4","3"};
		//定义四个花色数组
		String[] colors = {"♠","♥","♣","◇"};
		//定义整数变量，作为键出现
		int index = 2;
		//遍历数组，花色加点数的组合，存储到Map集合
		for(String number : numbers) {
			for(String color : colors) {
				pooker.put(index, color + number);
				pookerNumber.add(index);
				index = index+1;
			}
		}
		//单独存储大王小王
		pooker.put(0, "JOKER");
		pookerNumber.add(0);
		pooker.put(1, "joker");
		pookerNumber.add(1);
		
		
		//2.洗牌，将牌的编号打乱
		Collections.shuffle(pookerNumber);
//		System.out.println(pookerNumber);
		
		//3.发牌功能，将牌编号，发给玩家集合，底牌集合
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> diPai = new ArrayList<Integer>();

		for(int i : pookerNumber) {
			if((0<=i)&&(i<=16)) {
				player1.add(pookerNumber.get(i));
			}else if((17<=i)&&(i<=33)) {
				player2.add(pookerNumber.get(i));
			}else if((34<=i)&&(i<=50)) {
				player3.add(pookerNumber.get(i));
			}else{
				diPai.add(pookerNumber.get(i));
			}
		}
		

		
		
		Random r = new Random();
		int random = r.nextInt(3);
//		System.out.println(random);
		if(random == 0) {
			System.out.println(s001 + "抢到地主！");
			for(int dipai : diPai) {
				player1.add(dipai);
			}
		}else if(random == 1) {
			System.out.println(s002 + "抢到地主！");
			for(int dipai : diPai) {
				player2.add(dipai);
			}
		}else if(random == 2) {
			System.out.println(s003 + "抢到地主！");
			for(int dipai : diPai) {
				player3.add(dipai);
			}
		}
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
//		System.out.println(player1);
//		System.out.println(player2);
//		System.out.println(player3);
//		System.out.println("底牌:" + diPai);
		//4.看牌
		ArrayList<String> pl1 = new ArrayList<String>();
		ArrayList<String> pl2 = new ArrayList<String>();
		ArrayList<String> pl3 = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();
		
		for(int p1 : player1) {
			pl1.add(pooker.get(p1));
		}
		if(pl1.size() == 20) {
			System.out.println("地主是"+ s001 + "，他的手牌："+ pl1);
		}else {
			System.out.println("农民是"+ s001 +"，他的手牌："+ pl1);
		}
		
		for(int p2 : player2) {
			pl2.add(pooker.get(p2));
		}
		if(pl2.size() == 20) {
			System.out.println("地主是"+ s002 + "，他的手牌："+ pl2);
		}else {
			System.out.println("农民是"+ s002 +"，他的手牌："+ pl2);
		}
		
		for(int p3 : player3) {
			pl3.add(pooker.get(p3));
		}
		if(pl3.size() == 20) {
			System.out.println("地主是"+ s003 + "，他的手牌："+ pl3);
		}else {
			System.out.println("农民是"+ s003 +"，他的手牌："+ pl3);
		}

		for(int d : diPai) {
			dp.add(pooker.get(d));
		}
		System.out.println("底牌是：" + dp);
	}

}
