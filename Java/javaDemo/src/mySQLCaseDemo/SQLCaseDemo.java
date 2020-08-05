package mySQLCaseDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class SQLCaseDemo {
	public SQLCaseDemo() {
	}

	static JTextField DBname;
	static JTextField DBid;
	static JPasswordField DBpass;
	static String mymyaccount = null;

	static int tableGetRow = 0;
	static int tableGetColumn = 0;

	static String userName = null;
	static String userNameData;// �洢���ݱ�������
	static String userNameFile;// �洢�ļ�����ı�������
	static String userNameFileData;// �洢�ļ��ı������
	public static Object[][] fileData;

	public static void main(String[] args) throws Exception {

		setFunction();

	}

	@SuppressWarnings("serial")
	public static void setFunction() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = con();

		// Map<String , String> map = new HashMap<String , String>();
		// map.put("2636485450", "Zhang970716");
		// map.put("15955867909", "123456");
		// map.put("1", "1");

		JFrame frame = new JFrame("���ݹ���");
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("F:\\workDemo\\\u5FAE\u4FE1\u56FE\u7247_20191224134640.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// �����˵���
		JMenuBar jmb = new JMenuBar();
		frame.setJMenuBar(jmb);
		JMenu jm1 = new JMenu("ϵͳ����");
		jmb.add(jm1);
		JMenu jm2 = new JMenu("δ��¼");
		jmb.add(jm2);
		jmb.setVisible(false);

		// �����˵����ڵ����ݲ����
		JMenuItem jmi1 = new JMenuItem("�����˺�");
		JMenuItem jmi2 = new JMenuItem("�˳�ϵͳ");
		jm1.add(jmi1);
		jm1.add(jmi2);

		// �����˺����ڵ����ݲ����
		JMenuItem changePass = new JMenuItem("�޸�����");
		jm2.add(changePass);
		JMenuItem quit = new JMenuItem("ע���˺�");
		jm2.add(quit);

		// �����˳�ϵͳ����
		jmi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		// �����ָ�������
		JSplitPane jsp = new JSplitPane();
		jsp.setOneTouchExpandable(true);
		jsp.setContinuousLayout(true);
		frame.setContentPane(jsp);

		// ���ñ���¼
		JTabbedPane jtp1 = new JTabbedPane(JTabbedPane.LEFT);
		jsp.setLeftComponent(jtp1);
		jsp.setDividerLocation(185);
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		JPanel jp2 = new JPanel();
		// JPanel jp3 = new JPanel();
		jtp1.addTab("�ҵ��ĵ�", jp1);
		JPanel jpFile = new JPanel(new BorderLayout());
		jtp1.add("�ҵ��ļ�", jpFile);

		// ��ӹ����� ���ҵ��ļ�ҳ�� �ļ�����
		JToolBar fileBar = new JToolBar();
		jpFile.add(fileBar, BorderLayout.NORTH);
		JTextField fileSerch = new JTextField();// �����ļ� ���ֿ�
		fileSerch.setColumns(10);
		JButton fileButton = new JButton("����");
		JButton addFileButton = new JButton("�ϴ����ļ�");
		addFileButton.setForeground(SystemColor.textHighlight);
		JButton flashFile = new JButton("ˢ��");
		fileBar.add(fileSerch);
		fileBar.add(fileButton);
		fileBar.add(flashFile);
		fileBar.add(addFileButton);

		JTable fileTable = new JTable();// ���� file�ļ��ı��
		JScrollPane fileScrollPane = new JScrollPane(fileTable);
		jpFile.add(fileScrollPane, BorderLayout.CENTER);

		String[] fileTitles = { "���", "�ļ���", "��С", "�ϴ�ʱ��", "����" };
		// Object[][] fileData = {};

		DefaultTableModel dtm2 = new DefaultTableModel(fileData, fileTitles) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		fileTable.setRowHeight(30);

		DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
		renderer2.setHorizontalAlignment(JLabel.CENTER);
		fileTable.setDefaultRenderer(Object.class, renderer2);// ���ñ�����־���
		fileTable.setModel(dtm2);
		fileTable.setFont(new Font("��������", Font.PLAIN, 15));

		fileTable.getColumnModel().getColumn(4)
				.setCellEditor(new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));// ���ñ༭��
		fileTable.getColumnModel().getColumn(4).setCellRenderer(
				new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));

		jtp1.addTab("�����˺�", jp2);
		// jtp1.addTab("�ҵĵ�¼�˺�", jp3);
		jtp1.setVisible(false);

		JTabbedPane jtp4 = new JTabbedPane(JTabbedPane.LEFT);
		jsp.setRightComponent(jtp4);
		JPanel jp8 = new JPanel();// ����ע�����
		jp8.setVisible(false);
		JButton loginIN = new JButton("ע��");
		loginIN.setBounds(104, 132, 99, 23);
		JTextField inputAccount = new JTextField();
		inputAccount.setBounds(104, 60, 99, 26);
		inputAccount.setToolTipText("�ڴ�������Ҫע����˺�");
		JTextField inputPassword = new JTextField();
		inputPassword.setBounds(104, 96, 99, 26);
		inputPassword.setToolTipText("�ڴ�������Ҫע�������");
		jp8.setLayout(null);
		jp8.add(loginIN);
		jp8.add(inputAccount);
		jp8.add(inputPassword);

		// ���õ�¼����
		JPanel jp7 = new JPanel();
		jp7.setLayout(null);

		jtp4.addTab("��¼", jp7);
		jtp4.addTab("ע��", jp8);

		JPanel updatePass = new JPanel();
		updatePass.setLayout(null);
		jtp4.addTab("�޸�����", updatePass);
		jtp4.remove(updatePass);

		// ������ʾ�˺� ��ǩ
		JLabel labAccount = new JLabel("2323", JLabel.CENTER);
		labAccount.setSize(10, 2);
		labAccount.setBounds(104, 24, 99, 26);
		updatePass.add(labAccount);

		// ���������������
		JTextField oldPass = new JTextField();
		oldPass.setToolTipText("�ڴ����������");
		oldPass.setColumns(10);
		oldPass.setBounds(104, 60, 99, 26);
		updatePass.add(oldPass);

		// ���������������
		JTextField newPass = new JTextField();
		newPass.setToolTipText("�ڴ�����������");
		newPass.setColumns(10);
		newPass.setBounds(104, 96, 99, 26);
		updatePass.add(newPass);

		// ����ȷ���޸����밴ť
		JButton checkPass = new JButton("ȷ���޸�");
		checkPass.setBounds(104, 132, 99, 23);
		updatePass.add(checkPass);

		// �����˺������ı���
		JTextField account = new JTextField();
		account.setBounds(104, 60, 99, 26);
		account.setToolTipText("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u8D26\u53F7");
		jp7.add(account);
		account.setColumns(10);

		// �������������ı���
		JTextField password = new JTextField();
		password.setBounds(104, 96, 99, 26);
		password.setToolTipText("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		password.setColumns(10);
		jp7.add(password);

		// ��ӵ�¼��ť
		JButton sign = new JButton("��¼");
		sign.setBounds(104, 132, 99, 23);
		jp7.add(sign);

		// ���ע��ҳ��ע�ᰴť����
		loginIN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// jp8.setVisible(false);
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM account WHERE myaccount = ?";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setObject(1, inputAccount.getText());
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						JOptionPane.showMessageDialog(jp8, "���˺��Ѿ�ע�ᣬ�뻻��ע��");
						return;
					}

					if (inputPassword.getText().length() > 3) {
						String sql2 = "INSERT INTO account (myaccount,mypassword)VALUES(?,?)";
						PreparedStatement stat = con.prepareStatement(sql2);
						stat.setString(1, inputAccount.getText());
						stat.setString(2, inputPassword.getText());
						stat.executeUpdate();

						userName = inputAccount.getText();
						userNameFile = "userfile" + userName;
						userNameData = "userdata" + userName;
						userNameFileData = "userfiledata" + userName;
						// ע���Ժ���н���
						String createFileTable = "CREATE TABLE " + userNameFile + " (\r\n"
								+ "  fileID INT PRIMARY KEY AUTO_INCREMENT, \r\n" + "  fileTitles MEDIUMTEXT,\r\n"
								+ "  uploadDate VARCHAR(50),\r\n" + "  fileSize VARCHAR(30)\r\n" + ")";

						String createDataTable = "CREATE TABLE " + userNameData + "(\r\n"
								+ "dataID INT PRIMARY KEY AUTO_INCREMENT, \r\n" + "dataTitles MEDIUMTEXT,\r\n"
								+ "dataDetail LONGTEXT,\r\n" + "uploadDate VARCHAR(50)\r\n" + ");";

						String createFileDataTable = "CREATE TABLE " + userNameFileData + "  (\r\n"
								+ "  fileID INT PRIMARY KEY AUTO_INCREMENT, \r\n" + "  fileTitles MEDIUMTEXT,\r\n"
								+ "  fileData LONGBLOB\r\n" + ");";

						PreparedStatement pst2 = con.prepareStatement(createFileTable);
						pst2.executeUpdate();

						PreparedStatement pst3 = con.prepareStatement(createDataTable);
						pst3.executeUpdate();

						PreparedStatement pst4 = con.prepareStatement(createFileDataTable);
						pst4.executeUpdate();

						pst2.close();
						pst3.close();
						pst4.close();

						rs.close();
						con.close();
						pst.close();
						stat.close();

					} else {
						JOptionPane.showMessageDialog(jp8, "���������ĳ��ȱ������4!");
						return;
					}

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					JOptionPane.showMessageDialog(jp8, "���ݿ�����ʧ�ܣ�����������ע��");
					e1.printStackTrace();
					return;
				}

				JOptionPane.showMessageDialog(jp8, "ע��ɹ�,���ص�¼");
				jtp4.removeTabAt(1);
				jtp4.addTab("ע��", jp8);
				return;

			}
		});

		// ����ע������
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jmb.setVisible(false);
				jtp4.setVisible(true);
				frame.setSize(400, 300);
				frame.setLocationRelativeTo(null);
				jtp1.setVisible(false);
			}
		});

		// �����޸�����˵���Ŀ����
		changePass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jmb.setVisible(false);
				labAccount.setText(account.getText());
				jtp4.setVisible(true);
				frame.setSize(400, 300);
				frame.setLocationRelativeTo(null);
				jtp4.removeAll();
				jtp4.addTab("�޸�����", updatePass);
				jtp1.setVisible(false);
			}
		});

		// ����ȷ���޸����밴ť����
		checkPass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "UPDATE account SET mypassword = '" + newPass.getText() + "' WHERE myaccount = '"
							+ mymyaccount + "'\r\n";

					// ��ѯ������
					String oldPassword = null;
					String sql2 = "SELECT mypassword FROM account WHERE myaccount = '" + account.getText() + "'\r\n";
					Statement stat2 = con.createStatement();
					ResultSet rs = stat2.executeQuery(sql2);
					while (rs.next()) {
						oldPassword = rs.getString("mypassword");

					}

					if ((oldPassword.equals(oldPass.getText())) && (newPass.getText().length() > 1)) {
						Statement stat = con.createStatement();
						stat.executeUpdate(sql);
						JOptionPane.showMessageDialog(updatePass,
								"�޸ĳɹ����޸ĺ������Ϊ��" + newPass.getText() + "\n" + "�����޸ģ��˺���ע���������µ�¼");

						jtp4.removeAll();
						jtp4.addTab("��¼", jp7);
						jtp4.addTab("ע��", jp8);

						stat.close();
						stat2.close();
						rs.close();
						con.close();

					} else {
						JOptionPane.showMessageDialog(updatePass, "���ľ��������벻��ȷ����������Ϊ��");
						return;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		// �����˵�����ϵͳ ����
		jmi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jtp1.setVisible(true);

			}
		});

		JPanel jpp1 = new JPanel();
		jpp1.setLayout(new BorderLayout());
		jp1.add(jpp1, BorderLayout.WEST);// ���Ӵ���ҳ��

		JToolBar jtool = new JToolBar();
		JButton checkSerch = new JButton("����");
		checkSerch.setBounds(40, 132, 99, 23);
		jp1.add(jtool, BorderLayout.NORTH);
		checkSerch.setVisible(true);

		JButton f5Code = new JButton("ˢ��");

		JTextField serch = new JTextField();// �������ֿ�
		serch.setColumns(10);
		serch.setVisible(true);
		jtool.add(serch);
		jtool.add(checkSerch);
		jtool.add(f5Code);

		JButton addCode = new JButton("�������ĵ�");
		addCode.setForeground(new Color(148, 0, 211));
		jtool.add(addCode);

		String[] title = { "���", "����", "ʱ��", "����" };
		// Object[][] detail = {};
		JTable table = new JTable();

		table.setFont(new Font("��������", Font.PLAIN, 15));
		table.setRowHeight(30);// �����и�
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, renderer);// ���ñ�����־���

		// TableCellRenderer tcr = new DefaultTableCellRenderer();
		DefaultTableModel dtm = new DefaultTableModel(

				new Object[][] {

						{ "��ˢ��", "��ˢ��", "��ˢ��", "��ˢ��" }, },

				new String[] { "���", "����", "ʱ��", "����" }) {

			boolean[] columnEditables = new boolean[] { false, false, false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		table.setModel(dtm);

		// dtm.setDataVector(detail, title);//����table����

		// tcr.getTableCellRendererComponent(table, new Object(), true, true, 4,
		// AUTO_RESIZE_ALL_COLUMNS);
		// table.getColumnModel().getColumn(3).setCellRenderer(tcr);

		JScrollPane jpp = new JScrollPane(table);
		jp1.add(jpp, BorderLayout.CENTER);// ���ҳ��

		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(108);
		// jpp.add(table,BorderLayout.CENTER);
		// jpp.add(table.getTableHeader(),BorderLayout.NORTH);

		// JPanel lookCodePane = new JPanel(new BorderLayout());
		// jpp.add(lookCodePane,BorderLayout.SOUTH);//�����鿴�����ҳ�� ��JTable����
		// //����JTextArea �洢�鿴���´���
		// JTextArea lookCodeText = new JTextArea();
		// lookCodeText.setSize(600, 400);;
		// //����JScrollPane �洢 JTextArea �����������ı���
		// JScrollPane textPane = new JScrollPane(lookCodeText);
		// //�������� ��ӵ��鿴�����ҳ�� ����
		// lookCodePane.add(textPane,BorderLayout.CENTER);
		// //�����ò鿴����ҳ�治�ɼ����鿴��ʱ���ٴ�
		// lookCodePane.setVisible(false);

		jpp.setVisible(true);// ���ҳ��
		jpp1.setVisible(false);// �������ױ��� ע��

		JTextField codeTitle = new JTextField();
		codeTitle.setColumns(10); // ���� ��������ҳ��� ����
		JLabel labelCodeTitle = new JLabel("����");
		JLabel addCodeLabel = new JLabel("����");
		JPanel jpp1TopPane = new JPanel(new BorderLayout());
		jpp1TopPane.add(addCodeLabel, BorderLayout.SOUTH);
		jpp1TopPane.add(labelCodeTitle, BorderLayout.NORTH);// ���ö��� ������������� ��ǩ����������ı���
		jpp1TopPane.add(codeTitle, BorderLayout.CENTER);
		jpp1.add(jpp1TopPane, BorderLayout.NORTH);

		JTextArea codeArea = new JTextArea();
		JScrollPane scrollText = new JScrollPane(codeArea);
		scrollText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		codeArea.setColumns(63);// ���� ��������ҳ��� �ı���
		scrollText.setAutoscrolls(true);
		jpp1.add(scrollText, BorderLayout.CENTER);

		JButton checkCode = new JButton("����");// ���õײ�������������� �����ȡ����ť��
		JButton cancelCheck = new JButton("ȡ��");
		JButton changeAndSave = new JButton("�޸Ĳ�����");
		JPanel jppDownPane = new JPanel(new FlowLayout());
		jppDownPane.add(checkCode);
		jppDownPane.add(changeAndSave);// �����޸Ĳ����水ť
		jppDownPane.add(cancelCheck);
		// �����޸Ĳ����水ť���ɼ�
		changeAndSave.setVisible(false);

		jpp1.add(jppDownPane, BorderLayout.SOUTH);

		addCode.addActionListener(new ActionListener() {

			@Override // ������Ӵ��밴ť�� ���� ת�����Ӵ���Ľ���
			public void actionPerformed(ActionEvent e) {
				jp1.add(jpp, BorderLayout.EAST); // jpp�Ǳ��ҳ��
				jp1.add(jpp1, BorderLayout.CENTER); // jpp1�����Ӵ���ҳ��
				jpp.setVisible(false);
				jpp1.setVisible(true);
				jtool.setVisible(false);
				checkCode.setVisible(true);
				changeAndSave.setVisible(false);

			}
		});

		cancelCheck.addActionListener(new ActionListener() {

			@Override // ���ȡ����ť�ļ���
			public void actionPerformed(ActionEvent e) {
				jp1.add(jpp, BorderLayout.CENTER); // jpp�Ǳ��ҳ��
				jp1.add(jpp1, BorderLayout.WEST); // jpp1�����Ӵ���ҳ��
				jpp.setVisible(true);
				jpp1.setVisible(false);
				jtool.setVisible(true);
				codeArea.setText("");
				codeTitle.setText("");
				f5Code.doClick();

			}
		});

		checkCode.addActionListener(new ActionListener() {

			@Override // ��� ����ҳ�� ���水ť�ļ���
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "INSERT INTO " + userNameData + " (dataTitles,dataDetail,uploadDate) VALUES (?,?,?)";
					PreparedStatement stat = con.prepareStatement(sql);

					Calendar c = Calendar.getInstance();
					int year = c.get(Calendar.YEAR);
					int month = c.get(Calendar.MONTH) + 1;
					int day = c.get(Calendar.DAY_OF_MONTH);
					int hour = c.get(Calendar.HOUR_OF_DAY);
					int minute = c.get(Calendar.MINUTE);
					int secend = c.get(Calendar.SECOND);
					String date = year + "��" + month + "��" + day + "��" + hour + ":" + minute + ":" + secend;
					// System.out.println(date);
					// Ҫɾ��

					if (!(codeTitle.getText().equals("") && codeArea.getText().equals(""))) {
						stat.setString(1, codeTitle.getText());
						stat.setString(2, codeArea.getText());
						stat.setString(3, date);
						stat.executeUpdate();
						JOptionPane.showMessageDialog(null, "����ɹ�");

						jp1.add(jpp, BorderLayout.CENTER); // jpp�Ǳ��ҳ��
						jp1.add(jpp1, BorderLayout.WEST); // jpp1�����Ӵ���ҳ��
						jpp.setVisible(true);
						jpp1.setVisible(false);
						jtool.setVisible(true);
						codeArea.setText("");
						codeTitle.setText("");

						con.close();
						stat.close();

						f5Code.doClick();// ʵ�ֵ����ť
					} else {
						JOptionPane.showMessageDialog(jpp1TopPane, "������ı�����ߴ�������Ϊ�գ�");
						return;
					}

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});

		// �������ˢ�°�ť����
		f5Code.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				int x = 0;
				int y = 0;

				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					PreparedStatement pst2 = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					ResultSet rs2 = pst2.executeQuery();
					int tableColumn = table.getColumnCount() - 1;
					int tableRow = 0;
					while (rs.next()) {
						tableRow++;
						// System.out.println(tableRow);
					}
					Object[][] newCode = new Object[tableRow][tableColumn];
					// tableRow -- ;
					while (rs2.next()) {
						// System.out.println(rs2.getString("myid") + rs2.getString("mytitles") +
						// rs2.getString("mydate"));

						newCode[y][x] = rs2.getString("dataID");
						newCode[y][x + 1] = rs2.getString("dataTitles");
						newCode[y][x + 2] = rs2.getString("uploadDate");
						// ����Ӧ�õ��� ���� ���������ݲŻ���ʾ��ǰ��
						y++;

					}
					// JPanel jp = new JPanel();
					// JButton jb = new JButton("ȷ��");
					// jp.add(jb);
					// newCode[0][2] = ;
					Object[][] midObj = new Object[5][15];
					if (!(newCode.length == 0)) {
						for (int m = 0; m < tableRow; m++) {
							// System.out.println(m + "...");

							midObj[0][0] = newCode[m][0];
							midObj[0][1] = newCode[m][1];
							midObj[0][2] = newCode[m][2];

							newCode[m][0] = newCode[tableRow - 1 - m][0];
							newCode[m][1] = newCode[tableRow - 1 - m][1];
							newCode[m][2] = newCode[tableRow - 1 - m][2];

							newCode[tableRow - 1 - m][0] = midObj[0][0];
							newCode[tableRow - 1 - m][1] = midObj[0][1];
							newCode[tableRow - 1 - m][2] = midObj[0][2];

							if ((m + 1) == (newCode.length / 2)) {
								break;
							}

						}

						dtm.setDataVector(newCode, title);
						table.getColumnModel().getColumn(3)
								.setCellEditor(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool, addCodeLabel,
										labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));// ���ñ༭��
						table.getColumnModel().getColumn(3)
								.setCellRenderer(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool, addCodeLabel,
										labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));

						rs2.close();
						pst2.close();
						rs.close();
						con.close();
						pst.close();
					} else {
						JOptionPane.showMessageDialog(null, "����ǰ����Ϊ��,�����������~");
						return;
					}

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		// ��ӵ�¼��ť����
		sign.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mymyaccount = account.getText();
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					// System.out.println(DBpass.getText());��ӡ���ݿ�����
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM account WHERE myaccount = '" + account.getText()
							+ "' AND mypassword = '" + password.getText() + "'\r\n";
					Statement stat = con.createStatement();
					ResultSet rs = stat.executeQuery(sql);

					userName = account.getText();
					userNameFile = "userfile" + userName;
					userNameData = "userdata" + userName;
					userNameFileData = "userfiledata" + userName;

					while (rs.next()) {
						if ((rs.getString("myaccount").equals(account.getText()))
								&& (rs.getString("mypassword").equals(password.getText()))) {
							JOptionPane.showMessageDialog(jp7, "��¼�ɹ�");

							jtp4.setVisible(false);
							jmb.setVisible(true);
							jtp1.setVisible(true);
							frame.setSize(1280, 720);
							frame.setLocationRelativeTo(null);
							jm2.setText("��ǰ�˺ţ�" + account.getText());
							// checkSerch.doClick();
							return;
						} else {
							JOptionPane.showMessageDialog(jp7, "�˺Ż����������");
							return;
						}

					}

					// jmb.setVisible(true);
					// jtp4.setVisible(false);

					con.close();
					stat.close();
					rs.close();
					JOptionPane.showMessageDialog(jp7, "�˺Ż����������");
					return;
				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
					JOptionPane.showMessageDialog(jp7, "�˺Ż����������");
					return;
				}

			}
		});

		// ��Ӵ���ҳ ������ť����
		checkSerch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData + " WHERE dataTitles LIKE " + " \"%" + serch.getText()
							+ "%\"";
					Statement stat = con.createStatement();
					Statement stat2 = con.createStatement();
					ResultSet rs = stat.executeQuery(sql);
					ResultSet rs2 = stat2.executeQuery(sql);
					// System.out.println(sql);
					// �������ҳ������������������������������ܵĶ�ά���鳤��
					int lineNum = 0;
					int lineNumForCount = 0;
					int rowNum = 3;// 0 - 2 == 3 �±�

					while (rs.next()) {
						// System.out.println(rs.getString("myid") + rs.getString("mytitles")
						// +rs.getString("mydate") );
						// + rs.getString("mycodes")
						lineNum++;
					}
					Object[][] serchObj = new Object[lineNum][rowNum];
					// ѭ��������������װ����ά�������档
					while (rs2.next()) {
						serchObj[lineNumForCount][0] = rs2.getString("dataID");
						serchObj[lineNumForCount][1] = rs2.getString("dataTitles");
						serchObj[lineNumForCount][2] = rs2.getString("uploadDate");

						lineNumForCount++;

					}

					for (int m = 0; m < lineNum; m++) {
						// System.out.println(m + "...");
						Object[][] midObj = new Object[1][3];
						midObj[0][0] = serchObj[m][0];
						midObj[0][1] = serchObj[m][1];
						midObj[0][2] = serchObj[m][2];

						serchObj[m][0] = serchObj[lineNum - 1 - m][0];
						serchObj[m][1] = serchObj[lineNum - 1 - m][1];
						serchObj[m][2] = serchObj[lineNum - 1 - m][2];

						serchObj[lineNum - 1 - m][0] = midObj[0][0];
						serchObj[lineNum - 1 - m][1] = midObj[0][1];
						serchObj[lineNum - 1 - m][2] = midObj[0][2];

						if ((m + 1) == (serchObj.length / 2)) {
							break;
						}

					}

					dtm.setDataVector(serchObj, title);
					table.getColumnModel().getColumn(3).setCellEditor(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool,
							addCodeLabel, labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));// ���ñ༭��
					table.getColumnModel().getColumn(3)
							.setCellRenderer(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool, addCodeLabel,
									labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));

					stat.close();
					stat2.close();
					rs2.close();
					rs.close();
					con.close();

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		// ���� �޸� ��ť����
		changeAndSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					// String sql = "UPDATE mycode SET mycodes = ? WHERE myid = ?";
					// PreparedStatement pst = con.prepareStatement(sql);
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					int newRowCount = 1;
					String changeID = null;
					while (rs.next()) {
						// ��Ϊ���鵹�����Ե�ǰ�������������ݿ��������ȥJTable���������
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("dataID"));
							changeID = rs.getString("dataID");// ���Ҫ�޸ĵ���һ�е�dataID
							break;
						}
						newRowCount++;
					}

					String sql1 = "UPDATE " + userNameData + " SET dataDetail = ? WHERE dataID = " + changeID;
					String sql2 = "UPDATE " + userNameData + " SET dataTitles = ? WHERE dataID = " + changeID;
					PreparedStatement pst1 = con.prepareStatement(sql1);
					PreparedStatement pst2 = con.prepareStatement(sql2);
					pst1.setString(1, codeArea.getText());
					pst2.setString(1, codeTitle.getText());
					pst1.executeUpdate();
					pst2.executeUpdate();
					// System.out.println(pst1.executeUpdate());
					JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
					// cancelCheck.doClick();

					pst.close();
					pst1.close();
					pst2.close();
					con.close();
					rs.close();
					cancelCheck.doClick();

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		// ���������ļ���ť�ļ���
		fileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(fileData.length);
				try {
					con();
					int fileTableRow = 0;

					// int fileTableIndex = fileTable.getSelectedRow();
					// System.out.println(fileTableIndex);
					// Object serchFileIndex = fileData[fileTableIndex][1];
					Object serchFileIndex = fileSerch.getText();
					String sql = "SELECT * FROM " + userNameFile + " WHERE fileTitles LIKE \"%" + serchFileIndex
							+ "%\" ORDER BY fileID DESC;";
					PreparedStatement pst = con().prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						fileTableRow++;
					}
					Object[][] serchFile = new Object[fileTableRow][4];

					int serchedFileRow = 0;
					PreparedStatement pst2 = con().prepareStatement(sql);
					ResultSet rs2 = pst2.executeQuery();
					while (rs2.next()) {
						serchFile[serchedFileRow][0] = rs2.getString("fileID");
						serchFile[serchedFileRow][1] = rs2.getString("fileTitles");
						serchFile[serchedFileRow][2] = rs2.getString("fileSize");
						serchFile[serchedFileRow][3] = rs2.getString("uploadDate");
						serchedFileRow++;
					}

					pst.close();
					pst2.close();
					rs.close();
					rs2.close();

					dtm2.setDataVector(serchFile, fileTitles);
					fileTable.getColumnModel().getColumn(4).setCellEditor(
							new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));// ���ñ༭��
					fileTable.getColumnModel().getColumn(4).setCellRenderer(
							new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));

				} catch (Exception e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		// �����ļ����ϴ���ť ����

		addFileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				JFileChooser fd = new JFileChooser();
				fd.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				fd.showOpenDialog(null);
				File f = fd.getSelectedFile();
				long size = f.length();
				String fileSize = getFileSize(size);

				if (f != null) {
					// System.out.println(f.getPath());
					// uploadFiles(f);
					try {
						con();
						// String sql = "";
						File file = new File(f.getPath());
						FileInputStream fileInput = new FileInputStream(file);
						String sql = "INSERT INTO " + userNameFile + " (fileTitles,uploadDate,fileSize) VALUES (?,?,?)";
						PreparedStatement pst = con().prepareStatement(sql);
						pst.setString(1, f.getName());
						// pst.setAsciiStream(2, fileInput, (int)file.length());
						// ���ļ����� �����ļ�

						pst.setString(2, getDate());
						pst.setString(3, fileSize);
						pst.executeUpdate();

						String sql2 = "INSERT INTO " + userNameFileData + " (fileTitles,fileData) VALUES (?,?)";
						PreparedStatement pst2 = con().prepareStatement(sql2);
						pst2.setString(1, f.getName());
						pst2.setAsciiStream(2, fileInput, (int) file.length());
						pst2.executeUpdate();

						JOptionPane.showMessageDialog(null, "�ϴ��ɹ�");
						con().close();
						pst.close();
						pst2.close();
						flashFile.doClick();

					} catch (Exception e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}

				}

			}
		});

		// �����ļ�ˢ�� �ļ���
		flashFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String sql1 = "SELECT * FROM " + userNameFile + " ORDER BY fileID DESC";
				// userNameFile
				PreparedStatement pst1;
				PreparedStatement pst2;

				int fileTableRow = 4;
				int fileTableColumn = 0;

				try {
					pst2 = con().prepareStatement(sql1);
					ResultSet rs2 = pst2.executeQuery();
					while (rs2.next()) {
						fileTableColumn++;
					}
					rs2.close();
					pst2.close();
				} catch (SQLException e2) {
					// TODO �Զ����ɵ� catch ��
					e2.printStackTrace();
				} catch (Exception e2) {
					// TODO �Զ����ɵ� catch ��
					e2.printStackTrace();
				}

				fileData = new Object[fileTableColumn][fileTableRow];

				try {
					pst1 = con().prepareStatement(sql1);
					// pst3 = con().prepareStatement(sql1);
					// ResultSet rs3 = pst3.executeQuery();
					// if(rs3.next()) {
					//
					//
					// }
					ResultSet rs1 = pst1.executeQuery();

					int fileIndex = 0;

					while (rs1.next()) {
						fileData[fileIndex][0] = rs1.getString("fileID");
						fileData[fileIndex][1] = rs1.getString("fileTitles");
						fileData[fileIndex][2] = rs1.getString("fileSize");
						fileData[fileIndex][3] = rs1.getString("uploadDate");
						// System.out.println(fileData[fileIndex][3]);
						fileIndex++;

					}
					if (fileData.length == 0) {
						JOptionPane.showMessageDialog(null, "����ǰ����Ϊ��,�����������~");
						// return;
					} else {
						pst1.close();

						rs1.close();

						con().close();
						// System.out.println(fileData.length);
						dtm2.setDataVector(fileData, fileTitles);
						fileTable.getColumnModel().getColumn(4).setCellEditor(new MyFileRender(userNameFile, fileTable,
								con(), userNameFileData, fileData, flashFile));// ���ñ༭��
						fileTable.getColumnModel().getColumn(4).setCellRenderer(new MyFileRender(userNameFile,
								fileTable, con(), userNameFileData, fileData, flashFile));
					}

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

	}

	// ����ļ��Ĵ�С
	public static String getFileSize(long size) {
		// ����ֽ�������1024����ֱ����BΪ��λ�������ȳ���1024����3λ��̫��������
		if (size < 1024) {
			return String.valueOf(size) + "B";
		} else {
			size = size / 1024;
		}
		// ���ԭ�ֽ�������1024֮������1024�������ֱ����KB��Ϊ��λ
		// ��Ϊ��û�е���Ҫʹ����һ����λ��ʱ��
		// ����ȥ�Դ�����
		if (size < 1024) {
			return String.valueOf(size) + "KB";
		} else {
			size = size / 1024;
		}
		if (size < 1024) {
			// ��Ϊ�����MBΪ��λ�Ļ���Ҫ�������1λС����
			// ��ˣ��Ѵ�������100֮����ȡ��
			size = size * 100;
			return String.valueOf((size / 100)) + "." + String.valueOf((size % 100)) + "MB";
		} else {
			// �������Ҫ��GBΪ��λ�ģ��ȳ���1024����ͬ���Ĵ���
			size = size * 100 / 1024;
			return String.valueOf((size / 100)) + "." + String.valueOf((size % 100)) + "GB";
		}
	}

	// ��ȡʱ��
	public static String getDate() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int secend = c.get(Calendar.SECOND);
		return year + "��" + month + "��" + day + "��" + hour + ":" + minute + ":" + secend;
	}

	// �������ݿ�
	public static Connection con() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
		Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
		return con;
	}

}

class MyFileRender extends AbstractCellEditor implements TableCellRenderer, ActionListener, TableCellEditor {

	private static final long serialVersionUID = 2L;
	private JButton downloadFile = null;
	private JPanel jp = null;
	public static String url = null;
	static JFileChooser fc; 

	// public static Connection con() throws Exception {
	// Class.forName("com.mysql.jdbc.Driver");
	// String url =
	// "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
	// Connection con = DriverManager.getConnection(url,"root1","Zhang970716");
	// return con;
	// }

	public MyFileRender(String userNameFile, JTable fileTable, Connection c, String userNameFileData,
			Object[][] fileData, JButton flashFile) {
		downloadFile = new JButton("����");
		downloadFile.setSize(50, 2);
		downloadFile.setForeground(new Color(148, 0, 211));
		downloadFile.setFont(new Font("��������", Font.PLAIN, 13));

		JButton deleteFile = new JButton("ɾ��");
		deleteFile.setSize(50, 2);
		deleteFile.setForeground(new Color(148, 0, 211));
		deleteFile.setFont(new Font("��������", Font.PLAIN, 13));

		// �����ļ����صİ�ť����
		downloadFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(url == null) {
					fc= new JFileChooser(new File("C:\\"));
				}else {
					fc= new JFileChooser(new File(url));
				}
				
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fc.setDialogTitle("ѡ��Ҫ���浽���ļ���");
				fc.setMultiSelectionEnabled(false);
				fc.showSaveDialog(fc);
				if (!(fc.getSelectedFile() == null)) {

					System.out.println("path===" + fc.getSelectedFile().getPath());
					String fileSavePath = fc.getSelectedFile().getPath();
				} else {
					JOptionPane.showMessageDialog(null, "ѡ���ļ��е�·��Ϊ�գ�������ѡ��~");
					return;
				}

				int fileTableIndex = fileTable.getSelectedRow();
				Object downloadFileIndex = fileData[fileTableIndex][1];
				System.out.println(downloadFileIndex);
				byte[] b = new byte[1024 * 200];
				String sql = "SELECT * FROM " + userNameFileData + " WHERE fileTitles = '" + downloadFileIndex + "'";
				System.out.println(sql);
				String fileUrl = fc.getSelectedFile().getPath() + "\\" + downloadFileIndex;// �ļ�����·��
				System.out.println(fileUrl);
				
				try {
					PreparedStatement pst = c.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						String s = rs.getString("fileTitles");
						File fileOut = new File(fileUrl);
						if (!fileOut.exists()) {
							fileOut.createNewFile();
						}
						
						FileOutputStream fileOutput = new FileOutputStream(fileOut);
						InputStream is = rs.getBinaryStream("fileData");
						int size = 0;
						while ((size = is.read(b)) != -1) {
							System.out.println(size);
							fileOutput.write(b, 0, size);
							// fileOutput.close();
						}
						fileOutput.close();
					}

					
					JOptionPane.showMessageDialog(null, "�ļ�������ɣ�");
					url = fileUrl;
//					c.close();
//					pst.close();
//					rs.close();

				} catch (SQLException | IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		// ɾ���ļ���ť�ļ���
		deleteFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				// JOptionPane.showMessageDialog(null, "ȷ��ɾ����");
				int fileTableIndex = fileTable.getSelectedRow();
				Object deleteFileIndex = fileData[fileTableIndex][1];
				// System.out.println(deleteFileIndex);

				int i = JOptionPane.showConfirmDialog(null, "ȷ��ɾ��" + deleteFileIndex + "��", "ɾ��",
						JOptionPane.YES_NO_OPTION);

				if (i == 1) {
					return;
				}

				fileTable.getRowCount();
				fileTable.getSelectedRow();// ѡ��ĵ�ǰ������
				// ��ǰ������ȥ1 ���������У����ݵ��±�

				try {
					String sql = "DELETE FROM " + userNameFileData + " WHERE fileTitles = '" + deleteFileIndex + "'";
					PreparedStatement pst = c.prepareStatement(sql);// ɾ���洢�ļ��ı�
					pst.executeUpdate();

					String sql2 = "DELETE FROM " + userNameFile + " WHERE fileTitles = '" + deleteFileIndex + "'";
					PreparedStatement pst2 = c.prepareStatement(sql2);
					pst2.executeUpdate();

					c.close();
					pst.close();
					pst2.close();
					JOptionPane.showMessageDialog(null, deleteFileIndex + "ɾ���ɹ�");
					flashFile.doClick();
				} catch (Exception e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		jp = new JPanel();
		jp.setLayout(new GridLayout());

		jp.add(downloadFile);
		jp.add(deleteFile);
	}

	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		return jp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		return jp;
	}

}

class MyRender extends AbstractCellEditor implements TableCellRenderer, ActionListener, TableCellEditor {

	private static final long serialVersionUID = 1L;
	private JButton lookCode = null;
	private JPanel jp = null;

	public MyRender(JTable table, JButton f5Code, JScrollPane jpp, JPanel jp1, JPanel jpp1, JToolBar jtool,
			JLabel addCodeLabel, JLabel labelCodeTitle, JButton changeAndSave, JButton checkCode, JTextArea codeArea,
			JTextField codeTitle, String userNameData) {
		lookCode = new JButton("�鿴  / �޸�");
		lookCode.setSize(50, 2);
		lookCode.setForeground(new Color(148, 0, 211));
		lookCode.setFont(new Font("����", Font.PLAIN, 13));

		JButton deleteCode = new JButton("ɾ��");
		deleteCode.setSize(50, 2);
		deleteCode.setForeground(new Color(148, 0, 211));
		deleteCode.setFont(new Font("����", Font.PLAIN, 13));

		// lookCode.addActionListener(this);
		// �鿴 �޸Ĵ��� ��ť ����
		lookCode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				// JOptionPane.showMessageDialog(null, "�ύ�ɹ�");
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					int newRowCount = 1;
					String lookID = null;
					while (rs.next()) {
						// ��Ϊ���鵹�����Ե�ǰ�������������ݿ��������ȥJTable���������
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("myid"));
							lookID = rs.getString("dataID");// ���Ҫ�鿴����һ�е�myid
							break;
						}
						newRowCount++;
					}

					// System.out.println(userNameData);
					String sql2 = "SELECT * FROM  " + userNameData + " WHERE dataID = " + lookID;
					String newCodes = null;
					String newTitles = null;
					PreparedStatement pst2 = con.prepareStatement(sql2);
					ResultSet rs2 = pst2.executeQuery();
					while (rs2.next()) {
						newCodes = rs.getString("dataDetail");
						newTitles = rs.getString("dataTitles");
					}

					// System.out.println(newCodes);
					jp1.add(jpp, BorderLayout.EAST); // jpp�Ǳ��ҳ��
					jp1.add(jpp1, BorderLayout.CENTER); // jpp1�����Ӵ���ҳ��
					jpp.setVisible(false);
					jpp1.setVisible(true);
					jtool.setVisible(false);
					changeAndSave.setVisible(true);
					checkCode.setVisible(false);
					codeArea.setText(newCodes);
					codeTitle.setText(newTitles);

					con.close();
					pst.close();
					pst2.close();
					rs.close();
					rs2.close();

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}

			}
		});

		deleteCode.addActionListener(new ActionListener() {
			// ɾ�� ��ť����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������

				// JOptionPane.showMessageDialog(null, "ȷ��ɾ����");
				int i = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����", "ɾ��", JOptionPane.YES_NO_OPTION);

				if (i == 1) {
					return;
				}
				// System.out.println(table.getRowCount());//����������ݿ������
				// System.out.println(table.getSelectedRow());//��õ�ǰѡ��JTable������
				// System.out.println(table.getSelectedColumn());//��õ�ǰѡ��JTable������
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					int newRowCount = 1;
					String deleteID = null;
					while (rs.next()) {
						// ��Ϊ���鵹�����Ե�ǰ�������������ݿ��������ȥJTable���������
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("myid"));
							deleteID = rs.getString("dataID");// ���Ҫɾ������һ�е�myid
							break;
						}
						newRowCount++;
					}
					String sql2 = "DELETE FROM " + userNameData + " WHERE dataID = " + deleteID;
					// System.out.println(sql2);
					PreparedStatement pst2 = con.prepareStatement(sql2);
					pst2.executeUpdate();
					f5Code.doClick();// ˢ��

					con.close();
					pst.close();
					pst2.close();
					rs.close();

				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		jp = new JPanel();
		jp.setLayout(new GridLayout());

		jp.add(lookCode);
		jp.add(deleteCode);
	}

	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		return jp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		return jp;
	}

}
