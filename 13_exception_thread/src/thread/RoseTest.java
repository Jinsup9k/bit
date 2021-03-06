package thread;

public class RoseTest extends Thread {
	private String name;

	public RoseTest(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(name + "\t" + Thread.currentThread() + "\t i = " + i);
		}
		System.out.println(name + "종료");
	}

	public static void main(String[] args) {
		RoseTest aa = new RoseTest("안락");// 스레드 생성 3개
		RoseTest bb = new RoseTest("행복");
		RoseTest cc = new RoseTest("쾌락");

		aa.setName("안락");// 이름 주기
		bb.setName("행복");
		cc.setName("쾌락");

		// 우선 순위 1~ 10, defualt = 5
//		aa.setPriority(10);// 우선 순위 줄때 값을 변경한다
//		bb.setPriority(1);// 신뢰성이 낮음
//		cc.setPriority(1);

		aa.start();// 스레드 시작 - 스레드 실행 (운영체제)
		try {
			aa.join();// 해당 스레드가 멈출때까지 기다린다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bb.start();
		cc.start();
	}
}
