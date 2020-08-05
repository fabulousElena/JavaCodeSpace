package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC �������ݿ�Ĳ���
 * 1.	ע������.
 *   ��֪JVMʹ�õ�����һ�������ݿ�����
   2.	�������.
               ʹ��JDBC�е��࣬��ɶ�MySQL���ݿ������
   3.	������ִ��ƽ̨
               ͨ�����Ӷ����ȡ��sql����ִ���߶���
   4.	ִ��sql���
               ʹ��ִ���߶��������ݿ���ִ��sql���
               ��ȡ�����ݿ��ִ�к�Ľ����
   5.	������
   6.	�ͷ���Դ.
               ����һ�ѵ�close����

 * 
 */
public class JDBCDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		//1 ע������,ʹ�÷��似��������������뵽����
		// ʹ��java.sql.DriverManager��ľ�̬����registerDriver(Driver driver)
		//Driver��һ���ӿڣ����������� MySQL���������е�ʵ���ࡣ
		//DriverManager.registerDriver(new Driver());
		//ͨ������Դ���룬ע����������������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2������ݿ������ 
		//static Connection getConnection (String url , String user , String password)
		//����ֵ��Connection��ʵ���࣬��mysql������������
		//URL�����ݿ�ĵ�ַ  jdbc:mysql://��������ip:�˿ں�/���ݿ������
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println(con);
		
		//3������ִ��ƽ̨��ͨ�����ݿ����Ӷ��󣬻�ȡ��sql����ִ���߶���
		//con ������÷��� Statement createStatement()��ȡStatement���󣬽�sql��䷢�͵����ݿ�
		//����ֵ��Statement�ӿڵ�ʵ������� ��mysql����������
		Statement sta = con.createStatement();
		System.out.println(sta);
		
		//4 ִ��sql���
		//ͨ��ִ���߶�����÷���ִ��sql����ȡ���
		//int executeUpdate (String sql)
		//ִ�����ݿ��е�sql��䣬 insert delete update
		//����ֵint �ǲ����ɹ����ݱ��ж�����
		int row = sta.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('�ﳵ',222000,'�������Ż�')");
		System.out.println(row);
		
		//6 �ͷ���Դ һ��close����
		sta.close();
		con.close();
	}
	
}













