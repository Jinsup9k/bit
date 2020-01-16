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

		System.out.println("������ ����");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
		// ������ ������ ������� ������� �ʴ´�.
		// ������ ����Ǿ ��׶��忡�� ������� ���ư���.
	}
}
