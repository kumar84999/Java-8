package com.ciq.Dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class java8DateExmpls1 {

	public static void main(String[] args) {
		System.out.println(".........Duration seconds..........");
		Duration OneHours=Duration.ofHours(1);
		System.out.println(OneHours.getSeconds()+"seconds");
		
		
		Duration OneHours2=Duration.of(1, ChronoUnit.HOURS);
		System.out.println(OneHours2.getSeconds()+"seconds");
		
		 System.out.println("\n--- Duration.between --- ");

	        LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
	        LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        //count seconds between dates
	        Duration duration = Duration.between(oldDate, newDate);

	        System.out.println(duration.getSeconds() + " seconds");
	        
	        //period b/w dates
	        System.out.println("--- Examples --- ");

	        Period tenDays = Period.ofDays(10); 
	        System.out.println(tenDays.getDays()); //10

	        Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
	        System.out.println(oneYearTwoMonthsThreeDays.getYears());   //1
	        System.out.println(oneYearTwoMonthsThreeDays.getMonths());  //2
	        System.out.println(oneYearTwoMonthsThreeDays.getDays());    //3

	        System.out.println("\n--- Period.between --- ");
	        LocalDate oldDate1 = LocalDate.of(1982, Month.AUGUST, 31);
	        LocalDate newDate2 = LocalDate.of(2016, Month.NOVEMBER, 9);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        // check period between dates
	        Period period = Period.between(oldDate1, newDate2);

	        System.out.print(period.getYears() + " years,");
	        System.out.print(period.getMonths() + " months,");
	        System.out.print(period.getDays() + " days");
	       
	        
	        
	        //ChronoUnitExampls
	        LocalDateTime oldDate3 = LocalDateTime.of(1982, Month.AUGUST, 31, 10, 20, 55);
	        LocalDateTime newDate3 = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

	        System.out.println(oldDate3);
	        System.out.println(newDate3);
	        long years=ChronoUnit.YEARS.between(oldDate3, newDate3);
	        long months=ChronoUnit.MONTHS.between(oldDate3, newDate3);
	        long weeks= ChronoUnit.WEEKS.between(oldDate3, newDate3);
	        long days= ChronoUnit.DAYS.between(oldDate3, newDate3);
	        long hours =ChronoUnit.HOURS.between(oldDate3, newDate3);
	        long minutes=ChronoUnit .MINUTES.between(oldDate3, newDate3);
	        long seconds=ChronoUnit.SECONDS.between(oldDate3, newDate3);
	        long millis=ChronoUnit.MILLIS.between(oldDate3, newDate3);
	        long nanos=ChronoUnit.NANOS.between(oldDate3, newDate3);
	        System.out.println("\n---Total----");
	        System.out.println(years +"years");
	        System.out.println(months +"months");
	        System.out.println(weeks +"weeks");
	        System.out.println(days +"days");
	        System.out.println(hours +"hours");
	        System.out.println(minutes +"minutes");
	        System.out.println(seconds +"seconds");
	        System.out.println(millis +"millis");
	        System.out.println(nanos +"nanos");
	        
	        //How to convert String to LocalDate
	        String Date="2022-07-25";
	        LocalDate localDate=LocalDate.parse(Date);
	        System.out.println(localDate);
	        
	        
	        // 16-Aug-2016 + Locale.US
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

	        String date = "16-Aug-2016";

	        LocalDate localDate1 = LocalDate.parse(date, formatter);

	        System.out.println(localDate1);  //default, print ISO_LOCAL_DATE

	        System.out.println(formatter.format(localDate1)); // print formatter date
            // LocalDateTime + DateTimeFormatter
	        LocalDateTime now = LocalDateTime.now();

	        System.out.println("Before : " + now);

	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        String formatDateTime = now.format(formatter1);

	        System.out.println("After : " + formatDateTime);

	}

}
