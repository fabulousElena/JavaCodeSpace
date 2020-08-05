package cn.itcast.throwDemo;


/*
 *  Throwable���еķ���
 *  ��������,�����쳣����Ϣ�й�ϵ
 *    String getMessage() ���쳣��Ϣ����ϸ����       �쳣��!
 *    String toString()   ���쳣��Ϣ�ļ������       java.lang.Exception: �쳣��!
 *    void printStackTrace() ���쳣��Ϣ׷�ٵ���׼�Ĵ�����  �쳣��Ϣ��ȫ,JVMĬ�ϵ��÷���Ҳ���������
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
	  try{	 
		function();
	  }catch(Exception ex){
		  //System.out.println(ex.toString());
		  ex.printStackTrace();
	  }
	}
	
	public static void function() throws Exception{
		throw new Exception("�쳣��!");
	}
}

