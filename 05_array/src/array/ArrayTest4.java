package array;
//주차관리 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest4 a = new ArrayTest4();
		boolean[] ar = new boolean[5];

		// 메뉴함수() 호출

		a.menu(ar);

		System.out.println("프로그램을 종료합니다.");

	}// main

	public void menu(boolean[] ar) throws IOException {
		int num;

		while (true) {
			System.out.println("************");
			System.out.println("  1. 입차");
			System.out.println("  2. 출차");
			System.out.println("  3. 리스트");
			System.out.println("  4. 종료");
			System.out.println("************");
			System.out.print("메뉴 : ");
			num = Integer.parseInt(br.readLine());

			if (num == 1) {
				// 입차 메소드 호출
				input(ar);
			} else if (num == 2) {
				// 출차 메소드 호출
				output(ar);
			} else if (num == 3) {
				// 리스트 메소드 호출
				list(ar);
			} else if (num == 4) {
				// 종료
				break;

			} else {
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
				continue;

			} // while
		}

	}// menu

	private void list(boolean[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "위치 : " + ar[i]);
		}

	}

	private void input(boolean[] ar) throws IOException {
		System.out.println("위치 입력 : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			System.out.println("이미 주차되어있습니다.");
		} else {
			ar[index - 1] = true;
			System.out.println(index + "위치에 입차");
		}

	}// input

	private void output(boolean[] ar) throws IOException {
		System.out.println("위치 입력 : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			ar[index - 1] = false;
			System.out.println(index + "위치에 출차");
		} else {
			System.out.println("주차되어 있지 않습니다.");
		}
	}// output

}
