package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//덧셈공부
public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, user, score = 0, crg = 0;
		String fin;

		for (i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 90) + 10;
			int b = (int) (Math.random() * 90) + 10;
			System.out.print("[" + i + "]" + a + " + " + b + " = ");
			user = Integer.parseInt(br.readLine());

			while (user != a + b) {
				user = 0;
				crg++;
				System.out.println("틀렸다");
				System.out.println("...정답 : ");
				user = Integer.parseInt(br.readLine());
				if (crg == 0)
					continue;
				break;
			}
			if (user == a + b) {
				score++;
				System.out.println("딩동뎅");
			}
			if (i == 5) {
				System.out.println("당신은 총 " + score + "문제를 맞추어서 " + score * 20 + "점 입니다.");

				while (true) {
					System.out.println("continue(y/n)?");
					fin = br.readLine();
					if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
						break;
					}
					System.out.println("잘못 입력하셨습니다.");
				}
				if (fin.equalsIgnoreCase("y")) {
					i=0;
					continue;
				}System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}

	}
}
