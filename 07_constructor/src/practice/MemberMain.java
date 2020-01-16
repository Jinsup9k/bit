package practice;

import java.util.Scanner;

public class MemberMain {
	// �� 5��
	MemberDTO[] ar = new MemberDTO[5];
	int count;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberMain mm = new MemberMain();
		for (int i = 0; i < mm.ar.length; i++) {
			mm.ar[i] = new MemberDTO();
		}
		int choice;

		while (true) {
			mm.menu();
			System.out.print(" ��ȣ : ");
			choice = scan.nextInt();
			if (choice == 1) {
				// ����
				mm.insert();
			} else if (choice == 2) {
				// ���
				mm.list();
			} else if (choice == 3) {
				// ����
				mm.update();
			} else if (choice == 4) {
				// Ż��
				mm.delete();
			} else if (choice == 5) {
				// ������
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		} // while
	}// main

	public void menu() {
		System.out.println("**********");
		System.out.println(" 1. ����");
		System.out.println(" 2. ���");
		System.out.println(" 3. ����");
		System.out.println(" 4. Ż��");
		System.out.println(" 5. ������");
		System.out.println("**********");
	}

	public void insert() {
		Scanner scan = new Scanner(System.in);
		String name;
		String age;
		String number;
		String adress;

		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		age = scan.next();
		System.out.print("�ڵ��� �Է� : ");
		number = scan.next();
		System.out.print("�ּ� �Է� : ");
		adress = scan.next();

		if (count < ar.length) {
			ar[count] = new MemberDTO(name, age, number, adress);
			System.out.println((ar.length - count - 1) + "�ڸ� ���ҽ��ϴ�.");
			count++;
		} else {
			System.out.println("�ټ����� ������ �� á���ϴ�.");
		}
	}

	public void list() {
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for (int i = 0; i < count; i++) {
			if (ar[i] == null) {
				System.out.println("ȸ���� �����ϴ�.");
				break;
			}
			System.out.println(
					ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t" + ar[i].getAdress());
		}
	}

	public void update() {
		Scanner scan = new Scanner(System.in);
		String number;

		System.out.print("�ڵ��� ��ȣ �Է� : ");
		number = scan.next();
		for (MemberDTO dto : ar) {
			if (number.equals(dto.getNumber())) {
				System.out.println();
				System.out.print("���� �� �̸� �Է� : ");
				dto.setName(scan.next());
				System.out.print("���� �� �ڵ��� �Է� : ");
				dto.setNumber(scan.next());
				System.out.print("���� �� �ּ� �Է� : ");
				dto.setAdress(scan.next());
				System.out.println("1 row(s) updated");
				break;
			}

		}
		System.out.println("ã�� ȸ���� �����ϴ�.");

	}

	private void delete() {
		Scanner scan = new Scanner(System.in);
		String number;

		System.out.print("�ڵ��� ��ȣ �Է� : ");
		number = scan.next();
		for (MemberDTO dto : ar) {
			if (dto.getNumber().equals(number)) {

			}
		}
	}
}
/*
 * ar[i].setName(); ar[i].setAge(); ar[i].setNumber(); ar[i].setAdress();
 */

//
//for (MemberDTO dto : ar) {
//	for (int i = 0; i < ar.length; i++)
//		if (number.equals(ar[i].getNumber())) {
//			System.out.print(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t"
//					+ ar[i].getAdress());
//			System.out.println();
//			System.out.print("���� �� �̸� �Է� : ");
//			ar[i].setName(scan.next());
//			System.out.print("���� �� �ڵ��� �Է� : ");
//			ar[i].setNumber(scan.next());
//			System.out.print("���� �� �ּ� �Է� : ");
//			ar[i].setAdress(scan.next());
//			System.out.println("1 row(s) updated");
//			break;
//		} else {
//			System.out.println("ã�� ȸ���� �����ϴ�.");
//			break;