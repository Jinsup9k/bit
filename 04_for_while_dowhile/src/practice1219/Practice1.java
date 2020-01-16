package practice1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int) (Math.random() * 3) + 1;
		int user;
		int sic = 1;
		int roc = 2;
		int pap = 3;
		String fin;

		// 가위바위보
		for (;;) {
			System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
			user = Integer.parseInt(br.readLine());
			System.out.println("컴퓨터 : " + com + "\t    나 : " + user);

			if (user == com) {// 비길때
				System.out.println("You Draw!!");
			} else if ((user == sic && com == pap) || (user == roc && com == sic) || (user == pap && com == roc)) {// 이길때
				System.out.println("You Win!!!");
			} else {// 질때
				System.out.println("You Lose!!");
			}
			System.out.println("또 할래(Y/N)?");

			while (true) {
				fin = br.readLine();
				if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
					break;
				}
				System.out.println("또할래(Y/N)?");
			}
			if (fin.equalsIgnoreCase("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}
}

/*
 * { if (user == 1) { if (com == 1) System.out.println("You Draw!!"); if (com ==
 * 2) System.out.println("You Lose!!"); if (com == 3)
 * System.out.println("You Win!!!");
 * 
 * } else if (user == 2) { if (com == 1) System.out.println("You Win!!!"); if
 * (com == 2) System.out.println("You Draw!!"); if (com == 3)
 * System.out.println("You Lose!!"); } else { if (com == 1)
 * System.out.println("You Lose!!"); if (com == 2)
 * System.out.println("You Win!!!"); if (com == 3)
 * System.out.println("You Draw!!!"); }
 * 
 */