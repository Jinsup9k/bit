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
			System.out.println("   1. �Է�");
			System.out.println("   2. ���");
			System.out.println("   3. �˻�");
			System.out.println("   4. ����");
			System.out.println("   5. ����");
			System.out.println("   6. " + "��");
			System.out.println("*************");
			System.out.print("��ȣ : ");
			int choice = scan.nextInt();

			if (choice == 1) {// �Է�
				insertArticle();
			} else if (choice == 2) {// ���
				printArticle();
			} else if (choice == 3) {// �˻�
				searchArticle();
			} else if (choice == 4) {// ����
				deleteArticle();
			} else if (choice == 5) {// ����
				sortAticle();
			} else if (choice == 6) {// ��
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.(1~6)");
				continue;
			}
		} // while
	}// main

	private void sortAticle() {
		while (true) {
			System.out.println();
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. ���� �޴�");
			System.out.print("��ȣ : ");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.(1~3)");
			}

		}
	}// sort

	private void deleteArticle() {
		System.out.print("���� �� �̸� �Է� : ");
		String name = scan.next();
		int count = 0;

		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();

			if (dto.getName().equals(name)) {
				it.remove();// it.next()�� ��ȯ �� ���� �����
				count++;
			}
		}

		if (count == 0) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}// delete

	private void searchArticle() {
		System.out.print("�˻� �� �̸� �Է� : ");
		String name = scan.next();
		int count = 0;

		for (SungJukDTO dto : list) {
			if (dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}// search

	private void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for (SungJukDTO dto : list) {
			System.out.println(dto);
		}

	}// print

	private void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.print("��ȣ �Է� : ");
		dto.setNumber(scan.nextInt());
		System.out.print("�̸� �Է� : ");
		dto.setName(scan.next());
		System.out.print("���� �Է� : ");
		dto.setKor(scan.nextInt());
		System.out.print("���� �Է� : ");
		dto.setEng(scan.nextInt());
		System.out.print("���� �Է� : ");
		dto.setMath(scan.nextInt());

		dto.calc();
		list.add(dto);
		System.out.println("�Է� �Ϸ�");

	}// insert

}