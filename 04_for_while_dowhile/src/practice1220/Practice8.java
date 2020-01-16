package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p = new Practice8();
		int moneyOg = 0, out, in, choice;

		while (true) {
			// 메인 화면 출력
			System.out.println("*************");
			System.out.println("    1.예금");
			System.out.println("    2.출금");
			System.out.println("    3.잔고");
			System.out.println("    4.종료");
			System.out.println("*************");

			// 1234 선택지
			System.out.print("번호 선택 : ");
			choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				// 예금
				System.out.print("예금액 : ");
				in = Integer.parseInt(br.readLine());
				// 10000단위 이하이면 안받는다
				if (in % 10000 != 0) {
					System.out.println("만원 단위로 입력하세요");
				} else {
					// 인풋 메소드에서 계산후 잔액을 출력
					moneyOg = p.input(in, moneyOg);
					System.out.println("당신의 잔액은 " + moneyOg + "원 입니다.");
				}
			} else if (choice == 2) {
				// 출금 메소드 호출
				System.out.print("출금액 : ");
				out = Integer.parseInt(br.readLine());
				if (out > moneyOg) {
					System.out.println("잔액이 부족합니다.");
				} else {
					moneyOg = p.output(out, moneyOg);
					System.out.println("당신의 잔액은 " + moneyOg + "원 입니다.");
				}

			} else if (choice == 3) {
				// 머니 값 출력
				System.out.println("당신의 잔액은 " + moneyOg + "원 입니다.");

			} else if (choice == 4) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			}
		} // while문 끝

	}

	public int input(int in, int money) {
		int moneyp = in + money;
		return moneyp;
	}

	public int output(int out, int money) {
		int moneym = money - out;
		return moneym;
	}

}