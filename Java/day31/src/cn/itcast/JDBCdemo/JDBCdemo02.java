package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * java����ʵ���û���¼���û��������룬���ݿ���
 * ��ʾ������ע�빥��
 */
public class JDBCdemo02{
	public static void main(String[] args)  throws Exception{
		//1 ע������
		Class.forName("com.mysql.jdbc.Driver");
		// 2��ȡ���Ӷ���
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		// 3��ȡִ��sql������
		Statement stat = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//ִ��sql��� �����ݱ��в�ѯ�û���������
		//������� ��¼�ɹ�  ��֮��¼ʧ��
		String sql = "SELECT * FROM users WHERE username = '"+user+"' AND PASSWORD = '"+pass+"'\r\n";
		System.out.println(sql);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("username")+ " " + rs.getString("password"));
		}
		
		rs.close();
		con.close();
		stat.close();
	}

}
