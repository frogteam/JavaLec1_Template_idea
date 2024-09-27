package com.J04.타입파라미터제한;

/*
타입파라미터 제한
     와일드 카드 <?>
      upper-bounded <? extends Number>   Number 타입및 이의 하위 타입들
      lower-bounded <? super Number>    Number 타입및 이의 상위 타입들
      generic 사용 <? extends T>        T 타입및 이의 하위 타입들
*/
/*
   타입 계층 관계가 존재하는 타입 시스템에는
   Covariance(공변선)와 Contravariance(반공변성)라는 개념(+ Invariance, Bivariance)이 존재한다.
*/

public class Generic04Main {
    public static void main(String[] args) {
        System.out.println("\n타입 파라미터 제한");

        // TODO

        // -----------------------------
        // 제네릭은 공변성(covariance) 이 없다
        // 공변성?
        // TODO

        System.out.println("\n프로그램 종료");
    } // end main()

    // TODO

} // end class


class A {}
class B extends A{}
class C extends B{}
class D extends C{}

class Box<T>{
}
