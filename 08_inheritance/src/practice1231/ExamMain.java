package practice1231;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam ee = new Exam();
		int people;
		String name, dap;

		// �Է�
		System.out.print("�ο����� �Է� : ");
		people = scan.nextInt();
		Exam[] e = new Exam[people];

		for (int i = 0; i < people; i++) {
			System.out.print("�̸� �Է� : ");
			name = scan.next();
			System.out.print("�� �Է� : ");
			dap = scan.next();
			e[i] = new Exam(name, dap);
			System.out.println();
		}
		// ���

		System.out.println("�̸�\t1 2 3 4 5\t����");
		for (int i = 0; i < people; i++) {
			System.out.print(e[i].getName() + "\t");
			e[i].compare();
			for (int j = 0; j < e[i].getOx().length; j++) {
				System.out.print(e[i].getOx()[j] + " ");
			}
			System.out.println("\t" + e[i].getScore());
		}
	}
}
