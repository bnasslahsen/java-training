package com.bnpparibas.training.datetime.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateUtils {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Today is " + today);
		System.out.println("Day of month: " + today.getDayOfMonth());

		System.out.println(today.getMonth().maxLength());

		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Tomorrow is " + tomorrow);

		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Next decade  will be " + nextDecade);

		Period period = Period.between(tomorrow, nextDecade);
		System.out.printf("Between %s and %s" + " there are %d years, %d months" + " and %d days%n", nextDecade,
				tomorrow, period.getYears(), period.getMonths(), period.getDays());
	}

}