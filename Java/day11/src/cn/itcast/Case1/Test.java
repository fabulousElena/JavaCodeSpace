package cn.itcast.Case1;

public class Test {
	public static void main(String[] args) {
		//�����ʼǱ������ñʼǱ�����ȥ���ñʼǱ��Ĺ���
		Computer com = new Computer();
		com.openComputer();
		
		//���ñʼǱ�ʹ��USb�豸�ķ���
		//���� ����USB�ӿ����ͣ��ӿڲ��ܽ�������
		//���÷���������USB�ӿڵ�ʵ�������
		//Mouse m = new Mouse();
		com.useUSB(new Mouse());
		
		com.useUSB(new Keyborad());
		
		com.closeComputer();
	}

}
