package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {// <--- 익명 이너클래스

			@Override
			public void setName(String name) {
			}
		};// 세미콜론 꼭 직기
		at.setName("홍길동");
		System.out.println("이름은 ? " + at.getName());

		InterA aa = new InterA() {// 여기서 new는 익명 이너클래스를 new해주는 것!
			@Override
			public void bb() {
			}

			@Override
			public void aa() {
			}
		};

		AbstractExam ae = new AbstractExam() {
		};
	}
}