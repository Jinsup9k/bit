package abstract_1;

import java.util.Scanner;

//assert - run as - run confi.. - args
public class Assert {
	private int x, y;

	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("x�� �Է� : ");
		x = scan.nextInt();
		System.out.print("y�� �Է� : ");
		y = scan.nextInt();

	}

	public void output() {
		assert y >= 0 : "y�� 0���� ũ�ų� ���ƾ� �Ѵ�.";

		int mul = 1;

		for (int i = 0; i < y; i++) {
			mul *= x;
		}
		System.out.println(x + "�� " + y + "����" + mul);
	}

}
