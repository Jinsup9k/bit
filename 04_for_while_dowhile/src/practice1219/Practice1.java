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

		// ����������
		for (;;) {
			System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
			user = Integer.parseInt(br.readLine());
			System.out.println("��ǻ�� : " + com + "\t    �� : " + user);

			if (user == com) {// ��涧
				System.out.println("You Draw!!");
			} else if ((user == sic && com == pap) || (user == roc && com == sic) || (user == pap && com == roc)) {// �̱涧
				System.out.println("You Win!!!");
			} else {// ����
				System.out.println("You Lose!!");
			}
			System.out.println("�� �ҷ�(Y/N)?");

			while (true) {
				fin = br.readLine();
				if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
					break;
				}
				System.out.println("���ҷ�(Y/N)?");
			}
			if (fin.equalsIgnoreCase("N")) {
				System.out.println("���α׷��� �����մϴ�.");
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