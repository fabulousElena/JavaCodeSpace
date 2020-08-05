package defaultPackage_2;
/*
 * ArrayList  �����еķ���
 * 
 * add(����)  �򼯺������Ԫ�أ����ݴ洢��ȥ
 *   �����еĲ������ͣ����弯�϶����ʱ��������һ�µ�
 * 
 * get(int index)  ȡ�������е�Ԫ��get�����Ĳ����У�д������
 * 
 * size()  ���ؼ��ϵĳ��ȣ����Ǽ��ϴ洢Ԫ�صĸ���
 * 
 * ���ϵı��� 
 *   ʵ��˼��Ҳ������˼��
 *   ���ϵ�������0��ʼ �� size����-1
 *   ���� get��int index��
 * 
 * ���ϵĲ��䷽��
 * 
 *   add��int index���洢��Ԫ�أ� ��Ԫ����ӵ�ָ����������
 * 
 *   set(int index,�޸ĺ��Ԫ��)  ��ָ��������Ԫ�ؽ����޸�
 *   
 *   remove(int index)  ɾ��ָ�������ϵ�Ԫ��
 *   
 *   clear����  ��ռ����е�����Ԫ��
 */
import java.util.ArrayList;
public class ArrayListDemo_1 {
	public static void main (String[] args) {
		//���弯�ϣ��洢�ַ���Ԫ��
		ArrayList<String> array = new ArrayList<String>();
		//���ü��ϵķ���add�洢Ԫ��
		array.add("abc");
		array.add("-adsa-");
		array.add("-abwdawc-");
		array.add("-abcsddad-");
		//������ϵĳ��� ���ü��Ϸ���size size�����ķ���ֵ  int
		int size = array.size();
		System.out.println(size);
		
		//��ȡ�����ϵ�һ��Ԫ�� ����ȡ1������Ԫ��
		//���ϵķ���get ��ȡԪ�غ�������������
		String s = array.get(1);
		System.out.println(s);
		
		for(int i = 0; i < size ; i++) {
			System.out.println( array.get(i) );
		}
		
		//������2�ϣ����Ԫ�� 7
		array.add(2,"sadawdad");
		System.out.println();
		//�޸�����2��Ԫ��
		array.set(0, "woshizhu");
		System.out.println();
		//ɾ������3�ϵ�Ԫ��
		array.remove(3);
		//������ϵ�����Ԫ��
		array.clear();
		for(int i = 0; i < array.size() ; i++) {
			System.out.println( array.get(i) );
		}
		
		
	}

}
