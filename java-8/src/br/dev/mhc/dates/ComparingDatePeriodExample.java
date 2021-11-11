package br.dev.mhc.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatePeriodExample {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2020, 01, 01);
		LocalDate localDate1 = LocalDate.of(2021, 12, 31);
		
		/**
		 * 
		 */
		
		Period period = localDate.until(localDate1);
		System.out.println("getDays : " + period.getDays()); //result is 30 -> performs 31-1
		System.out.println("getMonths : " + period.getMonths()); // 12-01
		System.out.println("getYears : " + period.getYears()); // 2021-2020
		
		Period period1 = Period.ofDays(10);
		System.out.println("period1.getDays : " + period1.getDays());

		Period period2 = Period.ofYears(10);
		System.out.println("period2.getYears : " + period2.getYears());
		System.out.println("toTotalMonths : " + period2.toTotalMonths());
		
		Period period3 = Period.between(localDate, localDate1);
		System.out.println("Period : " + period3.getDays() + " : " + period3.getMonths() + " : " + period3.getYears());
		
		//Period.between(LocalTime.now(), LocalTime.now().plusHours(24));
	}

}
