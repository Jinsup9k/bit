package practice0108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	Scanner scan = new Scanner(System.in);
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	SungJukDTO dto;

	public void menu() {
		while (true) {
			System.out.println("*************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 검색");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. " + "끝");
			System.out.println("*************");
			System.out.print("번호 : ");
			int choice = scan.nextInt();

			if (choice == 1) {// 입력
				insertArticle();
			} else if (choice == 2) {// 출력
				printArticle();
			} else if (choice == 3) {// 검색
				searchArticle();
			} else if (choice == 4) {// 삭제
				deleteArticle();
			} else if (choice == 5) {// 정렬
				sortAticle();
			} else if (choice == 6) {// 끝
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.(1~6)");
				continue;
			}
		} // while
	}// main

	private void sortAticle() {
		while (true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전 메뉴");
			System.out.print("번호 : ");
			int choice = scan.nextInt();
			if (choice == 3) {
				break;
			} else if (choice == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}

				};
				printArticle();
			} else if (choice == 2) {
				Collections.sort(list);
				printArticle();
			} else {
				System.out.println("잘못 입력하셨습니다.(1~3)");
			}

		}
	}// sort

	private void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		int count = 0;

		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();

			if (dto.getName().equals(name)) {
				it.remove();// it.next()가 반환 한 값을 지운다
				count++;
			}
		}

		if (count == 0) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}// delete

	private void searchArticle() {
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.next();
		int count = 0;

		for (SungJukDTO dto : list) {
			if (dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}// search

	private void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (SungJukDTO dto : list) {
			System.out.println(dto);
		}

	}// print

	private void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.print("번호 입력 : ");
		dto.setNumber(scan.nextInt());
		System.out.print("이름 입력 : ");
		dto.setName(scan.next());
		System.out.print("국어 입력 : ");
		dto.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		dto.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		dto.setMath(scan.nextInt());

		dto.calc();
		list.add(dto);
		System.out.println("입력 완료");

	}// insert

}
