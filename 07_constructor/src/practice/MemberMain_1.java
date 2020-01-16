package practice;

import java.util.Scanner;

public class MemberMain_1 {
	Scanner scan = new Scanner(System.in);
	MemberDTO_1 ar[] = new MemberDTO_1[5];

	public static void main(String[] args) {
		MemberMain_1 mm = new MemberMain_1();
		mm.menu();
		System.out.println("���α׷��� �����մϴ�.");

	}

	public void menu() {
		int choice = 0;
		MemberMain_1 mm = new MemberMain_1();

		while (true) {
			System.out.println("**********");
			System.out.println(" 1. ����");
			System.out.println(" 2. ���");
			System.out.println(" 3. ����");
			System.out.println(" 4. Ż��");
			System.out.println(" 5. ������");
			System.out.println("**********");
			System.out.print(" ��ȣ : ");
			choice = scan.nextInt();
			if (choice == 1) {
				mm.insert();
			} else if (choice == 2) {
				mm.list();
			} else if (choice == 3) {
				mm.update();
			} else if (choice == 4) {
				mm.delete();
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
			}
		}

	}

	public void insert() {
		String name;
		String age;
		String number;
		String address;
		int i;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				break;
		}

		if (i == ar.length) {
			System.out.println("5�� ������ �� á���ϴ�.");
			return;// �޼ҵ带 ���� ����
		}
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		age = scan.next();
		System.out.print("�ڵ��� �Է� : ");
		number = scan.next();
		System.out.print("�ּ� �Է� : ");
		address = scan.next();

		ar[i] = new MemberDTO_1(name, age, number, address);

		int count = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				count++;
		}
		System.out.println(count + "�ڸ� ���ҽ��ϴ�.");
	}

	public void list() {
		System.out.println("name\tAge\tNumber\tAddress");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println(
						ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t" + ar[i].getAddress());
			}
		}

	}

	public void update() {
		System.out.print("�ڵ��� �Է� : ");
		String number = scan.next();
		int i;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getNumber().equals(number)) {
				System.out.println(
						ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t" + ar[i].getAddress());

				System.out.print("���� �� �̸� �Է� : ");
				ar[i].setName(scan.next());
				System.out.print("���� �� �ڵ��� �Է� : ");
				ar[i].setNumber(scan.next());
				System.out.print("���� �� �ּ� �Է� : ");
				ar[i].setAddress(scan.next());

				System.out.println("1 row(s) updated");
				break;
			}
		}
		if (i == 5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}

	public void delete() {
		System.out.print("�ڵ��� �Է� : ");
		String number = scan.next();
		int i;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getNumber().equals(number)) {
				ar[i] = null;
				System.out.println("1 row(s) deleted");
				break;
			}
		}
		if (i == 5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}
}
