package defaultPackage_2;
import java.util.*;
public class ArrayMethodTest {
	/*
	 * ���巽����ʵ������ı���
	 * �����У������� {11,33,55,66,77,89}
	 * �����������ַ���  [ ] , 
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
		 * ��������� ��һ�㶼���������У�Ԫ�ش�С�����Ԫ��
		 * 
		 * ��������ʽ
		 *   ѡ�����������ÿ��Ԫ�ض����бȽ�
		 *   ð����������������Ԫ�ؽ��бȽ�
		 *     ���򣺱Ƚϴ�С��λ�ý���
		 */
	}
	
	/*
	 * ���в���
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
				System.out.println("������Ԫ�ص������ǣ�"+mid);
				return i;
			}
		}
		return -1;
		
	}
	
	/*
	 * ð������
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
	 * ѡ������
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
	 * ���������
	 *   �����е�Ԫ�ؽ���λ���ϵĽ���
	 *   ���򲻵��ڷ������
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
