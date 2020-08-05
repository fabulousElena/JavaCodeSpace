/*
 * 二维数组
 *     数组中存储的还是数组
 *     
 *     定义方式  ：
 *         int[][] arr = new int[3][4];
 *         定义一个二维数组
 *         [3]  表示：二维数组中，有三个一维数组
 *         [4]  表示：三个一维数组中，每个数组的长度是4
 *         
 *         最简单的二维数组定义方式  
 *         int[][] arr = { {1,3} , {3,5,6} , {2,3,4,5,6} };
 *         
 *     二维数组的遍历
 *       二维数组中，存储的几个一维数组，每个一维数组的长度不同
 *       
 *       遍历 ：for循环  遍历二维数组
 *            循环过程中，for循环再次遍历一维数组
 */
import java.util.Random;
public class arrayarrayDemo {

	public static void main(String[] args) {
		System.out.println("二维数组遍历");
		//int[][] arr = new int[3][4];
		int[][] arr = { {1,3} , {3,5,6} , {2,3,4,5,6} , {2,3}};
		System.out.println(arr[2][3]);
		//外循环 遍历二维数组
		for (int i = 0; i < arr.length; i++ ) {
			//内循环，遍历每个一维数组。 arr[0] arr[1] arr[2] arr[i]
			for (int j = 0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		//公司销售总和
		int[][] arr1 = { {11,12},{21,22,23}, {31,32,33,34} };
		int teamtotal = 0 ;
		int cpytotal = 0 ;
		for (int n = 0; n < arr1.length ; n++ ) {
			for ( int m = 0 ; m < arr1[n].length ; m++ ) {
				//小组销售额求和
				teamtotal = arr1[n][m] + teamtotal ;
			}
			System.out.println("第"+ (n+1) +"小组的销售额是"+teamtotal+ "万元");
			//总销售额求和
			cpytotal = cpytotal + teamtotal;
			//小组销售额清空 ，用于下次循环存储下一小组销售份额数值
			teamtotal = 0;
		}
		System.out.println("年度销售总额是"+cpytotal + "万元");
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		
		//随机点名器
		/*
		 * 随机点名器  ：
		 *      1  存储姓名 
		 *      2 预览所有人的姓名
		 *      3 随机出一个人的姓名
		 */
		
		//存储姓名，要把姓名存储到数组中。
		//属猪存储姓名 ，姓名的数据类型 ：String
		String [] names = {"张三","李四","王二","李华","小明","老王","小红"};
		for ( int i = 0; i < names.length ; i++ ) {
			System.out.print(names[i]+"  ");
		}
		System.out.println();
		Random ran = new Random();
		int j = ran.nextInt(names.length);
		System.out.println("随机点名同学为："+ names[j]);
		
	}

}
