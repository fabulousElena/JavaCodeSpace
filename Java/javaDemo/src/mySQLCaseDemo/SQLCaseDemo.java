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
	static String userNameData;// 存储数据表格的名字
	static String userNameFile;// 存储文件详情的表格的名字
	static String userNameFileData;// 存储文件的表格名字
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

		JFrame frame = new JFrame("数据管理");
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("F:\\workDemo\\\u5FAE\u4FE1\u56FE\u7247_20191224134640.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// 创建菜单栏
		JMenuBar jmb = new JMenuBar();
		frame.setJMenuBar(jmb);
		JMenu jm1 = new JMenu("系统操作");
		jmb.add(jm1);
		JMenu jm2 = new JMenu("未登录");
		jmb.add(jm2);
		jmb.setVisible(false);

		// 创建菜单栏内的内容并添加
		JMenuItem jmi1 = new JMenuItem("备忘账号");
		JMenuItem jmi2 = new JMenuItem("退出系统");
		jm1.add(jmi1);
		jm1.add(jmi2);

		// 创建账号栏内的内容并添加
		JMenuItem changePass = new JMenuItem("修改密码");
		jm2.add(changePass);
		JMenuItem quit = new JMenuItem("注销账号");
		jm2.add(quit);

		// 创建退出系统监听
		jmi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		// 创建分隔栏界面
		JSplitPane jsp = new JSplitPane();
		jsp.setOneTouchExpandable(true);
		jsp.setContinuousLayout(true);
		frame.setContentPane(jsp);

		// 设置备忘录
		JTabbedPane jtp1 = new JTabbedPane(JTabbedPane.LEFT);
		jsp.setLeftComponent(jtp1);
		jsp.setDividerLocation(185);
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		JPanel jp2 = new JPanel();
		// JPanel jp3 = new JPanel();
		jtp1.addTab("我的文档", jp1);
		JPanel jpFile = new JPanel(new BorderLayout());
		jtp1.add("我的文件", jpFile);

		// 添加工具条 在我的文件页面 文件界面
		JToolBar fileBar = new JToolBar();
		jpFile.add(fileBar, BorderLayout.NORTH);
		JTextField fileSerch = new JTextField();// 搜索文件 文字框
		fileSerch.setColumns(10);
		JButton fileButton = new JButton("搜索");
		JButton addFileButton = new JButton("上传新文件");
		addFileButton.setForeground(SystemColor.textHighlight);
		JButton flashFile = new JButton("刷新");
		fileBar.add(fileSerch);
		fileBar.add(fileButton);
		fileBar.add(flashFile);
		fileBar.add(addFileButton);

		JTable fileTable = new JTable();// 创建 file文件的表格
		JScrollPane fileScrollPane = new JScrollPane(fileTable);
		jpFile.add(fileScrollPane, BorderLayout.CENTER);

		String[] fileTitles = { "序号", "文件名", "大小", "上传时间", "操作" };
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
		fileTable.setDefaultRenderer(Object.class, renderer2);// 设置表格文字居中
		fileTable.setModel(dtm2);
		fileTable.setFont(new Font("华文中宋", Font.PLAIN, 15));

		fileTable.getColumnModel().getColumn(4)
				.setCellEditor(new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));// 设置编辑器
		fileTable.getColumnModel().getColumn(4).setCellRenderer(
				new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));

		jtp1.addTab("管理账号", jp2);
		// jtp1.addTab("我的登录账号", jp3);
		jtp1.setVisible(false);

		JTabbedPane jtp4 = new JTabbedPane(JTabbedPane.LEFT);
		jsp.setRightComponent(jtp4);
		JPanel jp8 = new JPanel();// 创建注册界面
		jp8.setVisible(false);
		JButton loginIN = new JButton("注册");
		loginIN.setBounds(104, 132, 99, 23);
		JTextField inputAccount = new JTextField();
		inputAccount.setBounds(104, 60, 99, 26);
		inputAccount.setToolTipText("在此输入您要注册的账号");
		JTextField inputPassword = new JTextField();
		inputPassword.setBounds(104, 96, 99, 26);
		inputPassword.setToolTipText("在此输入您要注册的密码");
		jp8.setLayout(null);
		jp8.add(loginIN);
		jp8.add(inputAccount);
		jp8.add(inputPassword);

		// 设置登录界面
		JPanel jp7 = new JPanel();
		jp7.setLayout(null);

		jtp4.addTab("登录", jp7);
		jtp4.addTab("注册", jp8);

		JPanel updatePass = new JPanel();
		updatePass.setLayout(null);
		jtp4.addTab("修改密码", updatePass);
		jtp4.remove(updatePass);

		// 创建显示账号 标签
		JLabel labAccount = new JLabel("2323", JLabel.CENTER);
		labAccount.setSize(10, 2);
		labAccount.setBounds(104, 24, 99, 26);
		updatePass.add(labAccount);

		// 创建旧密码输入框
		JTextField oldPass = new JTextField();
		oldPass.setToolTipText("在此输入旧密码");
		oldPass.setColumns(10);
		oldPass.setBounds(104, 60, 99, 26);
		updatePass.add(oldPass);

		// 创建新密码输入框
		JTextField newPass = new JTextField();
		newPass.setToolTipText("在此输入新密码");
		newPass.setColumns(10);
		newPass.setBounds(104, 96, 99, 26);
		updatePass.add(newPass);

		// 创建确认修改密码按钮
		JButton checkPass = new JButton("确认修改");
		checkPass.setBounds(104, 132, 99, 23);
		updatePass.add(checkPass);

		// 创建账号输入文本框
		JTextField account = new JTextField();
		account.setBounds(104, 60, 99, 26);
		account.setToolTipText("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u8D26\u53F7");
		jp7.add(account);
		account.setColumns(10);

		// 创建密码输入文本框
		JTextField password = new JTextField();
		password.setBounds(104, 96, 99, 26);
		password.setToolTipText("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		password.setColumns(10);
		jp7.add(password);

		// 添加登录按钮
		JButton sign = new JButton("登录");
		sign.setBounds(104, 132, 99, 23);
		jp7.add(sign);

		// 添加注册页面注册按钮监听
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
						JOptionPane.showMessageDialog(jp8, "该账号已经注册，请换号注册");
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
						// 注册以后进行建表
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
						JOptionPane.showMessageDialog(jp8, "输入的密码的长度必须大于4!");
						return;
					}

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					JOptionPane.showMessageDialog(jp8, "数据库链接失败，请重启重新注册");
					e1.printStackTrace();
					return;
				}

				JOptionPane.showMessageDialog(jp8, "注册成功,返回登录");
				jtp4.removeTabAt(1);
				jtp4.addTab("注册", jp8);
				return;

			}
		});

		// 创建注销监听
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

		// 设置修改密码菜单项目监听
		changePass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jmb.setVisible(false);
				labAccount.setText(account.getText());
				jtp4.setVisible(true);
				frame.setSize(400, 300);
				frame.setLocationRelativeTo(null);
				jtp4.removeAll();
				jtp4.addTab("修改密码", updatePass);
				jtp1.setVisible(false);
			}
		});

		// 创建确认修改密码按钮监听
		checkPass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "UPDATE account SET mypassword = '" + newPass.getText() + "' WHERE myaccount = '"
							+ mymyaccount + "'\r\n";

					// 查询旧密码
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
								"修改成功，修改后的密码为：" + newPass.getText() + "\n" + "密码修改，账号已注销，请重新登录");

						jtp4.removeAll();
						jtp4.addTab("登录", jp7);
						jtp4.addTab("注册", jp8);

						stat.close();
						stat2.close();
						rs.close();
						con.close();

					} else {
						JOptionPane.showMessageDialog(updatePass, "您的旧密码输入不正确或者新密码为空");
						return;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		// 创建菜单进入系统 监听
		jmi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jtp1.setVisible(true);

			}
		});

		JPanel jpp1 = new JPanel();
		jpp1.setLayout(new BorderLayout());
		jp1.add(jpp1, BorderLayout.WEST);// 增加代码页面

		JToolBar jtool = new JToolBar();
		JButton checkSerch = new JButton("搜索");
		checkSerch.setBounds(40, 132, 99, 23);
		jp1.add(jtool, BorderLayout.NORTH);
		checkSerch.setVisible(true);

		JButton f5Code = new JButton("刷新");

		JTextField serch = new JTextField();// 搜索文字框
		serch.setColumns(10);
		serch.setVisible(true);
		jtool.add(serch);
		jtool.add(checkSerch);
		jtool.add(f5Code);

		JButton addCode = new JButton("增加新文档");
		addCode.setForeground(new Color(148, 0, 211));
		jtool.add(addCode);

		String[] title = { "序号", "标题", "时间", "操作" };
		// Object[][] detail = {};
		JTable table = new JTable();

		table.setFont(new Font("华文中宋", Font.PLAIN, 15));
		table.setRowHeight(30);// 设置行高
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, renderer);// 设置表格文字居中

		// TableCellRenderer tcr = new DefaultTableCellRenderer();
		DefaultTableModel dtm = new DefaultTableModel(

				new Object[][] {

						{ "请刷新", "请刷新", "请刷新", "请刷新" }, },

				new String[] { "序号", "标题", "时间", "操作" }) {

			boolean[] columnEditables = new boolean[] { false, false, false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		table.setModel(dtm);

		// dtm.setDataVector(detail, title);//更新table内容

		// tcr.getTableCellRendererComponent(table, new Object(), true, true, 4,
		// AUTO_RESIZE_ALL_COLUMNS);
		// table.getColumnModel().getColumn(3).setCellRenderer(tcr);

		JScrollPane jpp = new JScrollPane(table);
		jp1.add(jpp, BorderLayout.CENTER);// 表格页面

		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(108);
		// jpp.add(table,BorderLayout.CENTER);
		// jpp.add(table.getTableHeader(),BorderLayout.NORTH);

		// JPanel lookCodePane = new JPanel(new BorderLayout());
		// jpp.add(lookCodePane,BorderLayout.SOUTH);//创建查看代码的页面 在JTable下面
		// //创建JTextArea 存储查看的新代码
		// JTextArea lookCodeText = new JTextArea();
		// lookCodeText.setSize(600, 400);;
		// //创建JScrollPane 存储 JTextArea 带滚动条的文本框
		// JScrollPane textPane = new JScrollPane(lookCodeText);
		// //将滑动盘 添加到查看代码的页面 居中
		// lookCodePane.add(textPane,BorderLayout.CENTER);
		// //先设置查看代码页面不可见，查看的时候再打开
		// lookCodePane.setVisible(false);

		jpp.setVisible(true);// 表格页面
		jpp1.setVisible(false);// 这里容易报错 注意

		JTextField codeTitle = new JTextField();
		codeTitle.setColumns(10); // 创建 代码增加页面的 标题
		JLabel labelCodeTitle = new JLabel("标题");
		JLabel addCodeLabel = new JLabel("代码");
		JPanel jpp1TopPane = new JPanel(new BorderLayout());
		jpp1TopPane.add(addCodeLabel, BorderLayout.SOUTH);
		jpp1TopPane.add(labelCodeTitle, BorderLayout.NORTH);// 设置顶部 间接容器，放置 标签和输入标题文本框
		jpp1TopPane.add(codeTitle, BorderLayout.CENTER);
		jpp1.add(jpp1TopPane, BorderLayout.NORTH);

		JTextArea codeArea = new JTextArea();
		JScrollPane scrollText = new JScrollPane(codeArea);
		scrollText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		codeArea.setColumns(63);// 创建 代码增加页面的 文本框
		scrollText.setAutoscrolls(true);
		jpp1.add(scrollText, BorderLayout.CENTER);

		JButton checkCode = new JButton("保存");// 设置底部间接容器，放置 保存和取消按钮。
		JButton cancelCheck = new JButton("取消");
		JButton changeAndSave = new JButton("修改并保存");
		JPanel jppDownPane = new JPanel(new FlowLayout());
		jppDownPane.add(checkCode);
		jppDownPane.add(changeAndSave);// 创建修改并保存按钮
		jppDownPane.add(cancelCheck);
		// 设置修改并保存按钮不可见
		changeAndSave.setVisible(false);

		jpp1.add(jppDownPane, BorderLayout.SOUTH);

		addCode.addActionListener(new ActionListener() {

			@Override // 添加增加代码按钮的 监听 转到增加代码的界面
			public void actionPerformed(ActionEvent e) {
				jp1.add(jpp, BorderLayout.EAST); // jpp是表格页面
				jp1.add(jpp1, BorderLayout.CENTER); // jpp1是增加代码页面
				jpp.setVisible(false);
				jpp1.setVisible(true);
				jtool.setVisible(false);
				checkCode.setVisible(true);
				changeAndSave.setVisible(false);

			}
		});

		cancelCheck.addActionListener(new ActionListener() {

			@Override // 添加取消按钮的监听
			public void actionPerformed(ActionEvent e) {
				jp1.add(jpp, BorderLayout.CENTER); // jpp是表格页面
				jp1.add(jpp1, BorderLayout.WEST); // jpp1是增加代码页面
				jpp.setVisible(true);
				jpp1.setVisible(false);
				jtool.setVisible(true);
				codeArea.setText("");
				codeTitle.setText("");
				f5Code.doClick();

			}
		});

		checkCode.addActionListener(new ActionListener() {

			@Override // 添加 代码页面 保存按钮的监听
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
					String date = year + "年" + month + "月" + day + "日" + hour + ":" + minute + ":" + secend;
					// System.out.println(date);
					// 要删除

					if (!(codeTitle.getText().equals("") && codeArea.getText().equals(""))) {
						stat.setString(1, codeTitle.getText());
						stat.setString(2, codeArea.getText());
						stat.setString(3, date);
						stat.executeUpdate();
						JOptionPane.showMessageDialog(null, "保存成功");

						jp1.add(jpp, BorderLayout.CENTER); // jpp是表格页面
						jp1.add(jpp1, BorderLayout.WEST); // jpp1是增加代码页面
						jpp.setVisible(true);
						jpp1.setVisible(false);
						jtool.setVisible(true);
						codeArea.setText("");
						codeTitle.setText("");

						con.close();
						stat.close();

						f5Code.doClick();// 实现点击按钮
					} else {
						JOptionPane.showMessageDialog(jpp1TopPane, "您输入的标题或者代码内容为空！");
						return;
					}

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});

		// 代码界面刷新按钮监听
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
						// 这里应该倒序 插入 这样新数据才会显示在前面
						y++;

					}
					// JPanel jp = new JPanel();
					// JButton jb = new JButton("确认");
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
										labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));// 设置编辑器
						table.getColumnModel().getColumn(3)
								.setCellRenderer(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool, addCodeLabel,
										labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));

						rs2.close();
						pst2.close();
						rs.close();
						con.close();
						pst.close();
					} else {
						JOptionPane.showMessageDialog(null, "您当前数据为空,请先添加数据~");
						return;
					}

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		// 添加登录按钮监听
		sign.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mymyaccount = account.getText();
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					// System.out.println(DBpass.getText());打印数据库密码
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
							JOptionPane.showMessageDialog(jp7, "登录成功");

							jtp4.setVisible(false);
							jmb.setVisible(true);
							jtp1.setVisible(true);
							frame.setSize(1280, 720);
							frame.setLocationRelativeTo(null);
							jm2.setText("当前账号：" + account.getText());
							// checkSerch.doClick();
							return;
						} else {
							JOptionPane.showMessageDialog(jp7, "账号或者密码错误");
							return;
						}

					}

					// jmb.setVisible(true);
					// jtp4.setVisible(false);

					con.close();
					stat.close();
					rs.close();
					JOptionPane.showMessageDialog(jp7, "账号或者密码错误");
					return;
				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
					JOptionPane.showMessageDialog(jp7, "账号或者密码错误");
					return;
				}

			}
		});

		// 添加代码页 搜索按钮监听
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
					// 定义代码页面的行数和列数，用来设置搜索功能的二维数组长度
					int lineNum = 0;
					int lineNumForCount = 0;
					int rowNum = 3;// 0 - 2 == 3 下标

					while (rs.next()) {
						// System.out.println(rs.getString("myid") + rs.getString("mytitles")
						// +rs.getString("mydate") );
						// + rs.getString("mycodes")
						lineNum++;
					}
					Object[][] serchObj = new Object[lineNum][rowNum];
					// 循环遍历，把数据装到二维数组里面。
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
							addCodeLabel, labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));// 设置编辑器
					table.getColumnModel().getColumn(3)
							.setCellRenderer(new MyRender(table, f5Code, jpp, jp1, jpp1, jtool, addCodeLabel,
									labelCodeTitle, changeAndSave, checkCode, codeArea, codeTitle, userNameData));

					stat.close();
					stat2.close();
					rs2.close();
					rs.close();
					con.close();

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		// 保存 修改 按钮监听
		changeAndSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
						// 因为数组倒叙，所以当前行数是由总数据库的行数减去JTable的行数获得
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("dataID"));
							changeID = rs.getString("dataID");// 获得要修改的这一行的dataID
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
					JOptionPane.showMessageDialog(null, "修改成功！");
					// cancelCheck.doClick();

					pst.close();
					pst1.close();
					pst2.close();
					con.close();
					rs.close();
					cancelCheck.doClick();

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		// 设置搜索文件按钮的监听
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
							new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));// 设置编辑器
					fileTable.getColumnModel().getColumn(4).setCellRenderer(
							new MyFileRender(userNameFile, fileTable, con(), userNameFileData, fileData, flashFile));

				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		// 设置文件的上传按钮 监听

		addFileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
						// 在文件表中 插入文件

						pst.setString(2, getDate());
						pst.setString(3, fileSize);
						pst.executeUpdate();

						String sql2 = "INSERT INTO " + userNameFileData + " (fileTitles,fileData) VALUES (?,?)";
						PreparedStatement pst2 = con().prepareStatement(sql2);
						pst2.setString(1, f.getName());
						pst2.setAsciiStream(2, fileInput, (int) file.length());
						pst2.executeUpdate();

						JOptionPane.showMessageDialog(null, "上传成功");
						con().close();
						pst.close();
						pst2.close();
						flashFile.doClick();

					} catch (Exception e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}

				}

			}
		});

		// 设置文件刷新 的监听
		flashFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
					// TODO 自动生成的 catch 块
					e2.printStackTrace();
				} catch (Exception e2) {
					// TODO 自动生成的 catch 块
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
						JOptionPane.showMessageDialog(null, "您当前数据为空,请先添加数据~");
						// return;
					} else {
						pst1.close();

						rs1.close();

						con().close();
						// System.out.println(fileData.length);
						dtm2.setDataVector(fileData, fileTitles);
						fileTable.getColumnModel().getColumn(4).setCellEditor(new MyFileRender(userNameFile, fileTable,
								con(), userNameFileData, fileData, flashFile));// 设置编辑器
						fileTable.getColumnModel().getColumn(4).setCellRenderer(new MyFileRender(userNameFile,
								fileTable, con(), userNameFileData, fileData, flashFile));
					}

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

	}

	// 获得文件的大小
	public static String getFileSize(long size) {
		// 如果字节数少于1024，则直接以B为单位，否则先除于1024，后3位因太少无意义
		if (size < 1024) {
			return String.valueOf(size) + "B";
		} else {
			size = size / 1024;
		}
		// 如果原字节数除于1024之后，少于1024，则可以直接以KB作为单位
		// 因为还没有到达要使用另一个单位的时候
		// 接下去以此类推
		if (size < 1024) {
			return String.valueOf(size) + "KB";
		} else {
			size = size / 1024;
		}
		if (size < 1024) {
			// 因为如果以MB为单位的话，要保留最后1位小数，
			// 因此，把此数乘以100之后再取余
			size = size * 100;
			return String.valueOf((size / 100)) + "." + String.valueOf((size % 100)) + "MB";
		} else {
			// 否则如果要以GB为单位的，先除于1024再作同样的处理
			size = size * 100 / 1024;
			return String.valueOf((size / 100)) + "." + String.valueOf((size % 100)) + "GB";
		}
	}

	// 获取时间
	public static String getDate() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int secend = c.get(Calendar.SECOND);
		return year + "年" + month + "月" + day + "日" + hour + ":" + minute + ":" + secend;
	}

	// 链接数据库
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
		downloadFile = new JButton("下载");
		downloadFile.setSize(50, 2);
		downloadFile.setForeground(new Color(148, 0, 211));
		downloadFile.setFont(new Font("华文中宋", Font.PLAIN, 13));

		JButton deleteFile = new JButton("删除");
		deleteFile.setSize(50, 2);
		deleteFile.setForeground(new Color(148, 0, 211));
		deleteFile.setFont(new Font("华文中宋", Font.PLAIN, 13));

		// 设置文件下载的按钮监听
		downloadFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if(url == null) {
					fc= new JFileChooser(new File("C:\\"));
				}else {
					fc= new JFileChooser(new File(url));
				}
				
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fc.setDialogTitle("选择要保存到的文件夹");
				fc.setMultiSelectionEnabled(false);
				fc.showSaveDialog(fc);
				if (!(fc.getSelectedFile() == null)) {

					System.out.println("path===" + fc.getSelectedFile().getPath());
					String fileSavePath = fc.getSelectedFile().getPath();
				} else {
					JOptionPane.showMessageDialog(null, "选择文件夹的路径为空，请重新选择~");
					return;
				}

				int fileTableIndex = fileTable.getSelectedRow();
				Object downloadFileIndex = fileData[fileTableIndex][1];
				System.out.println(downloadFileIndex);
				byte[] b = new byte[1024 * 200];
				String sql = "SELECT * FROM " + userNameFileData + " WHERE fileTitles = '" + downloadFileIndex + "'";
				System.out.println(sql);
				String fileUrl = fc.getSelectedFile().getPath() + "\\" + downloadFileIndex;// 文件下载路径
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

					
					JOptionPane.showMessageDialog(null, "文件下载完成！");
					url = fileUrl;
//					c.close();
//					pst.close();
//					rs.close();

				} catch (SQLException | IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		// 删除文件按钮的监听
		deleteFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				// JOptionPane.showMessageDialog(null, "确定删除？");
				int fileTableIndex = fileTable.getSelectedRow();
				Object deleteFileIndex = fileData[fileTableIndex][1];
				// System.out.println(deleteFileIndex);

				int i = JOptionPane.showConfirmDialog(null, "确定删除" + deleteFileIndex + "？", "删除",
						JOptionPane.YES_NO_OPTION);

				if (i == 1) {
					return;
				}

				fileTable.getRowCount();
				fileTable.getSelectedRow();// 选择的当前的行数
				// 当前行数减去1 就是数组中，数据的下标

				try {
					String sql = "DELETE FROM " + userNameFileData + " WHERE fileTitles = '" + deleteFileIndex + "'";
					PreparedStatement pst = c.prepareStatement(sql);// 删除存储文件的表
					pst.executeUpdate();

					String sql2 = "DELETE FROM " + userNameFile + " WHERE fileTitles = '" + deleteFileIndex + "'";
					PreparedStatement pst2 = c.prepareStatement(sql2);
					pst2.executeUpdate();

					c.close();
					pst.close();
					pst2.close();
					JOptionPane.showMessageDialog(null, deleteFileIndex + "删除成功");
					flashFile.doClick();
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
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
		lookCode = new JButton("查看  / 修改");
		lookCode.setSize(50, 2);
		lookCode.setForeground(new Color(148, 0, 211));
		lookCode.setFont(new Font("黑体", Font.PLAIN, 13));

		JButton deleteCode = new JButton("删除");
		deleteCode.setSize(50, 2);
		deleteCode.setForeground(new Color(148, 0, 211));
		deleteCode.setFont(new Font("黑体", Font.PLAIN, 13));

		// lookCode.addActionListener(this);
		// 查看 修改代码 按钮 监听
		lookCode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				// JOptionPane.showMessageDialog(null, "提交成功");
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					int newRowCount = 1;
					String lookID = null;
					while (rs.next()) {
						// 因为数组倒叙，所以当前行数是由总数据库的行数减去JTable的行数获得
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("myid"));
							lookID = rs.getString("dataID");// 获得要查看的这一行的myid
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
					jp1.add(jpp, BorderLayout.EAST); // jpp是表格页面
					jp1.add(jpp1, BorderLayout.CENTER); // jpp1是增加代码页面
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});

		deleteCode.addActionListener(new ActionListener() {
			// 删除 按钮监听
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根

				// JOptionPane.showMessageDialog(null, "确定删除？");
				int i = JOptionPane.showConfirmDialog(null, "确定删除？", "删除", JOptionPane.YES_NO_OPTION);

				if (i == 1) {
					return;
				}
				// System.out.println(table.getRowCount());//获得整个数据库的行数
				// System.out.println(table.getSelectedRow());//获得当前选择JTable的行数
				// System.out.println(table.getSelectedColumn());//获得当前选择JTable的列数
				String url = "jdbc:mysql://rm-bp1yl9e2b6528hz3q9o.mysql.rds.aliyuncs.com:3306/myaccount";
				try {
					Connection con = DriverManager.getConnection(url, "root1", "Zhang970716");
					String sql = "SELECT * FROM " + userNameData;
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					int newRowCount = 1;
					String deleteID = null;
					while (rs.next()) {
						// 因为数组倒叙，所以当前行数是由总数据库的行数减去JTable的行数获得
						if (newRowCount == (table.getRowCount() - table.getSelectedRow())) {
							// System.out.println(rs.getString("myid"));
							deleteID = rs.getString("dataID");// 获得要删除的这一行的myid
							break;
						}
						newRowCount++;
					}
					String sql2 = "DELETE FROM " + userNameData + " WHERE dataID = " + deleteID;
					// System.out.println(sql2);
					PreparedStatement pst2 = con.prepareStatement(sql2);
					pst2.executeUpdate();
					f5Code.doClick();// 刷新

					con.close();
					pst.close();
					pst2.close();
					rs.close();

				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
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
