package com.lec.java.j23_07_AnonymousClass;

public class Person {

	// 외부 클래스 멤버변수
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public MyReadable createInstance(final int age){
		class PersonWithAge implements MyReadable {

			@Override
			public void readInfo() {
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
		}

		MyReadable person = new PersonWithAge();
		return person;
	}

} // class Person

interface MyReadable {
	void readInfo();
}









