package swing509.filedialog;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*  파일 다이얼로그  JFileChooser
	파일 시스템의 탐색기와 같은 기능을 하는 다이얼로그
	사용자에게 파일이나 디렉터리를 쉽게 선택하도록 하는 기능
	
	다이얼로그 종류
		파일 열기 다이얼로그(File Open Dialog)
		파일 저장 다이얼로그(File Save Dialog)

	주의 사항
		파일 다이얼로그에서 사용자가 파일을 선택하는 행위란?
			사용자가 선택한 파일 이름을 얻기 위함
			파일을 읽거나 쓰는 행위가 아님!
	
		다이얼로그 닫기란?
			다이얼로그가 화면에서 보이지 않게 됨.
			JFileChooser 객체가 없어지거나 사용할 수 없게 것이 아님
				showOpenDialog() 메소드를 호출하면 다시 화면에 출력하고 재사용 가능
			다이얼로그가 닫힌 후 JFileChooser 객체로부터 사용자가 입력한 정보를 알아낼 수 있음
			
	파일 열기 다이얼로그 생성 과정
		1. JFileChooser 객체 생성
		2. FileNameExtensionFilter 파일 필터 객체 생성   
		3. JFileChooser에  파일 필터 설정 (생략가능)   JFileChooser.setFileFilter() 
		4. 열기 다이얼로그 출력     JFileChooser.showOpenDialog()
		5. 사용자가 선택한 파일 이름 알아내기  
			JFileChooser.getSelectedFile().getPath();
			JFileChooser.getSelectedFile().getName();

	파일 저장 다이얼로그 생성 과정
		JFileChooser.showSaveDialog();
 */
public class MainWindow extends JFrame {
	
	Container c;
	JLabel imageLabel = new JLabel();

	public MainWindow() {
		setTitle("Menu와 JFileChooser 활용  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.add(imageLabel);
		
		createMenu(); // 메뉴 생성
		
		setSize(250, 200);
		setVisible(true);
	} // end 생성자
	
	void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener{

		// TODO // 파일 대화 상자
		
		// 1. 파일 대화상자 객체 생성
		// TODO
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// 2. 파일 필터 객체 생성
			// TODO

			// 3. 파일 필터 설정
			// TODO
			
			// 4. 파일 대화상자 보이기
			// TODO
			
			// 5.사용자가 선택한 이름
			// TODO
		}
	}

	public static void main(String[] args) {
		new MainWindow();
	} // end main()
	
} // end class
