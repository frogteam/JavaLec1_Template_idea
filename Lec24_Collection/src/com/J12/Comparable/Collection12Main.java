package com.J12.Comparable;

import java.text.ParseException;

/* java.util.Collections 클래스
	 Collections 클래스는 여러 유용한 알고리즘을 구현한 메소드들을 제공
	 대부분 클래스메소드 (static) 형태로 제공됨
	 
	 정렬(sort)
	 섞기(shuffle)
	 탐색(search)
 */

/**
 *  ■ Comparable<T> (I)    ※ 발음 : [kɑ́ːmpərəbl]  '캄퍼러블
 * 	 객체의 우선순위 비교(크기 비교) 를 위해 구현하는 인터페이스
 * 	  Comparable<> 이 구현된 객체만이 대소 비교를 위한 동작에서 사용할수 있다
 * 	  	  ex) TreeMap, TreeSet, Collections.sort() ...
 *
 * 	   String, Date, Calendar, java.time.*, Wrapper객체는 기본적으로 구현되어 있다.
 *
 *    @Override
 *    int compareTo(T o) 메소드
 * 	     매개변수 객체 o 를 자신객체(this)와 비교하여
 * 	     우선순위가 낮으면 음수, 같으면 0, 높으면 양수를 반환하도록 한다.
 *
 * 	■ Comparator<T> (I)  ※ 발음 : [kəmpǽrətər] 컴패'러터
 * 	  일부 메소드에선 Comparator 를 사용할수 있도록 제공된다. ex) Collections.sort()
 * 	  Comparable<> 이 구현되어 있지 않거나, 혹은 구현되어 있더라도
 * 	  Comparable<> 과는 '다른규칙의 대소비교' 를 할수 있도록 할수 있다.
 *
 * 	  @Override
 *    int compare(T o1, T o2) 메소드
 * 	    o1 이 o2 보다 우선순위 낮으면 음수 리턴
 * 	    o1 이 o2 보다 우선순위 높으면 양수 리턴
 * 	    o1 과 o2 가 같으면 0 리턴
 *
 */
public class Collection12Main {

	public static void main(String[] args) throws ParseException {
		System.out.println("Collections 메소드");

		// TODO
		
		
		System.out.println("sort()");
		// sort()
		// 기본적으로 속도가 비교적 빠르고 안전성이 보장되는 Merge Sort 사용
		
		// TODO		
		
		// String 타입이면 알파벳 순으로 정렬된다.
		// Date 타입이면 날짜순으로 정렬된다
		// ★ String 과 Date 는 기본적으로 Comparable<T> 인터페이스가 구현되었기 때문.
		// ※ String 온라인 도움말 확인해보자
	
		System.out.println();
		// TODO
		
		System.out.println("\n💎Comparable 구현, sort() 적용");
		// TODO
		
		// 역순 정렬
		System.out.println("reverseOrder() 적용");
		// TODO
		
		// 뒤집기
		System.out.println("reverse() 적용");
		// TODO
		
		
		// Comparator<> 적용
		// Collections.sort 메소드는 두 번째 인자로 Comparator 인터페이스를 받을 수 있도록 해놓았습니다.
		// Comparator 인터페이스의 compare 메소드를 오버라이드 하면 됩니다.
		System.out.println("\n🎃Comparator<> 적용");
		// TODO
		
		// Collections 에서 많이 쓰이는 인터페이스임
		// Comparable<> 은 클래스 자체에 구현하는 인터페이스  compareTo(자기자신 vs 매개변수)
		// Comparator<> 는 두개의 객체 비교하는 기능제공 인터페이스  compare(매개변수1 vs 매개변수2)
		//      구현된 객체가 매개변수 등에 넘겨지는 형태로 많이 쓰임
		
		// Shuffling 하기 (섞기)
		System.out.println();
		System.out.println("shuffle()");
		// TODO
		
		// min(), max()
		// Comparable 메소드 영향 받음
		System.out.println();
		System.out.println("min(), max()");
		// TODO
		
		// copy(dest, src)
		System.out.println();
		// TODO
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class

// 우선은 Comparable 구현 없이 해보자
class Student {
	String name;
	double point;
	
	public Student(String name, double point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.point + "점";
	}

	// TODO

} // end class


class Asc{

	// TODO
	
} // end Asc


class Desc{

	// TODO
	
} // end Desc

