package practice.capitalize;

import java.util.Scanner;

/* LetterCapitalize
 * 	주어진 문자열에서, 공백으로 구분된 각 단어의 앞 문자만 대문자로 만들기
 *
 * 	[입력예]
 * 		hello my WORLD
 *  [출력예]
 * 		Hello My World
 */

public class LetterCapitalize {

	public static final String[] input = {
			"i am a PROGRAMMER",     // -> I Am A Programmer
			"THAT ELEPHANT IS BIG",  // -> That Elephant Is Big
	};

	public static void main(String[] args) {

		for(var x : input){
			System.out.println(letterCapitalize(x));
		}

	} // end main()

	public static String letterCapitalize(String str){
		String result = "";

		// TODO

		return result;
	}  // end letterCapitalize()

} // end class

