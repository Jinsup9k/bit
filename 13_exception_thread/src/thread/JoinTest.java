package thread;

public class JoinTest implements Runnable {
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {

			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JoinTest j = new JoinTest();
		Thread t = new Thread(j);

		System.out.println("스레드 시작");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		// 메인이 끝나도 스레드는 종료되지 않는다.
		// 메인이 종료되어도 백그라운드에서 스레드는 돌아간다.
	}
}
