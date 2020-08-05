package cn.itcast.caseDemo01;

import java.util.Calendar;
import java.util.Scanner;

public class Day {
	public void day() {
		Calendar c = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		c.set(s.nextInt(), s.nextInt(), s.nextInt());
		System.out.println((now.getTimeInMillis() - c.getTimeInMillis()) / (1000*60*60*24));
	}

}
