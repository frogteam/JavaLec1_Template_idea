package com.lec.java.j41_03_constructor;

import java.util.Objects;


public class Record03Main {
    public static void main(String[] args) {
        System.out.println("Compact Constructor");

        /**
         * 레코드 의 생성자가
         *   단순히 private field 를 초기화 하는 것 이상을 수행하기 위해
         *   직접 생성자를 작성하여 제공해줄수 있습니다.
         *
         *   그러나! 일반 클래스 생성자와는 달리
         *   레코드 생성자는 일반적인 매개변수 리스트가 없습니다.
         *   이를 Compact Constructor 라 함
         *
         *   이 사용자 정의는 validation에 사용하기 위한 것이며 가능한 한 간단하게 유지해야 합니다
         */
        {
            // Person 레코드에 제공된 이름과 주소가 null 인지 아닌지 확인(validation) 할수 있다
            record Person(String name, String address) {
                // TODO
            }
            // TODO

        }

        // 다른 argument 목록을 제공하여 다른 argument를 가진 새로운 생성자를 생성할 수도 있습니다
        {
            record Person(String name, String address) {
                // TODO
            }

            // TODO
        }

        // 클래스 생성자와 마찬가지로 필드를 참조할 수 있습니다.
        // 생성된 public 생성자와 동일한 argument를 사용하여 생성자를 생성하는 것도 유효하지만
        //  각 필드를 수동으로 초기화해야 합니다.
        {
            record Person(String name, String address) {
                // TODO
            }
        }

        // Compact Constructor 와 생성된 생성자와 일치하는 인수 목록을 가진 생성자를 선언하면 컴파일 오류가 발생.
        {
            record Person(String name, int age){
                // TODO
            }
        }

        //----------------------------------------------------
        // static 필드 포함 가능
        {
            record Person(String name, String address) {
                // TODO
            }

            Person p1 = new Person("John", "서울");
            // TODO
        }


        System.out.println("\n프로그램 종료");
    } // end main
} // end class





