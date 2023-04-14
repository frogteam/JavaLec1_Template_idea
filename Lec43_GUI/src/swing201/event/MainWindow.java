package swing201.event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {
	
	public static void main(String[] args) {
		
		new MyFrame();
		
	} // end main
} // end class

class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 방법1 : 별도의 리스너 작성
		JButton btn1 = new JButton("Action1");
		// TODO
		
		// 방법2 inner class
		JButton btn2 = new JButton("Action2");
		// TODO

		// 방법3 : 익명 클래스 사용
		JButton btn3 = new JButton("Action3");
		// TODO
		
		// 방법4 : 람다식 사용
		JButton btn4 = new JButton("Action4");
		// TODO
		
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		setSize(450, 150);
		setVisible(true);	
	} // end 생성자
	
	// 방법2 inner class
	// TODO
	
} // end MyFrame


//방법 1 별도의 Listener 클래스 만들어서 사용.
// TODO

