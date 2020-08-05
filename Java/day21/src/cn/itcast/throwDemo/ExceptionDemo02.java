package cn.itcast.throwDemo;
/*
 * �쳣�Ĵ���ʽ
 *   try .. catch   
 *   ��ʽ  
 *     try{
 *        �����Ĵ���
 *        ���ܳ��ֵĴ���
 *     }catch(�쳣����  ����){
 *        �쳣�Ĵ���ʽ
 *     }finally{
 *        ����Ҫִ�еĴ���
 *     }
 */
public class ExceptionDemo02 {

	public static void main(String[] args){
		int[] arr = null;
		try {
			int i = getArray(arr);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("�������");
	}
	
	/*
	 * ���巽�����ڷ������׳��쳣
	 */
	public static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
		//�������п� 
		if(arr == null) {
			//�ֶ��׳��쳣,�׳���ָ���쳣
			throw new NullPointerException("���鲻����");
		}
		//����������������ж�
		if(arr.length < 3) {
			//�ֶ��׳��쳣���׳����������Խ���쳣
			throw new ArrayIndexOutOfBoundsException("����Խ���쳣");
		}
		return arr[3]+1;
	}
	
}
