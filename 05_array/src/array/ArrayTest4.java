package array;
//�������� 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest4 a = new ArrayTest4();
		boolean[] ar = new boolean[5];

		// �޴��Լ�() ȣ��

		a.menu(ar);

		System.out.println("���α׷��� �����մϴ�.");

	}// main

	public void menu(boolean[] ar) throws IOException {
		int num;

		while (true) {
			System.out.println("************");
			System.out.println("  1. ����");
			System.out.println("  2. ����");
			System.out.println("  3. ����Ʈ");
			System.out.println("  4. ����");
			System.out.println("************");
			System.out.print("�޴� : ");
			num = Integer.parseInt(br.readLine());

			if (num == 1) {
				// ���� �޼ҵ� ȣ��
				input(ar);
			} else if (num == 2) {
				// ���� �޼ҵ� ȣ��
				output(ar);
			} else if (num == 3) {
				// ����Ʈ �޼ҵ� ȣ��
				list(ar);
			} else if (num == 4) {
				// ����
				break;

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
				continue;

			} // while
		}

	}// menu

	private void list(boolean[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "��ġ : " + ar[i]);
		}

	}

	private void input(boolean[] ar) throws IOException {
		System.out.println("��ġ �Է� : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			System.out.println("�̹� �����Ǿ��ֽ��ϴ�.");
		} else {
			ar[index - 1] = true;
			System.out.println(index + "��ġ�� ����");
		}

	}// input

	private void output(boolean[] ar) throws IOException {
		System.out.println("��ġ �Է� : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			ar[index - 1] = false;
			System.out.println(index + "��ġ�� ����");
		} else {
			System.out.println("�����Ǿ� ���� �ʽ��ϴ�.");
		}
	}// output

}
