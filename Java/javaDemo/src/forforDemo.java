/*
 * 循环嵌套：循环里面还要循环，for形式居多
 * for(){
 *     for(){
 *     
 *     }
 * }
 * 总循环次数= 内循环次数*外循环次数；
 */
public class forforDemo {

	public static void main(String[] args) {
		//打印直角三角形
		for(int i = 0;i < 9; i++) {
			for(int j = 0;j <=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
