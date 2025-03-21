package com.lec.java.j15_02_상속extends;

/* 상속 (Inheritance)
 * 	■ 상위클래스를 상속받아서 하위클래스를 정의하는 방법
 *    class 하위클래스 extends 상위클래스
 *
 *  ■ 자바 에선 오로지 '하나의 부모'로부터 상속받을수 있습니다 (단일 상속)  다중 상속 허용하지 않음
 *
 *  ■ 용어
 *  Super Class(상위 클래스), Parent Class(부모/조상 클래스), Base Class(기반 클래스)
 *  Sub Class(하위 클래스), Child Class(자식 클래스), Derived Class(유도 클래스)
 *  	※ 상속받는다..(동사) inherit , subclass
 *
 *  ■ sub class에서는 super class가 가지고 있는 멤버 변수들은  선언하지 않아도 사용할 수 있다.
 *  super class에 없는 멤버 변수만 선언해 주면 됨
 *
 *  ■ 상속의 이점 :
 *   상속을 통하여 기존의 객체를 그대로 '재활용'하면서, 새로운 객체에서
 *   '추가', '변경'되는 부분만 작성함으로 소프트웨어 개발 효율을 높일수 있다. (코드의 재활용, 생산성UP!)
 *
 *  ■ static 은 상속되는 대상이 아니다.
 *    -> 인스턴스 여부와 관계없이 처음부터 메모리에 로딩되어 있는 존재이니까.
 */
public class Inherit02Main {

	public static void main(String[] args) {
		System.out.println("상속 (Inheritance)");

		// BasicTV 클래스의 인스턴스 생성
		BasicTV tv1 = new BasicTV();
		tv1.displayInfo();
		
		System.out.println();

		// SmartTV 클래스의 인스턴스 생성
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class










