package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, i, sw;

		while (true) {
			sw = 0;
			System.out.print("숫자 입력 : ");
			num = Integer.parseInt(br.readLine());
			if (num == 0)
				break;

			for (i = 2; i < num; i++) {
				if (num % i == 0)
					sw = 1;
			}
			System.out.println();
			if (sw == 0)
				System.out.println(num + "는 소수이다.");
			else
				System.out.println(num + "는 소수가 아니다.");
		} // while
		System.out.println("프로그램을 종료합니다.");
	}
}

/*
 * 소수구하기 단, 0이 입력되면 프로그램을 종료합니다.
 * 
 * {실행결과] 숫자입력 : 12 12는 소수가 아니다.
 * 
 * 숫자 입력 37 37은 소수이다.
 * 
 * 숫자입력 0 프로그램을 종료합
 */
