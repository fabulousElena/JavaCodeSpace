package cn.itcast.StringBufferDemo01;

public class Test {
	public static void main(String[] args) {
		int arr[] =  {34,12,89,68};
		System.out.println(toString_2(arr));
		
		
	}
	
	public static String toString_2(int[] arr) {
		StringBuffer sb = new StringBuffer();		
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				sb.append(arr[i]+",");
			}else{
				sb.append(arr[i]+"]");
			}
		}		
		return sb.toString();
	}

}
