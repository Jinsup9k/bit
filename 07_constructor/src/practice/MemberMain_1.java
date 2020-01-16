package practice;

import java.util.Scanner;

public class MemberMain_1 {
	Scanner scan = new Scanner(System.in);
	MemberDTO_1 ar[] = new MemberDTO_1[5];

	public static void main(String[] args) {
		MemberMain_1 mm = new MemberMain_1();
		mm.menu();
		System.out.println("프로그램을 종료합니다.");

	}

	public void menu() {
		int choice = 0;
		MemberMain_1 mm = new MemberMain_1();

		while (true) {
			System.out.println("**********");
			System.out.println(" 1. 가입");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 수정");
			System.out.println(" 4. 탈퇴");
			System.out.println(" 5. 끝내기");
			System.out.println("**********");
			System.out.print(" 번호 : ");
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
				System.out.println("잘못 선택하셨습니다.");
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
			System.out.println("5명 전원이 꽉 찼습니다.");
			return;// 메소드를 벗어 나라
		}
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("나이 입력 : ");
		age = scan.next();
		System.out.print("핸드폰 입력 : ");
		number = scan.next();
		System.out.print("주소 입력 : ");
		address = scan.next();

		ar[i] = new MemberDTO_1(name, age, number, address);

		int count = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				count++;
		}
		System.out.println(count + "자리 남았습니다.");
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
		System.out.print("핸드폰 입력 : ");
		String number = scan.next();
		int i;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getNumber().equals(number)) {
				System.out.println(
						ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t" + ar[i].getAddress());

				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setNumber(scan.next());
				System.out.print("수정 할 주소 입력 : ");
				ar[i].setAddress(scan.next());

				System.out.println("1 row(s) updated");
				break;
			}
		}
		if (i == 5) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}

	public void delete() {
		System.out.print("핸드폰 입력 : ");
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
			System.out.println("찾는 회원이 없습니다.");
		}
	}
}
