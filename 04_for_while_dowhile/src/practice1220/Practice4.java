package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��������
public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, user, score = 0, crg = 0;
		String fin;

		for (i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 90) + 10;
			int b = (int) (Math.random() * 90) + 10;
			System.out.print("[" + i + "]" + a + " + " + b + " = ");
			user = Integer.parseInt(br.readLine());

			while (user != a + b) {
				user = 0;
				crg++;
				System.out.println("Ʋ�ȴ�");
				System.out.println("...���� : ");
				user = Integer.parseInt(br.readLine());
				if (crg == 0)
					continue;
				break;
			}
			if (user == a + b) {
				score++;
				System.out.println("������");
			}
			if (i == 5) {
				System.out.println("����� �� " + score + "������ ���߾ " + score * 20 + "�� �Դϴ�.");

				while (true) {
					System.out.println("continue(y/n)?");
					fin = br.readLine();
					if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
						break;
					}
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				if (fin.equalsIgnoreCase("y")) {
					i=0;
					continue;
				}System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}

	}
}
