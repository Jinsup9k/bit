package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;

	public StringBufferTest() {
		Scanner scan = new Scanner(System.in);

		System.out.print("���ϴ� ���� �Է� : ");
		dan = scan.nextInt();

	}

	public void output() {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 9; i++) {
			// System.out.println(dan + "*" + i + "=" + dan * i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan * i);

			System.out.println(sb.toString());
			//�Ƚᵵ ������ ��Ʈ������ �ٲ㼭 ����
			sb.delete(0, sb.length());//start ~ end-1
		}
	}

	public static void main(String[] args) {
		StringBufferTest s = new StringBufferTest();
		s.output();
	}

}

