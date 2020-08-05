package caseDemo02;

import java.util.Calendar;
import java.util.Scanner;

public class limitNum {

	public static void main(String[] args) {
		String s = inputNum();
		int i = getWeek();
		String lastNum = getLastNum(s);
		chooseFunction(s,i);
		
		
	}
	//选择
	public static void chooseFunction(String s,int i) {
		switch(i) {
		case 1:
			if(getLastNum(s).equals("1") || getLastNum(s).equals("6") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
			
		case 2:
			if(getLastNum(s).equals("2") || getLastNum(s).equals("7") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
		case 3:
			if(getLastNum(s).equals("3") || getLastNum(s).equals("8") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
			
		case 4:
			if(getLastNum(s).equals("4") || getLastNum(s).equals("9") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
		case 5:
			if(getLastNum(s).equals("5") || getLastNum(s).equals("0") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
		case 6:
			if(getLastNum(s).equals("1") || getLastNum(s).equals("6") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
		case 7:
			if(getLastNum(s).equals("1") || getLastNum(s).equals("6") ) {
				System.out.println("今天限行！");
			}else if(getLastNum(s).equals("888")){
				System.out.println("您输入的车牌格式不正确！"+":"+s);
			}else {
				System.out.println("今天不限行！");
			}
			break;
			
		default:
				break;
		
		}
	}
	
	
	//输入
	public static String inputNum() {
		Scanner s = new Scanner(System.in);
		return s.next();
	}
	
	//获取周几
	public static int getWeek() {
		Calendar c = Calendar.getInstance();
		if(c.DAY_OF_WEEK == 1) {
			return 7;
		}else {
			return c.DAY_OF_WEEK-1;
		}
		
	}
	
	//获取输入车牌的最后一个字符
	public static String getLastNum(String s) {
		String s1 = s;
		char[] c = s1.substring(s1.length()-1).toCharArray();
		int i = c[0];
		if(48 <= i && i <= 57) {
			return s.substring(s.length()-1);
		}else if(65 <= i && i <= 90) {
			return s.substring(s.length()-2, s.length()-1);
		}else {
			return "888" ;
		}	
		}
	}

