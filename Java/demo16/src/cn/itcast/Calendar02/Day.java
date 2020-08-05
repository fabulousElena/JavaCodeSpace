package cn.itcast.Calendar02;

import java.util.Calendar;
import java.util.Scanner;

public class Day {
	public void day() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入出生年份：");
		int k = s.nextInt();
		Calendar my = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		System.out.println("请输入出生月份：");
		my.set(Calendar.MONTH, s.nextInt()-1);
		System.out.println("请输入出生日：");
		my.set(Calendar.DATE, s.nextInt());
		int j = 0 ;
		int m = 0 ;
		for(int i = k  ; i <my.get(Calendar.YEAR)-1;i ++ ) {
			if(!(i%4 == 0 && i % 100!= 0 || i % 400 == 0)) {
				m = 365;
			}else {
				m =366;
				}
			j = j + m ;
		}
		int dayNum = 0;
		if(!(k%4 == 0 && k % 100!= 0 || k % 400 == 0)) {
			dayNum = 365 - my.get(Calendar.DAY_OF_YEAR);
		}else {
			dayNum = 366 - my.get(Calendar.DAY_OF_YEAR);
			}
		System.out.println();
		System.out.println("您总共活了："+ (j + dayNum + now.get(Calendar.DAY_OF_YEAR)) + "天");
	}

}
