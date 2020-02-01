package com.sourav.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestJavaDateTimeFormatter {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
		System.out.println(dateFormatter.format(LocalDate.now()));
		
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd YYYY : HH mm ss");
		System.out.println(LocalDateTime.now().format(customFormatter));
		
		//weird formatter -> this adds 30 to today's date
		//and also 60 to the seconds
		DateTimeFormatter weirdCustomFormatter = DateTimeFormatter.ofPattern("MMMM DD YYYY : hh mm SS");
		System.out.println(LocalDateTime.now().format(weirdCustomFormatter));
		//side note -> HH is the 24 hour format for hour
		// hh -> is the 12 hour format for hour
		
		//This case of converting from string to date is little bit strict
		//If the given format and the string input does not match
		//this throws exception
		DateTimeFormatter customDateFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate thisDate = LocalDate.parse("02 01 2020",customDateFormatter);
		System.out.println(thisDate);
	}

}
