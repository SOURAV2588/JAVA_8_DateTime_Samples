package com.sourav.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class TestJavaLocalDate {

	public static void main(String[] args) {
		//System.out.println(LocalDate.now());
		//System.out.println(LocalTime.now());
		//System.out.println(LocalDateTime.now());
		
		//year month day
		//System.out.println(LocalDate.of(2020,2,29));
		//same thing, but month is ENUM here
		//System.out.println(LocalDate.of(2020, Month.FEBRUARY, 29));
		
		LocalDate _29thOfFebruary = LocalDate.of(2020, Month.FEBRUARY, 29);
		/*System.out.println(_29thOfFebruary.plusDays(2));
		System.out.println(_29thOfFebruary.plusMonths(2));
		System.out.println(_29thOfFebruary.plusWeeks(4));*/
		
		LocalDate _28thFeb2021 = _29thOfFebruary.plusYears(1);
		LocalDate _28thFeb2020 = _29thOfFebruary.minusDays(1);
		System.out.println(_28thFeb2021);
		System.out.println("_28thFeb2020 : "+_28thFeb2020);
		System.out.println("_28thFeb2021 : "+_28thFeb2020.plusYears(1));
		
		//29.02.2020
		System.out.println(_28thFeb2021.minusYears(1));
		//28.01.2021
		System.out.println(_28thFeb2021.minusMonths(1));
		//14.02.2021
		System.out.println(_28thFeb2021.minusWeeks(2));
		//26.02.2021
		System.out.println(_28thFeb2021.minusDays(2));
		
		//This is invalid as hour minute and second all are greater than their possible values
		//System.out.println(LocalTime.of(25, 61, 61));
		
		System.out.println(LocalTime.of(13, 15, 45));
	}

}
