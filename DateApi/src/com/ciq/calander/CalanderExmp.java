package com.ciq.calander;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderExmp {
	public static void main(String[] args) {
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	      Calendar cal = Calendar.getInstance();
	      System.out.println(dateFormat.format(cal.getTime())); 
	}

}
