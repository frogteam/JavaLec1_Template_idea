package com.lec.java.mvc01;

import java.util.Scanner;

// View 기능(UI)을 담당할 클래스
public class MemberMain {

	private Scanner sc;
		
	public void showMenu() {
		System.out.println();
		System.out.println("회원관리 메뉴");
		System.out.println("------------------");
		System.out.println(" [0] 종료");
		System.out.println(" [1] 회원정보 입력");
		System.out.println(" [2] 회원정보 검색");
		System.out.println(" [3] 회원정보 수정");
		System.out.println("------------------");
		System.out.println("선택:");
		
	} // end showMenu()
	
	public void insertMemberData() {
		// VIEW 의 역할 : 사용자 입출력
		
		// TODO
		
	} // end insertMemberData()
	
	public void updateMemberData() {
		// VIEW 의 역할 : 사용자 입출력

		// TODO
		
	} // end updateMemberData() 
	
	public void searchAll() {

		// TODO
		
	} // end searchAll()
	
	public static void main(String[] args) {
		System.out.println("#회원 관리 프로그램#");
		
		MemberMain app = new MemberMain();
		
		app.init();
		app.run();
		app.exit();

	} // end main()
	
	public void init() {
		sc = new Scanner(System.in);
		// CONTROLLER 생성
		// TODO
	
	} // end init()
	
	public void run() {
		
		while (true) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 엔터키
			
			switch (menu) {
			case Menu.MENU_QUIT:
				System.out.println("프로그램을 종료합니다...");
				return;
			case Menu.MENU_INSERT:
				insertMemberData();
				break;
			case Menu.MENU_SEARCH:
				searchAll();
				break;
			case Menu.MENU_UPDATE:
				updateMemberData();
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			} // end switch
			
		} // end while
	} // end run()
	
	public void exit() {
		sc.close();
	} // exit()
	

} // end class MemberMain





