package swing502.menuaction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

/* 메뉴에 Action 이벤트 달기

	ActionListener 이용
		각 'JMenuItem' 컴포넌트에 Action 이벤트 리스너 설정
		메뉴 아이템이 선택되었을 때 Action 이벤트 리스너 호출

 */

public class MainWindow extends JFrame {
	
	Container c;
	JLabel label = new JLabel("Hello");

	public MainWindow() {
		setTitle("Menu 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);  // 처음에는 세로정렬 중앙에
		c.add(label, BorderLayout.CENTER);
		
		createMenu();  // 메뉴 생성
		
		setSize(250, 200);
		setVisible(true);
	} // end 생성자

	void createMenu() {
		// TODO
	} // end createMenu()
	
	// 메뉴 ActionListener
	// TODO
	
	public static void main(String[] args) {
		new MainWindow();
	} // end main()

} // end class
