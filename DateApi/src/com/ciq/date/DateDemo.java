package com.ciq.date;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	public static void main(String[] args) {
		//local-Date Formate
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		  LocalDate localDate = LocalDate.now();
		  System.out.println(dtf.format(localDate));
		  
		  //Local-time Formate
		  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		  LocalTime localTime = LocalTime.now();
		  System.out.println(dtf1.format(localTime)); 
		  //Date and Time Formate
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yyyy/mm/dd,HH:MM:SS");
		LocalDateTime now= LocalDateTime.now();
		System.out.println(dtf2.format(now));
		//convert string to date
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	        String dateInString = "7-Jun-2013";

	        try {

	            Object date =formatter.parseObject(dateInString);
	            System.out.println(date);
	            System.out.println(formatter.format(date));

	        } catch (java.text.ParseException e) {
	            e.printStackTrace();
	        }
	}

}
