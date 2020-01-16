package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositeMoney = 100000;
	private long balance;

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");

		mom.start();
		son.start();

	}

	@Override
	public synchronized void run() { // 동기화
		// synchronized (this) {
		// synchronized (ATMTest.class){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Thread.currentThread().getName() + "님 안녕하세요");
		System.out.print("찾고자 하는 금액 입력 : ");
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
			System.out.println("잔액 초과");
		} else if (balance % 10000 != 0) {
			System.out.println("만원 단위로 입력하세요");
		} else {
			depositeMoney -= balance;
			System.out.println("잔액은 " + depositeMoney + "원 입니다.");
		}
		System.out.println();
	}
}
