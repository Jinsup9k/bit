package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.jar.Attributes.Name;

public class MultiArray6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt, i, j, k;
		int subjectCnt = 0;
		String jumsu;
		String[] name;
		String[][] subject = null;

		// �Է�
		// �ο����� �Է¹޴´�.
		System.out.print("�ο��� : ");
		cnt = Integer.parseInt(br.readLine());

		name = new String[cnt];

		// �̸��Է�
		for (i = 0; i < name.length; i++) {
			System.out.print("�̸� �Է� : ");
			name[i] = br.readLine();
			System.out.print("����� : ");
			subjectCnt = Integer.parseInt(br.readLine());

			k = 1;
			subject = new String[subjectCnt][k];

			// ������Է�
			for (j = 0; j < subject.length; j++) {
				System.out.print("����� �Է� : ");
				k = 0;
				subject[j][k] = br.readLine();

				if (j < subject.length)
					continue;
			} // �����

			for (j = 0; j < subject.length; j++) {
				System.out.print(subject[j][k] + " ���� �Է� : ");
				jumsu = br.readLine();
				subject[j][k] = jumsu;
			}
			System.out.println("--------------------");
		} // �̸���
			// ���
		for (i = 0; i < name.length; i++) {
			for(j = 0; j <= subjectCnt; j++) {
			System.out.print("�̸�"+name[i]+""+subject[j]);
			}
		}
	}
}
