package swing101.frame;


// swing 을 처음 학습할때는 사용할때는 개별 import 추천 import javax.swing.JFrame;    
//import javax.swing.*;          // import javax.swing.*;<- 나중에 익숙해지면 이렇게 import 추천
							   // 익숙해지기 전까진, 각가의 클래스가 어느 패키지 소속인지 일일히 눈여겨 보아두는 것도 좋음.

/*  GUI, AWT, Swing / 스윙 프레임 만들기
 
 	GUI(Graphical User Interface)
 		그래픽 이용, 사용자에게 이해하기 쉬운 모양으로 정보 제공
		사용자는 마우스나 키보드를 이용하여 쉽게 입력

 	'자바'의 GUI 프로그래밍 방법들
		1. AWT 패키지와 Swing 패키지에 제공되는 메카니즘 이용
			AWT → java.awt 
			Swing → javax.swing
		
		2. JavaFX 사용   : jfxt.jar 필요  → javafx.application

	AWT(Abstract Windowing Toolkit) : java.awt
		자바가 처음 나왔을 때 함께 배포된 GUI 라이브러리
		중량 컴포넌트(Heavy weight components)
			AWT 컴포넌트는 native(peer) 운영체제의 GUI 컴포넌트의 도움을 받아 작동
			운영체제에 많은 부담. 오히려 처리 속도는 빠름

	Swing(스윙) : javax.swing
		AWT 기술을 기반(상속받아)으로 순수 자바 언어로 만들어진 라이브러리
			모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트
			AWT 컴포넌트에 J자가 덧붙여진 이름의 클래스 + 그 외 J 자로 시작하는 클래스
 		경량 컴포넌트(Light weight components) 
			native(peer) 운영체제에 의존하지 않음

	Swing 컴포넌트 예시 샘플 (※ppt)
	GUI 라이브러리 계층 구조 (※ppt)
	
	Swing 컴포넌트의 2가지 유형
		JComponent는 상속받는 클래스
			대부분의 스윙 컴포넌트
		AWT의 Container를 상속받는 몇 개의  클래스
			JApplet, JDialog, JFrame 등

	JComponent
		스윙 컴포넌트의 공통적인 속성을 구현한 추상 클래스 -> new JComponent()  인스턴스를 생성할 수 없음
		AWT의 Component를 상속받음

	컨테이너
		다른 GUI 컴포넌트를 포함할 수 있는 컴포넌트
		java.awt.Container 상속
		다른 컨테이너에 포함될 수 있음
		종류
			AWT 컨테이너 : Panel, Frame, Applet, Dialog, Window
			Swing 컨테이너 : JPanel JFrame, JApplet, JDialog, JWindow

	최상위 컨테이너
		다른 컨테이너에 속하지 않고 독립적으로 출력가능한 컨테이너
			JFrame, JDialog, JApplet
		모든 컴포넌트는 컨테이너에 포함되어야 화면에 출력 가능

	컴포넌트
		컨테이너에 포함되어야 화면에 출력될 수 있는 순수 컴포넌트
		모든 컴포넌트는 java.awt.Component를 상속받음
		모든 스윙 컴포넌트는 javax.swing.JComponent를 상속받음
		
	컨테이너와 컴포넌트 포함관계 (※ppt 참조)
 
 	스윙 GUI 프로그램 만드는 기본 순서
 		1. 스윙 프레임 작성
		2. main() 메소드 작성
		3. 프레임에 스윙 컴포넌트 붙이기

	스윙 패키지 사용을 위한 import
		java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
		java.awt.event.*; // AWT 이벤트 사용을 위한 경로명
		javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
		javax.swing.event.*; // 스윙 이벤트를 위한 경로명
 
	스윙 프레임 (Swing Frame)
		모든 스윙 컴포넌트를 담는 최상위 GUI 컨테이너
			- JFrame을 상속받아 구현
			- 컴포넌트가 화면에 보이려면 스윙 프레임에 부착되어야 함
			- 프레임을 닫으면 프레임 내의 모든 컴포넌트가 보이지 않게 됨
	
		스윙 프레임(JFrame) 기본 구성  (※ppt)
			- 프레임 (Frame) – 스윙 프로그램의 기본 틀
			- 메뉴바 (Menu Bar) – 메뉴들이 부착되는 공간
			- 컨텐트 팬(Content Pane) – GUI 컴포넌트들이 부착되는 공간
 */

public class MainWindow{

	public static void main(String[] args) {
		
		
	} // end main()

} // end class


// AWT, 스윙 과 같은 GUI는 매우 방대한 양의 클래스와 기능들을 제공합니다. 
// 처음부터 모든것을 다 익힐수는 (절대) 없습니다.
// 기본예제를 익히고 이해하고, 그 다음부터는 필요한것 마다 레퍼런스와 예제 중심으로 
// 찾아서 만들어 가며 익히는 것을 추천 합니다.
