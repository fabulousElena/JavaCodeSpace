package cn.itcast.StaticImportDemo;
/*
 * 静态导入
 * 减少开发的代码量
 * 标准写法，在导入包的时候才能使用
 * import static java.lang.System.out;最末尾必须是一个静态成员
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
