package Practice1230;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int count = 0;
		int index = 0;
		while (true) {
			System.out.print("���ڿ� �Է� : ");
			// sb.append(scan.next().toLowerCase());
			String str = scan.next().toLowerCase();
			
			System.out.print("���� ���ڿ� �Է� : ");
			String before = scan.next();

			System.out.print("�ٲ� ���ڿ� �Է� : ");
			String after = scan.next();

			if (str.length() < before.length()) {
				System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
				return;
			}
//			for (int i = 0; i < sb.length(); i += before.length()) {
//				if (sb.indexOf(before) != -1) {
//					sb.replace(sb.indexOf(before), sb.indexOf(before) + before.length(), after);
//					count++;
//				}
//			}
			while ((index = str.indexOf(before, index)) != -1) {
				index += before.length();
				count++;
			} // while�� �̿�

			System.out.println(str.replace(before, after));
			System.out.println(count + "�� ġȯ");

		}
	}

}
