package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�߱�
public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start;

		int[] com = new int[3];
		int[] user = new int[3];

		while (true) {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			start = br.readLine();
			if (start.equalsIgnoreCase("Y") || start.equalsIgnoreCase("N"))
				break;
		}
		if (start.equalsIgnoreCase("N")) {
			// ����
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			// ����
			System.out.println("������ �����մϴ�.");
			System.out.println();
			// ����
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				// �ߺ� üũ
				for (int j = 0; j < i; j++) {
					if (com[j] == com[i]) {
						i--;
						break;
					}
				}
			} // ���� ��
			while (true) {
				// �Է��ؼ� �迭�� ���� �־���
				System.out.print("���� �Է� : ");
				int use = Integer.parseInt(br.readLine());
				user[0] = use / 100;// 123 1
				user[1] = use % 100 / 10;
				user[2] = use % 10;

				// ������ ��
				int strike = 0, ball = 0;
				for (int i = 0; i < com.length; i++) {
					if (com[i] == user[i]) {
						// strike
						strike++;
					}
					for (int j = 0; j < com.length; j++) {
						if (com[j] == user[i] && com[i] != user[i]) {
							// ball
							ball++;
						}
					}

				}
				System.out.println(strike + "��Ʈ����ũ " + ball + "��");
				System.out.println();
				if (strike == 3) {
					System.out.println("�����Դϴ�.");
					break;
				}
			}
		} // else ��

	}
}
