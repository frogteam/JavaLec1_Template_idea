package com.lec.java.j11_11_Arrays클래스;

import java.util.Arrays;

/**
 * java.util.Arrays 클래스
 * 배열을 다루는 유용한 메소드들 제공
 *  Arrays.toString() : 문자열 형태로 리턴
 *  Arrays.copyOf(원본배열, 복사할 length)
 *  Arrays.copyOfRange(원본배열, from, to))
 *  Arrays.fill()  : 배열에 특정 값으로 채우기
 *  Arrys.sort(원본배열) :  오름차순 변경
 *  Arrays.asList() : array -> List 로
 */

public class Array11Main {

	public static void main(String[] args) {
		System.out.println("java.util.Arrays 클래스");
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2;

		// 💚 Arrays.toString() : 문자열 형태로 리턴
		System.out.println("Arrays.toString()");
//		TODO


		// 💚 Arrays.copyOf(원본배열, 복사할 length)
		// 배열을 복사하여 새로운 배열생성하여 리턴
//		System.out.println("\nArrays.copyOf()");
//		 TODO
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr1));

		// 💚 Arrays.copyOfRange(원본배열, from, to))
		// from 부터 to 직전까지 복사
//		System.out.println("\nArrays.copyOfRange()");
//		 TODO
//		System.out.println(Arrays.toString(arr2));
//		 TODO
//		System.out.println(Arrays.toString(arr2));


		// 💚 Arrays.fill(배열, val))
//		System.out.println("\nArrays.fill()");
//		 TODO
//		System.out.println(Arrays.toString(arr2));


		// 💚 Arrays.sort(원본배열)
		// 오름차순 변경.  원본 배열을 변경시킨다
		// 내림차순은 지원하지 않는다.
//		System.out.println("\nArrays.sort()");
//		arr2 = new int[]{8, 9, 3, 5, 1, 2};
//		System.out.println(Arrays.toString(arr2));
//		 TODO
//		System.out.println(Arrays.toString(arr2));


		// 💚 Arrays.equals(배열1, 배열2)
		// 배열원소를 순서대로 하나하나 비교한 결과  true/false
//		System.out.println("\nArrays.equals()");
//		int[] arr8 = {10, 20, 30};
//		int[] arr9 = {10, 20, 30};
//		int[] arr10 = {10, 30, 20};
//		TODO


	} // end main

} // end class
