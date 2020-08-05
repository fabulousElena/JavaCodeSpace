import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		System.out.println("小游戏：猜0-10之间的数字");
		System.out.print("请您输入数字：");
		Random ran= new Random();
		int i =  ran.nextInt(10)+1;
		Scanner sc =  new Scanner(System.in);
		while(true) {
			int j = sc.nextInt();
		if(j>i) {
			System.out.println("您猜大了，请您重新猜~");
		}else if(j<i) {
			System.out.println("您猜小了，请您重新猜~");
		}else if(j==i) {
			break;
		}
		}System.out.println("恭喜您，猜对啦！");
	}

}
