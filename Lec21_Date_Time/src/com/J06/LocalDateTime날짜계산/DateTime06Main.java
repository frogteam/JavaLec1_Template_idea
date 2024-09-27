package com.J06.LocalDateTime날짜계산;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ■ 날짜 연산 : plusXXX(), minusXXX()
 * 	plusDays(long)
 * 	plusMonths(long)
 * 	plusWeeks(long)
 * 	plusYears(long)
 * 	...
 *
 *  ■ 경과 시간 계산
 * 		java.time.Duration  (경과 시간 객체)
 * 		java.time.Period (경과 일자 객체)
 * 		java.time.temporal.ChronoUnit (특정시간단위로 계산)
 *
 * 	■ 날짜 및 시간 조절
 * 		with(TemporalAdjusters) 날짜및 시간 조절
 *
 */

public class DateTime06Main {

	public static void main(String[] args) {

		LocalDate nowDate = LocalDate.now();
		LocalDateTime nowDateTime = LocalDateTime.now();

		LocalDate date1 = LocalDate.of(2024, 2, 28);
		LocalDate date2;
		LocalDateTime datetime1 = LocalDateTime.of(2024, 2, 28, 15, 27, 30);
		LocalDateTime datetime2;

		Duration duration;  // java.time.Duration  (경과 시간 객체)
		Period period;  // java.time.Period (경과 일자 객체)

		Object[] arr = {
				"\n[plusXXX(), minusXXX()]",
				// TODO
				// minusXXX() 도 사용방법 동일

				"\n[plus(), minus(), ChronoUnit]",
				// TODO  // 단위 지정 가능.
				// minus() 도 사용방법 동일

				"\n[경과시간 계산: Duration]",
				// Duration : 두 '시간' 사이의 간격
				// TODO

				"\n[경과날짜 계산: Period]",
				// Period : 두 '날짜' 사이의 간격
				// TODO

				"\n[특정시간단위로 계산: ChronoUnit]",
				// TODO

				"\n[with(TemporalAdjusters) 날짜및 시간 조절]",
				// TODO

		};
		for (var date : arr) System.out.println(date);

		//-----------------------------------
		System.out.println("-".repeat(15));
		LocalDate start = LocalDate.now();
		// 오늘 기준으로 다음달 마지막날
		LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main

} // end class


































