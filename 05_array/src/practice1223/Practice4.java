package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//야구
public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start;

		int[] com = new int[3];
		int[] user = new int[3];

		while (true) {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			start = br.readLine();
			if (start.equalsIgnoreCase("Y") || start.equalsIgnoreCase("N"))
				break;
		}
		if (start.equalsIgnoreCase("N")) {
			// 종료
			System.out.println("프로그램을 종료합니다.");
		} else {
			// 시작
			System.out.println("게임을 시작합니다.");
			System.out.println();
			// 난수
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				// 중복 체크
				for (int j = 0; j < i; j++) {
					if (com[j] == com[i]) {
						i--;
						break;
					}
				}
			} // 난수 끝
			while (true) {
				// 입력해서 배열에 각각 넣어줌
				System.out.print("숫자 입력 : ");
				int use = Integer.parseInt(br.readLine());
				user[0] = use / 100;// 123 1
				user[1] = use % 100 / 10;
				user[2] = use % 10;

				// 난수와 비교
				int strike = 0, ball = 0;
				for (int i = 0; i < com.length; i++) {
					if (com[i] == user[i]) {
						// strike
						strike++;
					}
					for (int j = 0; j < com.length; j++) {
						if (com[j] == user[i] && com[i] != user[i]) {
							// ball
							ball++;
						}
					}

				}
				System.out.println(strike + "스트라이크 " + ball + "볼");
				System.out.println();
				if (strike == 3) {
					System.out.println("정답입니다.");
					break;
				}
			}
		} // else 끝

	}
}
