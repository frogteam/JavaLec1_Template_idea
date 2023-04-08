package swing104.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* JPanel : 컨테이너 역할을 하는 클래스
 	
 	다른 컨테이들처럼 컴포넌트들을 담을수 있다.
 	JPanel 내의 디폴트 레이아웃은 FlowLayout,  레이아웃 변경 가능
 	
 	프레임에 panel 들을 컴포넌트처럼 배치하고
 	각 panel 안에  또다시 panel 을 배치함으로 
 	복잡한 레이아웃 (중첩 레이아웃) 구성 가능.
 */
public class MainWindow {
	public static void main(String[] args) {
		new PanelFrame1();
	} // end main
} // end class

class PanelFrame1 extends JFrame {

	public PanelFrame1() {
		setTitle("panel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel 생성
		// TODO
		
		// 컴포넌트들 생성
		JButton b1 = new JButton("Button 1");
		// TODO
		
		JButton b2 = new JButton("Button 2");
		// TODO
		
		JTextField t1 = new JTextField("0", 10); // (최초 문자열, 입력 column 수)
		// TODO

		// 컴포넌트들을 panel 에 추가
		// TODO
		
		// panel 을 프레임에 추가
		// TODO
		
		setLayout(null);    
		setSize(400,400);    
		
		// 사이즈 조정 못하게 설정 가능
		// TODO
		
        setVisible(true);
	} // end 생성자

} // end Frame
