package defaultPackage_2;
import java.util.*;
public class ArrayMethodTest {
	/*
	 * 定义方法，实现数组的遍历
	 * 遍历中，输出结果 {11,33,55,66,77,89}
	 * 结果里面包含字符串  [ ] , 
	 */
	public static void main(String[] args) {
		int[] arr = {113,-353,55,55,66,7,89};
		showArray(arr);
		
		int[] arr1 = {111,33,55,66,77,89,332,2};
		showArray(arr1);
		
		niXuArray(arr1);
		showArray(arr1);
		
		selectSort(arr);
		showArray(arr);
		
		maoPao(arr1);
		showArray(arr1);
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = halfSort(arr1,i);
		System.out.println(j);
		
		
		/*
		 * 数组的排序 ：一般都是升序排列，元素从小到大的元素
		 * 
		 * 两种排序方式
		 *   选择排序：数组的每个元素都进行比较
		 *   冒泡排序：数组中相邻元素进行比较
		 *     规则：比较大小，位置交换
		 */
	}
	
	/*
	 * 折中查找
	 * 
	 */
	public static int halfSort(int[] arr1,int i) {
		int max = arr1.length-1;
		int min = 0;
		int mid = 0;

		while(min <= max) {
			mid = (max + min)/2;
			if(arr1[mid] < i) {
				min = mid+1;
			}else if(arr1[mid] > i) {
				max = mid-1;
			}else{
				System.out.println("您查找元素的索引是："+mid);
				return i;
			}
		}
		return -1;
		
	}
	
	/*
	 * 冒泡排序
	 */
	public static void maoPao(int[] arr1) {
		int a = 0 ;
		for(int i = 0 ; i < arr1.length - 1 ; i++) {
			for(int j = 0 ; j < arr1.length - i - 1 ; j++) {
				if(arr1[j] > arr1[j+1]) {
				a = arr1[j];
				arr1[j] = arr1[j+1];
				arr1[j+1] = a ;
				}
			}
		}
	}
	
	/*
	 * 选择排序
	 */
	public static void selectSort(int[] arr) {
		int a = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1 ; j < arr.length ; j++ ) {
				if(arr[i]>arr[j]) {
					a = arr[j];
					arr[j] = arr[i];
					arr[i] = a;
				}
				
			}
		}
	}
	
	public static void showArray(int[] arr) {
		System.out.print('[');
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length-1) {
				break;
			}else {
				System.out.print(',');
			}
		}
		System.out.println(']');
		
	}
	/*
	 * 数组的逆序
	 *   数组中的元素进行位置上的交换
	 *   逆序不等于反向遍历
	 */
	public static void niXuArray(int[] arr1) {
		int i = 0 ; 
		for (int j = 0 ; j < arr1.length/2; j++) {
			i = arr1[j];
			arr1[j] = arr1[arr1.length-1-j];
			arr1[arr1.length-1-j] = i;
		} 
		
	}

}
