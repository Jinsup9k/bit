package practice;

import java.util.Scanner;

public class MemberMain {
	// 총 5명
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
			System.out.print(" 번호 : ");
			choice = scan.nextInt();
			if (choice == 1) {
				// 가입
				mm.insert();
			} else if (choice == 2) {
				// 출력
				mm.list();
			} else if (choice == 3) {
				// 수정
				mm.update();
			} else if (choice == 4) {
				// 탈퇴
				mm.delete();
			} else if (choice == 5) {
				// 끝내기
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		} // while
	}// main

	public void menu() {
		System.out.println("**********");
		System.out.println(" 1. 가입");
		System.out.println(" 2. 출력");
		System.out.println(" 3. 수정");
		System.out.println(" 4. 탈퇴");
		System.out.println(" 5. 끝내기");
		System.out.println("**********");
	}

	public void insert() {
		Scanner scan = new Scanner(System.in);
		String name;
		String age;
		String number;
		String adress;

		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("나이 입력 : ");
		age = scan.next();
		System.out.print("핸드폰 입력 : ");
		number = scan.next();
		System.out.print("주소 입력 : ");
		adress = scan.next();

		if (count < ar.length) {
			ar[count] = new MemberDTO(name, age, number, adress);
			System.out.println((ar.length - count - 1) + "자리 남았습니다.");
			count++;
		} else {
			System.out.println("다섯명의 정원이 꽉 찼습니다.");
		}
	}

	public void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for (int i = 0; i < count; i++) {
			if (ar[i] == null) {
				System.out.println("회원이 없습니다.");
				break;
			}
			System.out.println(
					ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getNumber() + "\t" + ar[i].getAdress());
		}
	}

	public void update() {
		Scanner scan = new Scanner(System.in);
		String number;

		System.out.print("핸드폰 번호 입력 : ");
		number = scan.next();
		for (MemberDTO dto : ar) {
			if (number.equals(dto.getNumber())) {
				System.out.println();
				System.out.print("수정 할 이름 입력 : ");
				dto.setName(scan.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				dto.setNumber(scan.next());
				System.out.print("수정 할 주소 입력 : ");
				dto.setAdress(scan.next());
				System.out.println("1 row(s) updated");
				break;
			}

		}
		System.out.println("찾는 회원이 없습니다.");

	}

	private void delete() {
		Scanner scan = new Scanner(System.in);
		String number;

		System.out.print("핸드폰 번호 입력 : ");
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
//			System.out.print("수정 할 이름 입력 : ");
//			ar[i].setName(scan.next());
//			System.out.print("수정 할 핸드폰 입력 : ");
//			ar[i].setNumber(scan.next());
//			System.out.print("수정 할 주소 입력 : ");
//			ar[i].setAdress(scan.next());
//			System.out.println("1 row(s) updated");
//			break;
//		} else {
//			System.out.println("찾는 회원이 없습니다.");
//			break;