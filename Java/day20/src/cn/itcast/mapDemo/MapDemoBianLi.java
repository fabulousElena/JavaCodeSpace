package cn.itcast.mapDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * map集合的遍历
 *   利用键获取值
 *   map接口中定义方法keyset
 *   所有的键存储到Set集合
 */
public class MapDemoBianLi {

	public static void main(String[] args) {
		/*
		 * 1.调用map集合的方法Keyset，所有的键存储到set集合中
		 * 2。遍历set集合，获取出set集合中的所有元素（Map中的键）
		 * 3.调用map集合方法，通过键获取值
		 */
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "dawd");
		map.put(5, "aaaaaa");
		
		function(map);
		
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			String value = map.get(i);
			System.out.println(value);
		}
		System.out.println("==================");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			String value1 = map.get(it.next());
			System.out.println(value1);
		}
		
		
	}
	/*
	 * 1.调用map集合方法entrySet(),将集合中的映射关系对象，存储到set集合中
	 *   Set<Entry <Integer,String>
	 * 2.迭代set集合
	 * 3.获取出的set集合的元素，是映射关系的对象
	 * 4.通过映射关系中的方法 ，getKey  和 getValue 获取键值对。
	 */
	public static void function(Map<Integer,String> map) {
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while(it.hasNext()) {
			String value = it.next().getValue();
			System.out.println(value);
		}
		System.out.println(map.entrySet());
		System.out.println("==================");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue() + entry.getKey());
		}
	}
}
