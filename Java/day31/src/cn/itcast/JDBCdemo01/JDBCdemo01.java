package cn.itcast.JDBCdemo01;
/*
 * PrepareStatement�ӿ�ʵ�����ݱ�Ĳ�ѯ����
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBCdemo01{
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
		
		String sql = "SELECT * FROM sort";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		//����pst����ķ�������ִ�в�ѯ��� Select ���
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
//			System.out.println(rs.getString("sid") + " "+ rs.getString("sname")
//			+ " " + rs.getString("sprice")+"  " + rs.getString("sdesc"));
			System.out.println(rs.getString("sname"));
		}
		
		rs.close();
		con.close();
		pst.close();
		
		
	}
	

}
