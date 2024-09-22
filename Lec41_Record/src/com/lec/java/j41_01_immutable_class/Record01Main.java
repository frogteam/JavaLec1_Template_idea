package com.lec.java.j41_01_immutable_class;

// 선행
//  상속, override, equals(), toString(), hashCode()
//  Set<>
//  생성자 delegate


import java.util.Objects;

/**
 *  Record 클래스가 왜 필요한가?
 *
 *    Record 클래스는 Java14에 추가된 기능 (Java14 에서 preview, Java16에서 정식 채택)
 *
 *    Record 가 등장하기 전에는
 *    객체간에 immutable 한 데이터를 전달시 boilerplate field와 메서드가 포함된 클래스를 생성해야 했다.
 *    => 이는, 사소한 실수가 발생하거나, 의도가 혼동되기 쉬웠습니다
 *
 */

public class Record01Main {

    // immutable 객체 예시  (Record 사용하지 않고..)
    // 아래와 같이 Person 이라는 immutable 객체를 만들어 봅시다
    //   - 모든 필드는 private final
    //   - 생성자는 매개변수를 받아 초기화 하는 생성자만 허용
    //   - getter 제공
    //   - equals, hashCode 제공
    public class Person {

        // TODO

    } // end Person



    public static void main(String[] args) {
        System.out.println("immutable class");


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class




























