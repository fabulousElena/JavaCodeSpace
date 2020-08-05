package cn.itcast.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合中的迭代器
 *    获取集合中元素的方式
 *   接口Iterator  ：两个抽象方法
 *     Boolean hasNext（） 判断集合中还有没有可以取出来的元素  如果有返回true
 *     next（） 去除集合中的下一个元素 
 *     
 *   Iterator接口，要有实现类，重写接口方法
 *     Collection 接口中定义了一个方法 Iterator
 *     Iterator iterator()
 *    ArrayList 重写方法iterator（） 返回了Iterator接口的实现类对象
 *    使用ArrayList集合的对象  
 *    Iterator it = array.iterator()   运行结果是Iterator接口的实现类对象
 *    it 是接口实现类的对象   it.hasNext()   it.next(); 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("juju6");
		coll.add("juju5");
		coll.add("juju4");
		coll.add("juju3");
		coll.add("juju2");
		coll.add("juju1");
		Iterator<String> i = coll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	

}
