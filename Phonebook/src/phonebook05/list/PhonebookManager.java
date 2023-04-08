package phonebook05.list;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

// Controller부분을 담당할 클래스
public class PhonebookManager implements DbQuery, Closeable {

	// 멤버 변수
	// TODO : 배열 대신 List 를 사용해보자
	
	// singleton 디자인 패턴 적용
	private static PhonebookManager instance = null;
	private PhonebookManager() {} // private 생성자
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
		
		// TODO : List 버젼으로 작성
		
		return result;
	} // end insert()

	// 전화번호부 열람
	@Override
	public Object searchAll() {
		
		// TODO : List 버젼으로 작성
		
		return null;		
	} // end searchAll()

	// 전화번호부 갱신
	@Override
	public int update(int id, String name, String phoneNum, String email) {	
		
		if(!isValidId(id))
			throw new PhonebookException("update() 아이디오류: "  + id, DbQuery.ERR_INVALID_ID);

		if(name == null || name.trim().length() == 0)
			throw new PhonebookException("update() 이름입력 오류: ", DbQuery.ERR_EMPTY_STRING);
		
		PhonebookModel pb = null;
		
		int result = 0;
				
		// TODO : List 버젼으로 작성
		
		
		return 0;
		
	} // end update()
	
	// 전화번호부 삭제
	@Override
	public int delete(int id) {

		// id 유효한지 체크
		if(!isValidId(id))
			throw new PhonebookException("delete() 아이디오류: "  + id, DbQuery.ERR_INVALID_ID);

		
		int result = 0;
		
		
		// TODO : List 버젼으로 작성
		
		
		return result;
	} // end delete()
	
	
	@Override
	public int getMaxId() {
		int maxId = 0;  // pbList[0] 부터가 아니라,  0 부터 시작 (어짜피 id 는 1 부터 시작한다)
		
		// TODO : List 버젼으로 작성
		
		return maxId;
	} // end getMaxId()
	
	@Override
	public boolean isValidId(int id) {
		
		boolean result = false;
		
		// TODO : List 버젼으로 작성
		
		return result;
	} // end isValidId()
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
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












