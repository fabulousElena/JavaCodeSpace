package cn.itcast.mapDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * map���ϵı���
 *   ���ü���ȡֵ
 *   map�ӿ��ж��巽��keyset
 *   ���еļ��洢��Set����
 */
public class MapDemoBianLi {

	public static void main(String[] args) {
		/*
		 * 1.����map���ϵķ���Keyset�����еļ��洢��set������
		 * 2������set���ϣ���ȡ��set�����е�����Ԫ�أ�Map�еļ���
		 * 3.����map���Ϸ�����ͨ������ȡֵ
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
	 * 1.����map���Ϸ���entrySet(),�������е�ӳ���ϵ���󣬴洢��set������
	 *   Set<Entry <Integer,String>
	 * 2.����set����
	 * 3.��ȡ����set���ϵ�Ԫ�أ���ӳ���ϵ�Ķ���
	 * 4.ͨ��ӳ���ϵ�еķ��� ��getKey  �� getValue ��ȡ��ֵ�ԡ�
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
