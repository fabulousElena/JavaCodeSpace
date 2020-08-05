package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC������ѯ���ݱ�  ��ȡ�����
 */
public class JDBCdemo01 {
	public static void main(String[] args) throws Exception {
		//1 ע������
		Class.forName("com.mysql.jdbc.Driver");
		//2��ȡ���Ӷ���
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		//3��ȡִ��sql������
		Statement stat = con.createStatement();
		//ƴд��ѯ��sql
		String sql = "SELECT * FROM sort";
		//4����ִ���߶��󷽷���ִ��sql����ȡ�����
		// ResultSet executeQuery(String sql)ִ��sql����е�select��ѯ
		//����ֵResultSet�ӿڵ�ʵ�������,ʵ������mysql������
		ResultSet rs = stat.executeQuery(sql);
		//5��������
		//ResultSet �ӿڷ��� boolean next() ����true �н����  ��֮��û��
		//System.out.println(rs.next());
		while(rs.next()) {
			//��ȡÿ�����ݣ�ʹ�õ���ResultSet�ӿڵķ��� getxx ���������� ����дString����
			//rs.getInt(0);  
			System.out.println(rs.getInt("sid") + " " + rs.getString("sname") 
			+ "  " + rs.getDouble("sprice") + "  " + rs.getString("sdesc"));
			
		}
		
		
		rs.close();
		stat.close();
		con.close();
		
		
		
	}

}
