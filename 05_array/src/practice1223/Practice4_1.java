package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�߱� 
public class Practice4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int strike, ball;
		String yn;
		String inputStr;

		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = br.readLine();
		} while (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N"));

		if (yn.equalsIgnoreCase("N")) {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			System.out.println();
			System.out.println("������ �����մϴ�.");

			// ����
			// ���� �߻�
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
				//System.out.print(com[i] + " ");
				
				// �ߺ� üũ
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			} // �Է�
			while (true) {
				System.out.println();
				System.out.print("���� �Է� : ");
				inputStr = br.readLine();
				for (int i = 0; i < user.length; i++) {
					user[i] = (int) (inputStr.charAt(i) - 48);
				} // ��
				strike = ball = 0;
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
							if (i == j)
								strike++;
							else
								ball++;
						}
					}
				}
				System.out.println(strike + "��Ʈ����ũ " + ball + "��");
				if (strike == 3)
					break;
			}
		} // ���� ��
	}
}
