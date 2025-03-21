package com.lec.java.thread02;

/* Runnable 인터페이스로 쓰레드 구현
 자바는 다중 상속을 지원하지 않음
 -> 다른 클래스를 상속받고 있는 경우에는, 
 Thread 클래스를 상속받을 수 없는 문제가 발생
 -> 인터페이스를 구현해서 쓰레드를 생성할 수 있는 방법을 제공

 쓰레드 사용 방법 2:
 1. Runnable 인터페이스를 구현하는 클래스를 정의
 2. 정의한 클래스에서 run() 메소드를 override
 3. Runnable을 구현하는 클래스의 인스턴스를 생성
 4. 만들어진 인스턴스를 Thread 생성자의 매개변수로 주면서, Thread 인스턴스를 생성
 5. 생성된 Thread 인스턴스의 start() 메소드를 호출
*/

public class Thread02Main {

	public static void main(String[] args) {
		System.out.println("쓰레드 생성 2");
		
		// 3. Runnable을 구현하는 클래스의 인스턴스를 생성
		// TODO
		

		// 4. Runnable을 이용해서 Thread 인스턴스를 생성
		// TODO
		
		// 5. Thread 인스턴스의 start() 메소드를 호출
		// TODO
		
		
		
		// Anonymous class 로 생성
		//System.out.println();
		//System.out.println("Anonymous class 으로 Runnable 구현");
		// TODO
		
		// Runnable 인터페이스는 run() 가상메소드 하나만 가지고 있는 함수형인터페이스 이기 때문에
		// Lambda-expression 으로도  구현 가능.
		//System.out.println();
		//System.out.println("Lambda-expression 으로 Runnable 구현");
		// TODO

		System.out.println("-- main() 종료  -- ");
	} // end main()

} // end class


// 1. Runnable 인터페이스를 구현하는 클래스를 정의
class MyRunnable {
	// TODO
	
	// 2. 정의한 클래스에서 run() 메소드를 override - 쓰레드 할 일
	// TODO
	
} // end class MyRunnable





















