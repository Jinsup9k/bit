package practice1231;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam ee = new Exam();
		int people;
		String name, dap;

		// 입력
		System.out.print("인원수를 입력 : ");
		people = scan.nextInt();
		Exam[] e = new Exam[people];

		for (int i = 0; i < people; i++) {
			System.out.print("이름 입력 : ");
			name = scan.next();
			System.out.print("답 입력 : ");
			dap = scan.next();
			e[i] = new Exam(name, dap);
			System.out.println();
		}
		// 출력

		System.out.println("이름\t1 2 3 4 5\t점수");
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
