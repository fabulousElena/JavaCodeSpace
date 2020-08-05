package cn.itcast.JDBCdemo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * ʹ��PreparedStatement �ӿ�ʵ�����ݱ�ĸ��²���
 */
public class JDBCdemo {
	public static void main(String[] args) throws Exception{
		// 1 ע������,ʹ�÷��似��������������뵽����
		// ʹ��java.sql.DriverManager��ľ�̬����registerDriver(Driver driver)
		// Driver��һ���ӿڣ����������� MySQL���������е�ʵ���ࡣ
		// DriverManager.registerDriver(new Driver());
		// ͨ������Դ���룬ע����������������
		Class.forName("com.mysql.jdbc.Driver");

		// 2������ݿ������
		// static Connection getConnection (String url , String user , String password)
		// ����ֵ��Connection��ʵ���࣬��mysql������������
		// URL�����ݿ�ĵ�ַ jdbc:mysql://��������ip:�˿ں�/���ݿ������
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		
		
		//ƴд�޸ĵ�sql��� ���ã�վλ
		String sql = "UPDATE sort SET sname = ? , sprice = ? WHERE sid = ?";
		
		//�������ݿ����Ӷ���con�ķ���preparedStatement��ȡsql����Ԥ�������
		PreparedStatement pst =  con.prepareStatement(sql);
		//����pst����setXXX����?վλ
		pst.setObject(1, "��������");
		pst.setObject(2, 486655);
		pst.setObject(3, 7);
		//����pst����ִ��sql���
		pst.executeUpdate();
		
		pst.close();
		con.close();
		
		
	}

}
