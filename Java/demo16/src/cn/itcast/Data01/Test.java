package cn.itcast.Data01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Object{

	public static void main(String[] args) throws ParseException {
		
		DateFormat df= new SimpleDateFormat("yyyy��MM��dd��");
		Date d = new Date(1607616000000L);
		d.getTime();
		String str_time = df.format(d);
		System.out.println(str_time + d.getTime());
		
		String s = "2019��09��23��";
		DateFormat d1 = new SimpleDateFormat("yyyy��MM��dd��");
		Date d3 = d1.parse(s);
		System.out.println(d3);
		
	}
}
