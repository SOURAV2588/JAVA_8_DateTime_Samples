package com.sourav.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * One thing everyone should notice
 * is that these methods does not
 * considers the actual days in a
 * month (like 28 in feb or a special
 * case of 29 of leap year)
 * 
 * @author GHOSH
 *
 */
public class TestJavaPeriod {

	public static void main(String[] args) {
		Period daily = Period.ofDays(1);
		Period weekly = Period.ofWeeks(1);
		Period monthly = Period.ofMonths(1);
		Period yearly = Period.ofYears(1);
		
		LocalDate today = LocalDate.of(2020, Month.FEBRUARY, 28);
		//should output 29th feb 2020
		System.out.println(today.plus(daily));
		//should output 6th March 2020
		System.out.println(today.plus(weekly));
		//this one does not takes leap year into account
		//should output 27th March 2020
		//but outputs 28th March 2020
		System.out.println(today.plus(monthly));
		//this one does not takes leap year into account
		//should output 27th Feb 2021
		//but outputs 28th Feb 2021
		System.out.println(today.plus(yearly));
		
		//This throws error
		//Proving period is only valid with days
		//LocalTime thisMoment = LocalTime.now();
		//System.out.println(thisMoment.plus(Period.ofDays(1)));
		
		Period conceivingTime = Period.of(0, 10, 10);
		LocalDate whenYouHadSex = LocalDate.now();
		System.out.println("You are gonna get a suprise");
		System.out.println("ON");
		System.out.println(whenYouHadSex.plus(conceivingTime));
	}

}
