/*Scanner类，作用，让我在命令行输入，接受键盘的输入
 * 使用Scanner类：
 * 1.导入包 ，指明这个类所在的文件夹 import
 * 2.公式，创建出Scanner类型变量
 * 3.变量，使用Scanner类中的功能 完成键盘输
 */
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		//类型  变量名 = new 类型（）；
		//创建出 Scanner，类变量
		Scanner sc = new Scanner(System.in);
		//变量.功能名字（）  接受键盘输入
		// 功能  nextInt（） 接受键盘啊输入，保证输入的是整数
		//功能接受的数据就是整数，功能运行后的结果就是整数类型
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner类的另一个功能   next()接受键盘输入的字符串
		
		String s = sc.next();
		System.out.println(s);
	}
}




