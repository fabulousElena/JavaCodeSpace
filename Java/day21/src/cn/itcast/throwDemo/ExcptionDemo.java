package cn.itcast.throwDemo;
/*
 * �쳣�еĹؼ��� 
 *   throw ���ڷ������ڲ����׳��쳣�Ķ���
 *   throw �ĺ��棬����дnew�Ķ��󣬶���������쳣�Ķ���Exception����������
 *   
 *   �����������쳣�ؼ��� throws
 *   �����ڷ����������ϣ����������˷������ܳ����쳣
 *   ������ߴ���
 *   throws�������д�쳣������� 
 *   
 *   ������һ���׳��쳣�ķ����������߾ͱ��봦��������ͱ���ʧ��
 */
public class ExcptionDemo {

	public static void main(String[] args) throws Exception {
		
		int[] arr1 = {};
		getArray(arr1);
	}
	//������������������2 ����
	public static int getArray(int[] arr) throws Exception{
		//�Է����Ĳ��������кϷ��Ե��ж� �������ж��ǲ���null 
		if(arr.equals(null)) {
			//�׳��쳣����ʽ�ϸ��ߵ�����
			//�ؼ���  throw ����д�ڷ������ڲ�  
			throw new Exception("���δ���");
		}
		
		//��������������жϣ��ж��������ǲ�����Ԫ��
		if(arr.length == 0) {
			//�׳��쳣����ʽ�����ߵ����ߣ�����û��Ԫ��
			throw new Exception("����û��Ԫ��");
		}
		
		int i  = arr.length-1;
		return i*2;
	}
}
