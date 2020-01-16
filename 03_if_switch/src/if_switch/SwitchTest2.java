package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*a�� �Է� : 25
b�� �Է� : 36
������ (+,-,*,/)�Է� : +
25 + 36 = xx

�Ǽ� �϶� �Ҽ��� 3° �ڸ� ����
������ �̻��Ѱ� ������ ? ������error*/
public class SwitchTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� : ");
		String op = br.readLine();

		// ����ġ(������) ������ ���̽� ���� ����
		// +75 -77 *74 /79
		switch (op) {
		case ("+"):
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case ("-"):
			System.out.println(a + " - " + b + " = " + (a + b));
			break;
		case ("*"):
			System.out.println(a + " * " + b + " = " + (a + b));
			break;
		case ("/"):
			// System.out.println(a + " / " + b + " = " + String.format("%.3f", (double) a +
			// b ));
			// #���� �ϸ� ��ȿ���� ���� ���� �� �߷����� ����
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a + " / " + b + " = " + df.format(a + b));
			break;
		default:
			System.out.println("������ error");

		}

	}
}
