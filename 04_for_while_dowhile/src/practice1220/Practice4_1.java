package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, user, count = 0;
		String yn;

		while (true) {
			count = 0;
			for (int i = 1; i <= 5; i++) {
				a = (int) (Math.random() * 90) + 10;
				b = (int) (Math.random() * 90) + 10;

				for (int j = 1; j <= 2; j++) {
					System.out.print("[" + i + "]" + a + " + " + b + " = ");
					user = Integer.parseInt(br.readLine());

					if (user == a + b) {
						System.out.println("������");
						count++;
						break;
					} else {
						if (j == 2)
							System.out.println("Ʋ�ȴ�.. ������ " + (a + b));
						System.out.println("Ʋ�ȴ�");
					}
				}
			}
			System.out.println("����� ��" + count + "������ ���߾ " + count * 20 + "�� �Դϴ�.");

			System.out.println();
			do {
				System.out.print("continue(Y/N) : ");
				yn = br.readLine();
			} while (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n"));
			if (yn.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
