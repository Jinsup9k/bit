package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p = new Practice8();
		int moneyOg = 0, out, in, choice;

		while (true) {
			// ���� ȭ�� ���
			System.out.println("*************");
			System.out.println("    1.����");
			System.out.println("    2.���");
			System.out.println("    3.�ܰ�");
			System.out.println("    4.����");
			System.out.println("*************");

			// 1234 ������
			System.out.print("��ȣ ���� : ");
			choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				// ����
				System.out.print("���ݾ� : ");
				in = Integer.parseInt(br.readLine());
				// 10000���� �����̸� �ȹ޴´�
				if (in % 10000 != 0) {
					System.out.println("���� ������ �Է��ϼ���");
				} else {
					// ��ǲ �޼ҵ忡�� ����� �ܾ��� ���
					moneyOg = p.input(in, moneyOg);
					System.out.println("����� �ܾ��� " + moneyOg + "�� �Դϴ�.");
				}
			} else if (choice == 2) {
				// ��� �޼ҵ� ȣ��
				System.out.print("��ݾ� : ");
				out = Integer.parseInt(br.readLine());
				if (out > moneyOg) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					moneyOg = p.output(out, moneyOg);
					System.out.println("����� �ܾ��� " + moneyOg + "�� �Դϴ�.");
				}

			} else if (choice == 3) {
				// �Ӵ� �� ���
				System.out.println("����� �ܾ��� " + moneyOg + "�� �Դϴ�.");

			} else if (choice == 4) {
				// ����
				System.out.println("���α׷��� �����մϴ�.");
				break;

			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				continue;
			}
		} // while�� ��

	}

	public int input(int in, int money) {
		int moneyp = in + money;
		return moneyp;
	}

	public int output(int out, int money) {
		int moneym = money - out;
		return moneym;
	}

}