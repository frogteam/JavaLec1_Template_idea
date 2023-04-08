package phonebook04.id;

// View(PhonebookMain)와 Controller(PhonebookManager) 사이의 인터페이스
public interface DbQuery {
	public static final String VERSION = "전화번호부 v4.0";
	
	public abstract int insert(String name, String phoneNum, String email);
	public abstract Object searchAll();
	public abstract int update(int index, String name, String phoneNum, String email);
	public abstract int delete(int index);
	
	//public static final int QUERY_FAIL = -1;   //  Exception 이 추가 되면 없어도 될듯? 
	
	// 에러코드 상수
	public static final int ERR_GENERIC = 0; 
	public static final int ERR_INDEXOUTOFRANGE = 1;   // 인덱스 범위 벗어남
	public static final int ERR_EMPTY_STRING = 2;     // 입력한 문자열이 empty 인 경우
	
	// 에러 문자열
	public static final String[] ERR_STR = {
			"일반오류",   // 0
			"인덱스오류",  // 1
			"문자열오류"   // 2
	};
	
} // end interface DbQuery

