package cn.itcast.demo02;
/*
 * String��Ĺ��췽��
 * String��Ĺ��췽����������ʽ
 */
public class StringDemo03 {
    public static void main(String[] args) {
	//���� String��Ĺ��췽��
    	function();
    	
}
    /*
     * �ֽ��Ǹ��������ֵ��ֽڱ�����Ǹ�����Ĭ�ϱ����GBK һ�����ֲ��������ֽڱ�ʾ
     * 
     * offset ���ݵ���ʼ����
     */
    public static void function() {
    	byte[] bytes = {-97,-98,-99,-100,99,100};
    	//����String�Ĺ��췽���������ֽ�����
    	String s = new String (bytes);
    	System.out.println(s);
    }
}
