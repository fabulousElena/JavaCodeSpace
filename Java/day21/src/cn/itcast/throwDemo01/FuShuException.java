package cn.itcast.throwDemo01;


/*
 *  �Զ����쳣
 *    �̳�Exception,���߼̳�RuntimeException
 *    ���췽����,super���쳣��Ϣ,���ݸ�����
 */
@SuppressWarnings("serial")
public class FuShuException extends RuntimeException{
	public FuShuException(String s){
		super(s);
	}
	
	public FuShuException(){}
}
