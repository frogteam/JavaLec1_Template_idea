package phonebook06.file;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;


// Controller부분을 담당할 클래스
public class PhonebookManager implements DbQuery, Closeable {

	// 멤버 변수
	private LinkedList<PhonebookModel> pbList = new LinkedList<PhonebookModel>();
	
	// 저장할 파일에 대한 변수
	private static final String PB_DATA_DIR = "data";   // 저장될 경로
	private static final String PB_DATA_FILE = "phonebook.dat"; // 저장될 파일
	// TODO
	// 필요한 멤버변수 있으면 추가
	
	
	
	// singleton 디자인 패턴 적용
	private static PhonebookManager instance = null;
	private PhonebookManager() { // private 생성자
		// TODO
		// 프로그램 시작시
		// - 폰북이 저장될 디렉토리가 없으면 새로 생성, 데이터 파일 없으면 생성
		// - 데이터 파일 있으면 읽어 들어와서 데이터 파일 저장 -> List
		// - 프로그램 종료시 List -> 데이터 파일 저장
		// - 필요한 메소드 등이 필요하면 추가로 작성하세요. 단 private 로!
		
	}
	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()
	
	// 전화번호부 등록
	@Override
	public int insert(String name, String phoneNum, String email) {

		if(name == null || name.trim().length() == 0)
			throw new PhonebookException("insert() 이름입력 오류: ", DbQuery.ERR_EMPTY_STRING);
				
		int result = 0;
		
		PhonebookModel pb = new PhonebookModel(name, phoneNum, email);
		pb.setId(getMaxId() + 1); // id 자동 증가
		pb.setRegDate();          // regDate 는 현재날짜로
		pbList.add(pb);   // ★
		result = 1;
		
		return result;
	} // end insert()

	// 전화번호부 열람
	@Override
	public Object searchAll() {
		// List -> array
		return pbList.toArray(new PhonebookModel[pbList.size()]);
	} // end searchAll()

	// 전화번호부 갱신
	@Override
	public int update(int id, String name, String phoneNum, String email) {	
		
		if(!isValidId(id))
			throw new PhonebookException("update() 아이디오류: "  + id, DbQuery.ERR_INVALID_ID);

		if(name == null || name.trim().length() == 0)
			throw new PhonebookException("update() 이름입력 오류: ", DbQuery.ERR_EMPTY_STRING);
		
		int result = 0;
		
		PhonebookModel pb = null;
		
		for(int index = 0; index < pbList.size(); index++) {
			pb = pbList.get(index);
			if(pb.getId() == id) {
				pb.setName(name);
				pb.setPhoneNum(phoneNum);
				pb.setEmail(email);
				break;
			}
		}
		result = 1;
		
		return result;
		
	} // end update()
	
	// 전화번호부 삭제
	@Override
	public int delete(int id) {

		// id 유효한지 체크
		if(!isValidId(id))
			throw new PhonebookException("delete() 아이디오류: "  + id, DbQuery.ERR_INVALID_ID);

		// 해당 id 의 index를 찾아서 삭제
		for(int index = 0; index < pbList.size(); index++) {
			if(pbList.get(index).getId() == id) {				
				pbList.remove(index);
				break;
			} // end if
		} // end for
		
		
		return 1;
	} // end delete()
	
	
	@Override
	public int getMaxId() {
		int maxId = 0;  // pbList[0] 부터가 아니라,  0 부터 시작 (어짜피 id 는 1 부터 시작한다)
		
		for(int i = 0; i < pbList.size(); i++) {
			if(maxId < pbList.get(i).getId())
				maxId = pbList.get(i).getId();
		}
		
		return maxId;
	} // end getMaxId()
	
	@Override
	public boolean isValidId(int id) {
		
		for(int i = 0; i < pbList.size(); i++) {
			if(pbList.get(i).getId() == id) return true;  // List버젼으로 변환
		}
		
		return false;
	} // end isValidId()
	
	
	@Override
	public void close() throws IOException {
		// CONTROLLER 에서 자원 반납할 것들 있으면 여기서 작성
		
		// TODO
		// 파일 저장
		
	} // end close()
	
	
} // end class PhonebookManger


class PhonebookException extends RuntimeException{
	
	private int errCode = DbQuery.ERR_GENERIC;
	
	public PhonebookException() {
		super("PhoneBook 예외 발생");
	}
	
	public PhonebookException(String msg) {
		super(msg);
	}
	
	public PhonebookException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}
	
	// Throwable 의 getMessage 를 오버라이딩 가능
	@Override
	public String getMessage() {
		String msg = "ERR-" + errCode + "]" + DbQuery.ERR_STR[errCode] + 
							" " + super.getMessage();
		return msg;
	}

}












