package cn.itcast.Calendar01;

import java.util.Calendar;

public class Test extends Object {
	public static void main(String[] args) {
		
		   Calendar c = Calendar.getInstance(); 
		  System.out.println(c.get(Calendar.YEAR)); 
		  System.out.println(c.get(Calendar.MONTH)+1); 
		  System.out.println(c.get(Calendar.DATE)); 
		  System.out.println(c.get(Calendar.DAY_OF_YEAR)); 
		  Calendar my = Calendar.getInstance(); 
		  my.set(1997, 07, 16);  
		  int i = 2000 ;  
		  my.set(Calendar.YEAR, i); 
		  System.out.println(my.get(Calendar.DAY_OF_YEAR)); 
		 		
	}
}
