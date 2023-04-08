package com.ciq.date;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ZonedTimeAndDate {

	public static void main(String[] args) {
		DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy/mm/dd HH:MM:SS");
		System.out.println(ZoneOffset.systemDefault());
		System.out.println(OffsetDateTime.now().getOffset());

	}

}
