package br.dev.mhc.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime :" + localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2021, 11, 11, 21, 23, 33, 978);
		System.out.println("localDateTime1 : " + localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime2 : " + localDateTime2);

		/**
		 * Getting the time and date from LocalDateTime instance
		 */
		System.out.println("getHour : " + localDateTime.getHour());
		System.out.println("getMinute : " + localDateTime.getMinute());
		System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
		System.out.println("DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

		/**
		 * Modifying LocalDate Time
		 */
		System.out.println("plusHours : " + localDateTime.plusHours(2));
		System.out.println("minusDays : " + localDateTime.minusDays(2));
		System.out.println("withMonth : " + localDateTime.withMonth(2));
		
		System.out.println("plusDays : " + localDateTime.plusDays(2));
		System.out.println("with : " + localDateTime.with(ChronoField.MONTH_OF_YEAR, 3));
		System.out.println("firstDayOfNextMonth : " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));

		/**
		 * Converting LocalDate,LocalTime to LocalDateTime and vice versa
		 */

		LocalDate localDate = LocalDate.of(2021,01, 01);
		System.out.println("atTime : " + localDate.atTime(23, 30));

		LocalTime localTime = LocalTime.of(23, 39);
		System.out.println("atDate : " + localTime.atDate(localDate));
		
		LocalDateTime localDateTime3 = localTime.atDate(localDate);
		System.out.println("toLocalDate : " + localDateTime3.toLocalDate());
		System.out.println("toLocalTime : " + localDateTime3.toLocalTime());
	}

}
