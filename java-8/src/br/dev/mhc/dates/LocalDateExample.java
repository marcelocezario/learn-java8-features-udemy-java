package br.dev.mhc.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);
		
		LocalDate localDate1 = LocalDate.of(2021, 11, 10);
		System.out.println("localDate1 : " + localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2021, 365);
		System.out.println("localDate2 : " + localDate2);
		
		/**
		 * Get valuer from localDate
		 */
		
		System.out.println("getMonth : " + localDate.getMonth());
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
		System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

		
		

	}

}
