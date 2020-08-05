package defaultPackage_2;
/*
 * ArrayList  集合中的方法
 * 
 * add(参数)  向集合中添加元素，数据存储进去
 *   方法中的参数类型，定义集合对象的时候类型是一致的
 * 
 * get(int index)  取出集合中的元素get方法的参数中，写入索引
 * 
 * size()  返回集合的长度，就是集合存储元素的个数
 * 
 * 集合的遍历 
 *   实现思想也是索引思想
 *   集合的索引从0开始 到 size（）-1
 *   方法 get（int index）
 * 
 * 集合的补充方法
 * 
 *   add（int index，存储的元素） 将元素添加到指定的索引上
 * 
 *   set(int index,修改后的元素)  将指定索引的元素进行修改
 *   
 *   remove(int index)  删除指定索引上的元素
 *   
 *   clear（）  清空集合中的所有元素
 */
import java.util.ArrayList;
public class ArrayListDemo_1 {
	public static void main (String[] args) {
		//定义集合，存储字符串元素
		ArrayList<String> array = new ArrayList<String>();
		//调用集合的方法add存储元素
		array.add("abc");
		array.add("-adsa-");
		array.add("-abwdawc-");
		array.add("-abcsddad-");
		//输出集合的长度 调用集合方法size size方法的返回值  int
		int size = array.size();
		System.out.println(size);
		
		//获取出集合的一个元素 ，获取1索引的元素
		//集合的方法get 获取元素后结果的数据类型
		String s = array.get(1);
		System.out.println(s);
		
		for(int i = 0; i < size ; i++) {
			System.out.println( array.get(i) );
		}
		
		//在索引2上，添加元素 7
		array.add(2,"sadawdad");
		System.out.println();
		//修改索引2的元素
		array.set(0, "woshizhu");
		System.out.println();
		//删除索引3上的元素
		array.remove(3);
		//清除集合的所有元素
		array.clear();
		for(int i = 0; i < array.size() ; i++) {
			System.out.println( array.get(i) );
		}
		
		
	}

}
