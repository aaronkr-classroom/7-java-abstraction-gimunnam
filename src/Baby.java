
public class Baby implements Papa, Mama{
	//papa의 모든 함수 정의
	public void genderFather() {
		System.out.println("나는 아버지입니다.");
	}
	//mama의 모든 함수 정의
	public void genderMother() {
		System.out.println("나는 어머니입니다.");
	}
	//baby 클래스의 함수
	public void printInfo() {
		System.out.println("나는 아기입니다.");
	}
}
