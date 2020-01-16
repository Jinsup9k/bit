package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0, j, num = 0 , count = 0;
		int[] mok = new int[32];

		while (true) {
			// 십진수를 입력 받는다.
			System.out.print("10진수 입력 : ");
			num = Integer.parseInt(br.readLine());

			if (num == 0) {
				// 0이 입력되면 프로그램 종료
				System.out.println("프로그램을 종료");
				break;
			} else if (num < 0) {
				// 음수가 입력되면 재입력 한다
				System.out.println("양수만 입력해 주세요");
				continue;
			} else {
				// 이진수로 변환해서 배열에 저장한다
				for (i = 0; i < mok.length; i++) {
					mok[i] = num % 2;
					num = num / 2;
				}
				for (j = (mok.length - 1); j >= 0; j--) {
					count++;
					System.out.print(mok[j]);
					if(count%4 == 0)System.out.print(" ");
				}
				System.out.println("\n");
			}
		}
	}

}
