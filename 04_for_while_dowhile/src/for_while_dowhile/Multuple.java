package for_while_dowhile;
/*���ڸ� �Է��Ͽ� ����� �ϰ����� ���Ͻÿ�
 * �� ���� �̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�
 * 
 * [������]
 * ���� �Է� : -7
 * ���� �Է� : 8
 * 8 13 24 32 40 48 56
 * 
 * ���� �Է� : 0
 * ���α׷��� �����մϴ�.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multuple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, i;

		while (true) {
			System.out.print("���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			if (num == 0)
				break;
			if (num < 0)
				continue;
			// ��� ���ϱ�
			for (i = 1; i <= 7; i++) {
				System.out.print(num * i + " ");
			}
			System.out.println();
		}
	}
}
