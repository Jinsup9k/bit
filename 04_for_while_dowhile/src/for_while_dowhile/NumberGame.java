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
			System.out.print("���� �Է� : ");
			user = Integer.parseInt(br.readLine());
			++count;
			if (com == user) {
				System.out.println("������ " + count + "������ ���߼̽��ϴ�.\n");
				do {
					count = 0;
					System.out.print("���ҷ�?(Y/N) : ");
					fin = br.readLine();
					if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
						break;
					} else {
						System.out.println("�� �� �Է� �ϼ̽��ϴ�. (Y/N)");
					}
				} while (true);
				if (fin.equalsIgnoreCase("N")) {
					System.out.println("������ �����մϴ�.");
					break ;
				} else {
					 com = (int) (Math.random() * 100) + 1;
					while (true) {
						System.out.print("���� �Է� : ");
						user = Integer.parseInt(br.readLine());
						++count;
						if (com == user) {
							System.out.println("������ " + count + "������ ���߼̽��ϴ�.\n");
							do {
								System.out.print("���ҷ�?(Y/N) : ");
								fin = br.readLine();
								if (fin.equalsIgnoreCase("Y") || fin.equalsIgnoreCase("N")) {
									break;
								} else {
									System.out.println("�� �� �Է� �ϼ̽��ϴ�. (Y/N)");
								}
							} while (true);
							if (fin.equalsIgnoreCase("N")) {
								System.out.println("������ �����մϴ�.");
								break;
							}
						} else {
							if (com > user) {
								System.out.println(user + " ���� Ů�ϴ�.\n");
							} else {
								System.out.println(user + " ���� �۽��ϴ�.\n");
							}
						}
					}
				}
			} else {
				if (com > user) {
					System.out.println(user + " ���� Ů�ϴ�.\n");
				} else {
					System.out.println(user + " ���� �۽��ϴ�.\n");
				}
			}
		}
	}
}
