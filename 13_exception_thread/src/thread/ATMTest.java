package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositeMoney = 100000;
	private long balance;

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");

		mom.start();
		son.start();

	}

	@Override
	public synchronized void run() { // ����ȭ
		// synchronized (this) {
		// synchronized (ATMTest.class){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Thread.currentThread().getName() + "�� �ȳ��ϼ���");
		System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		withDraw();
		// }
	}

	public void withDraw() {
		if (balance > depositeMoney) {
			System.out.println("�ܾ� �ʰ�");
		} else if (balance % 10000 != 0) {
			System.out.println("���� ������ �Է��ϼ���");
		} else {
			depositeMoney -= balance;
			System.out.println("�ܾ��� " + depositeMoney + "�� �Դϴ�.");
		}
		System.out.println();
	}
}
