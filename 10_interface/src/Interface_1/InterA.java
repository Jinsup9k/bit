package Interface_1;

public interface InterA {
	public static final String NAME = "홍길동";// 상수
	int AGE = 25; // 생략 가능(interface만) - 변수아님

	public abstract void aa(); // 인터페이스에서는 추상만 가능

	public void bb();// 추상만 가능해서 생략해도 오류 안남

}
