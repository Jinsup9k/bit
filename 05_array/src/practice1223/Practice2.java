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
			// �������� �Է� �޴´�.
			System.out.print("10���� �Է� : ");
			num = Integer.parseInt(br.readLine());

			if (num == 0) {
				// 0�� �ԷµǸ� ���α׷� ����
				System.out.println("���α׷��� ����");
				break;
			} else if (num < 0) {
				// ������ �ԷµǸ� ���Է� �Ѵ�
				System.out.println("����� �Է��� �ּ���");
				continue;
			} else {
				// �������� ��ȯ�ؼ� �迭�� �����Ѵ�
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
