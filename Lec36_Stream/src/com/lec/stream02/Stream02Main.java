package com.lec.stream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream02Main {
	public static void main(String[] args) {
		
		
		int [] arr = {5, 2, 1, 4, 3};

		// Arrays.stream(int[]) => IntStream 생성
		// TODO

		// IntStream 의 메소드 sum(), count()
		int sum, min, max;
		long count;
		// TODO


		System.out.println();
		// Integer collection  에 대해서는 곧바로 sum()  사용 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// TODO


		System.out.println("\n프로그램 종료");
	} // end main()
} // end class












