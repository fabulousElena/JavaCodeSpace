package cn.itcast.demoTest;
/*
 * ����Ա���� 
 *   ���ݶ�����������Ĺ��Գ�ȡ
 *     ���� ������  ����
 *     ����������
 */
public abstract class Employee {
	//��������  ��Ա����
	private String name;
	//�����Ա��������
	private String ID;
	
	//���幤������
	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	

}
