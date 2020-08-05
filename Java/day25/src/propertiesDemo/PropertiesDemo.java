package propertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 *  ���϶���Properties��,�̳�Hashtable,ʵ��Map�ӿ�
 *  ���Ժ�IO������ʹ��,ʵ�����ݵĳ־ô洢
 */
public class PropertiesDemo {
	public static void main(String[] args)throws IOException {
		function_1();
	}
	/*
	 * Properties���ϵ����з���store
	 * store(OutputStream out)
	 * store(Writer w)
	 * �������е��ֽڻ����ַ��������,�������еļ�ֵ��,д���ļ��б���
	 */
	public static void function_2()throws IOException{
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "31");
		pro.setProperty("email", "123456789@163.com");
		FileWriter fw = new FileWriter("c:\\pro.properties");
		//��ֵ��,����ļ�,ʹ�ü��ϵķ���store�����ַ������
		pro.store(fw, "");
		fw.close();
	}
	
	/*
	 * Properties�������з��� load
	 * load(InputStream in)
	 * load(Reader r)
	 * ����������ֽڻ����ַ�������
	 * �������ȡ�ļ��еļ�ֵ��,���浽����
	 */
	public static void function_1()throws IOException{
		Properties pro = new Properties();
		FileReader fr = new FileReader("f:\\pro.properties");
		//���ü��ϵķ���load,�����ַ�������
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	
	/*
	 * ʹ��Properties����,�洢��ֵ��
	 * setProperty��ͬ��Map�ӿ��е�put
	 * setProperty(String key, String value)
	 * ͨ������ȡֵ, getProperty(String key)
	 */
	public static void function(){
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		System.out.println(pro);
		
		String value = pro.getProperty("c");
		System.out.println(value);
		
		//����stringPropertyNames,�������еļ��洢��Set����,������Map�ӿڵķ���keySet
		Set<String> set = pro.stringPropertyNames();
		for(String key : set){
			System.out.println(key+"..."+pro.getProperty(key));
		}
	}
}
