package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int) (Math.random() * 100) + 1;
		int user;
		int count = 0;
		String fin;
	
		while (true) {
			System.out.print("숫자 입력 : ");
			user = Integer.parseInt(br.readLine());
			++count;
			if (com == user) {
				System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.\n");
				do {
					count = 0;
					System.out.print("또할래?(Y/N) : ");
					fin = br.readLine();
					if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
						break;
					} else {
						System.out.println("잘 못 입력 하셨습니다. (Y/N)");
					}
				} while (true);
				if (fin.equalsIgnoreCase("N")) {
					System.out.println("게임을 종료합니다.");
					break ;
				} else {
					 com = (int) (Math.random() * 100) + 1;
					while (true) {
						System.out.print("숫자 입력 : ");
						user = Integer.parseInt(br.readLine());
						++count;
						if (com == user) {
							System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.\n");
							do {
								System.out.print("또할래?(Y/N) : ");
								fin = br.readLine();
								if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
									break;
								} else {
									System.out.println("잘 못 입력 하셨습니다. (Y/N)");
								}
							} while (true);
							if (fin.equalsIgnoreCase("N")) {
								System.out.println("게임을 종료합니다.");
								break;
							}
						} else {
							if (com > user) {
								System.out.println(user + " 보다 큽니다.\n");
							} else {
								System.out.println(user + " 보다 작습니다.\n");
							}
						}
					}
				}
			} else {
				if (com > user) {
					System.out.println(user + " 보다 큽니다.\n");
				} else {
					System.out.println(user + " 보다 작습니다.\n");
				}
			}
		}
	}
}
