package ch08.book.exercise.s04;
// 구현클래스
public class MySqlDao implements DataAccessObject {
	
	// 인터페이스 메소드는 추상메소드이므로
	// 재정의
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");

	}

	@Override
	public void update() {
		System.out.println("MySql DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");

	}
}
