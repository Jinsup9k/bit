package for_while_dowhile;
/*숫자를 입력하여 배수를 일곱개만 구하시오
 * 단 음수 이면 다시 입력하고 0이면 종료하시오
 * 
 * [실행결과]
 * 숫자 입력 : -7
 * 숫자 입력 : 8
 * 8 13 24 32 40 48 56
 * 
 * 숫자 입력 : 0
 * 프로그램을 종료합니다.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multuple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, i;

		while (true) {
			System.out.print("숫자 입력 : ");
			num = Integer.parseInt(br.readLine());
			if (num == 0)
				break;
			if (num < 0)
				continue;
			// 배수 구하기
			for (i = 1; i <= 7; i++) {
				System.out.print(num * i + " ");
			}
			System.out.println();
		}
	}
}
