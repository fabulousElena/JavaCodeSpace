package cn.itcast.StaticImportDemo;
/*
 * ��̬����
 * ���ٿ����Ĵ�����
 * ��׼д�����ڵ������ʱ�����ʹ��
 * import static java.lang.System.out;��ĩβ������һ����̬��Ա
 */
import static java.lang.System.out;
import static java.util.Arrays.sort;
public class StaticImportDemo01 {
	public static void main(String[] args) {
		out.println(23234234);
		int[] arr = {1211,1,1,2,6,5,};
		sort(arr);
        out.println(arr.toString());
	}

}
