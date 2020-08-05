/*
 * 格式：if(条件){
 *          if语句的执行体
 *      }
 *      条件：结果必须是布尔类型   
 * 
 */
import java.util.Scanner;
public class ifDemo {

	public static void main(String[] args) {
		int i = 5;
		if (i==5) {
			System.out.println("if语句条件是true");
			i++;
		}
		System.out.println(i);
		
		/*if...else 语句格式
		 * 格式： if(条件){
		 *           if的执行体
		 * }else{
		 *           else的执行体
		 * }
		 */
		int j = 17;
		//判断变量是奇偶数，除以二 看余数。余数=1是奇数，=0是偶数
		if (j % 2 == 0) {
			System.out.println("是偶数");
		}else {
			System.out.println("是奇数");
		 }
		
		//打印学生成绩
		Scanner Stu = new Scanner(System.in);
		int k = Stu.nextInt();
		if(100 >= k && k >= 80) {
			System.out.println("该学生的成绩是"+k+"--成绩优秀");
		}else if(80 > k && k >= 60) {
			System.out.println("该学生的成绩是"+k+"--成绩及格");
		}else if(60 > k && k >=0) {
			System.out.println("该学生的成绩是"+k+"--成绩不及格");
		}else {
			System.out.println("您输入的成绩格式不正确，请输入数字0-100");
		}
		

	}

}
