package com.J05.Timestamp;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * java.sql.Timestamp;
 *  1970.01.01 00:00:00  GMT 기준 의 경과 시간을 ms (정수)로 계산해 담은 객체
 */

/**
 * 시간, 날짜 객체 다룰때
 *
 *         java.time.*
 *        ↙↗      ↘↖
 *   Timestamp  ↔  String
 *
 *   위 데이터간 변환 작업은 빈번히 발생한다.
 *   관련 변환 메소드들을 잘 활용하세요
 */

public class DateTime05Main {

	public static void main(String[] args) {
		System.out.println("java.sql.Timestamp");

		Timestamp timeStamp;  // java.sql.Timestamp
		String str;
		Date date;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		LocalDateTime datetime;

		Object[] arr = {
				"[Timestamp(0)]",
				// TODO

				"\n[Timestamp(현재ms)]",
				// TODO

				//----------------------------------------------
				// 문자열 -> Timestamp
				// 	방법1 : 정해진 형식 + Timestamp.valueOf()
				"\n[String -> Timestamp]",
				// TODO

				// 	방법2 : String -> Date -> Timestamp
				// TODO

				//----------------------------------------------
				// Timestamp -> 문자열
				// SimpleDateFormat + Timestamp:getTime()
				"\n[Timestamp -> String]",
				// TODO


				"\n[Timestamp <-> java.time.*]",
				// Timestamp -> LocalDateTime
				// TODO

				// LocalDateTime -> Timestamp
				// tODO
		};
		for(var obj : arr) System.out.println(obj);

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class














