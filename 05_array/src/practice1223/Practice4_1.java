package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//야구 
public class Practice4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int strike, ball;
		String yn;
		String inputStr;

		do {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			yn = br.readLine();
		} while (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N"));

		if (yn.equalsIgnoreCase("N")) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println();
			System.out.println("게임을 시작합니다.");

			// 시작
			// 난수 발생
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
				//System.out.print(com[i] + " ");
				
				// 중복 체크
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			} // 입력
			while (true) {
				System.out.println();
				System.out.print("숫자 입력 : ");
				inputStr = br.readLine();
				for (int i = 0; i < user.length; i++) {
					user[i] = (int) (inputStr.charAt(i) - 48);
				} // 비교
				strike = ball = 0;
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
							if (i == j)
								strike++;
							else
								ball++;
						}
					}
				}
				System.out.println(strike + "스트라이크 " + ball + "볼");
				if (strike == 3)
					break;
			}
		} // 엘스 끝
	}
}
