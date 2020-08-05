package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * java����ʵ���û���¼���û��������룬���ݿ���
 * ��ֹ��ע�빥��
 * Statement�ӿ�ʵ����  ����  ִ��sql��� ���ؽ����
 * ��һ���ӽӿ�PreparedStatement ��sqlԤ����洢����θ�Ч��ִ��sql��
 * �ӽӿڵ�ʵ����  Ҳmysql��������  ��λ�ȡ�ӿڵ�ʵ����
 * 
 * �˷�����Connection���ݿ����Ӷ���ķ���
 * PreparedStatement preparedStatement��String sql��
 */
public class JDBCdemo03{
	public static void main(String[] args)  throws Exception{
		//1 ע������
		Class.forName("com.mysql.jdbc.Driver");
		// 2��ȡ���Ӷ���
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		// 3��ȡִ��sql������
		
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//ִ��sql��� �����ݱ��в�ѯ�û���������
		//������� ��¼�ɹ�  ��֮��¼ʧ��
		String sql = "SELECT * FROM users WHERE username = ? AND PASSWORD = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		System.out.println(sql);
		//����Connection�ӿڵķ��� PreparedStatement ��ȡ PreparedStatement �ӿڵ�ʵ����
		//�����в�����sql����еĲ���ȫ�������ʺ�ռλ��
		//����pst����set�����������ʺ�ռλ���ϵĲ���
		pst.setObject(1, user);
		pst.setObject(2, pass);
		//���÷��� ִ��sql����ȡ�����
		System.out.println(user + pass);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("username")+ " " + rs.getString("password"));
		}
		
		System.out.println(user);
		rs.close();
		con.close();
		pst.close();
	}

}
