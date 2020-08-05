package cn.itcast.Calendar02;

import java.util.Calendar;
import java.util.Scanner;

public class Day01 {
	public void day1() {
		Calendar now = Calendar.getInstance();
		Calendar born = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		born.set(sc.nextInt(), sc.nextInt(), sc.nextInt());
		long day = 0 ; 
		day  = (now.getTimeInMillis() - born.getTimeInMillis())/(1000*60*60*24);
		System.out.println(day);
	}

}
