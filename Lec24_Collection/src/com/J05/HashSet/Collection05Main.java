package com.J05.HashSet;

/* Set, HashSet<E>

	Collection<E>
	 |__ Set<E>
	      |__ HashSet<E>, TreeSet<E>
	
	 Set:
	 1. 자료의 중복 저장이 허용되지 않는다. (hashCode() 값의 중복여부!)
	 2. 저장 순서가 유지되지 않는다.(인덱스 없다.)
	 (예) {1, 2, 3} = {1, 1, 2, 2, 3} : 중복 저장이 안되기 때문에 같은 Set
	 (예) {1, 2, 3} = {1, 3, 2}: 저장 순서가 중요하지 않기 때문에 같은 Set
	
	 HashSet: 매우 빠른 검색(조회) 속도를 제공

	 	(※ HashXXX ← '검색속도 향상'을 쓰는 자료구조 입니다)
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection05Main {

	public static void main(String[] args) {
		System.out.println("HashSet 클래스");
		
		// Integer 타입을 저장할 수 있는 HashSet 인스턴스 생성
		// TODO
		
		// 데이터 저장: add()
		// TODO
		
		// HashSet의 크기: size()
		// TODO
		
		// Set은 중복 저장을 허용하지 않는다.
		
		// 데이터 검색:
		// Set은 인덱스가 없기 때문에 get() 메소드를 제공하지 않습니다.
		// 데이터 검색을 위해서는 Iterator를 사용해야 함
		System.out.println();
		// TODO
		
		
		
		
		// 데이터 삭제
		// remove(element): Set에 있는 element를 찾아서 삭제
		//   element 있다면 삭제 후 true를 리턴
		//   element 없다면 false 리턴
		// TODO
		
		System.out.println();
		System.out.println("삭제 후:");
		// TODO
		
		// Set 자료형 데이터 변경을 할 수 있는 set() 메소드를 제공하지 않습니다.
		// 삭제(remove) 후 추가(add)하면 변경하는 효과
		// TODO : 500 -> 555 로 변경하고 싶다면?

		// enhanced-for 사용
		System.out.println();
		System.out.println("Enhanced for 사용 출력");
		// TODO
		
		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach() 사용 출력");
		// TODO

		// toString() 제공됨
		System.out.println();
		// TODO

		System.out.println("\n다양한 Set initializer");
		// 참고: https://www.baeldung.com/java-initialize-hashset
		//      https://stackoverflow.com/questions/2041778/how-to-initialize-hashset-values-by-construction
		{
			Set<String> set = new HashSet<>();

			// List, 배열로부터 생성
//			set = TODO
//			System.out.println(set);

			// Collections utility 클래스 하용
//			TODO
//			System.out.println(set);

			// Stream 사용 (Java8 이상)
//			set = TODO
//			System.out.println(set);

			// Factory method (Java9 이상)
//			set = TODO
//			System.out.println(set);

			// Double-brace initialization
			// 비추
//			set = TODO
//			System.out.println(set);

			// 그밖에도 guava 라는 3rd party 라이브러리도 활용할수 있다
			// https://guava.dev/releases/22.0/api/docs/com/google/common/collect/Sets.html#newHashSet--
			// Sets.newHashSet("a", "b", "c")
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












