package com.synechrone.trainings.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateAndTimeDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentdate = LocalDate.now();
		System.out.println("current date " + currentdate);
		
		System.out.println(LocalDate.of(2014, Month.MARCH, 19));
		
		System.out.println("Local time " +  LocalTime.now());
		
		System.out.println("Date and Time : " + LocalDateTime.now());
		System.out.println("Date and Time : " + LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println("Date and Time : " + LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
	
		System.out.println("Month " +  LocalDate.now().getMonth());
	}
}
