package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Practice3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		Practice3_1 p = new Practice3_1();

		System.out.print("현금 입력 : ");
		money = Integer.parseInt(br.readLine());

		for (int i = 1; i <= money / 1000; i++) {
			p.input(lotto);
			// Arrays.sort(lotto);// 오름차순
			p.sort(lotto);
			p.output(lotto);
			System.out.println();
			if (i % 5 == 0)
				System.out.println();
		}
	}

	private void sort(int[] lotto) {
		// Selection Sort 선택적 정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

	}
	

	private void output(int[] lotto) {
		for (int n : lotto)
			System.out.print(String.format("%5d",n));
	}

	private void input(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
	}
}
