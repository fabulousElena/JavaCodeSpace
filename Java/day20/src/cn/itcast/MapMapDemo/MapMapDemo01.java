package cn.itcast.MapMapDemo;

import java.util.HashMap;
import java.util.*;

/*
 * Map集合的嵌套，Map中存储的还是Map集合
 * 要求：
 *    
 */
public class MapMapDemo01 {
	public static void main(String[] args) {
		//定义基础班级集合
		HashMap<String,String> javase = new HashMap<String,String>();
		//定义就业班集合
		HashMap<String,String> javaee = new HashMap<String,String>();
		//向班级集合中，存储学生信息
		javase.put("001", "zhangsan");
		javase.put("002", "lisi");
		
		javaee.put("001", "wangwu");
		javaee.put("002", "zhaoliu");
		//创建集合容器，键是班级名字，值是两个班级容器
		HashMap<String,HashMap<String,String>> z = 
				new HashMap<String,HashMap<String,String>>();
		z.put("基础班", javase);
		z.put("就业班", javaee);
		
//		keySet(z);
		entrySet(z);
	}
	
	//遍历
	public static void keySet(HashMap<String,HashMap<String,String>> z) {
		//调用z 集合的方法 keySet ，将键存储到Set集合
		Set<String> set = z.keySet();
		//迭代
		Iterator<String> classNameIt = set.iterator();
		while(classNameIt.hasNext()) {
			//获取set集合元素，也就是z 的键
			String classNameKey = classNameIt.next();
			//获取z 的值 ，值是一个HashMap集合
			HashMap<String,String> classMap = z.get(classNameKey);
			//调用classMap集合的方法，将里面的键存储到set集合
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while(studentIt.hasNext()) {
				//studentIt.next()获取出来的是 学生学号 classMap的键
				String numKey = studentIt.next();
				//调用classMap集合中的get方法获取值
				String nameValue = classMap.get(numKey);
				System.out.println(classNameKey + "..."+ numKey+ "....." + nameValue);
			}
		}
	}
    public static void entrySet(HashMap<String,HashMap<String,String>> z) {
		//调用z集合方法entrySet方法，将z集合的键值对关系对象，存储到set集合
    	Set<Map.Entry<String, HashMap<String,String>>> classNameSet = z.entrySet();
    	//迭代器迭代Set集合
    	Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
    	while(classNameIt.hasNext()) {
    		//classNameIt.next()方法，取出来的是z集合的键值对关系对象
    		Map.Entry<String, HashMap<String,String>> classNameEntry = classNameIt.next();
    		//classNameEntry方法getKey  getValue
    		String classNameKey = classNameEntry.getKey();
    		//获取值  值 是一个Map集合 
    		HashMap<String,String> classMap = classNameEntry.getValue();
    		//迭代班级集合
    		Set<Map.Entry<String,String>> studentSet = classMap.entrySet();
    		Iterator<Map.Entry<String,String>> studentNumIt = studentSet.iterator();
    		while(studentNumIt.hasNext()) {
    			Map.Entry<String, String> studentEntry = studentNumIt.next();
    			//studentEntry 方法getKey  getValue 
    			String studentNumKey = studentEntry.getKey();
    			String studentNameValue = studentEntry.getValue();
    			System.out.println(classNameKey + studentNumKey + studentNameValue);
    		}
    		
    		
    	}
	}

}
