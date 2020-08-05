package cn.itcast.ForEachDemo;
import java.util.ArrayList;

/*
 * ��ǿforѭ��
 * �µĽӿ�  java.lang.Iterable 
 *   Collection��ʼ�̳�Iterable 
 *   Iterable ʵ����ǿforѭ��
 *   
 *   ��ʽ��
 *   for( �������� ������ : ���ݻ����Ǽ���){
 *        syso(����)��
 *   }
 */
import cn.itcast.ArrayListDemo.Person;
public class ForEachDemo {
	public static void main(String[] args) {
		function3();
	}
	
	/*
	 * ��ǿforѭ����������
	 * �洢�Զ����Person����
	 */
	public static void function3() {
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(new Person("a",20));
		arr.add(new Person("b",30));
		for(Person p : arr) {
			System.out.println(p);
		}
	}
	
	/*
	 * for ���ڶ������������ʱ���ܷ�ȥ���ö���ķ����أ�
	 * yes
	 * 
	 */
	public static void function2() {
		String[] str = {"12da","wda223","2d4r"};
		for(String s : str) {
			System.out.println(s.length());
		}
	}
	
	/*
	 * ʵ����ǿforѭ��  
	 * �ô���������  �����˶��������б���
	 * �׶ˣ�û�����������ܲ��������ڵ�Ԫ��
	 */
	public static void function() {
		int[] arr = {1,0};
		for(int i : arr) {
			System.out.println(i+1);
		}
		System.out.println(arr[0]);
	}

}
