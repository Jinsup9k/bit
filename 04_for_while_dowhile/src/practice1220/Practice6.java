package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ���� ���α׷� 2
public class Practice6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mid, end, rpt, chk;
		double midEndFin, rptFin, chkFin, tot;
		String grade, coment;

		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		mid = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		end = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է��Ͻÿ� : ");
		rpt = Integer.parseInt(br.readLine());
		System.out.print("�⼮������ �Է��Ͻÿ� : ");
		chk = Integer.parseInt(br.readLine());

		// ���� ���
		midEndFin = ((mid + end) / 2.00) * ((3.00 / 5));
		rptFin = (rpt) * ((1.00 / 5));
		chkFin = (chk) * ((1.00 / 5));
		tot = midEndFin + rptFin + chkFin;

		// ����
		switch ((int) tot / 10) {
		case 10:
		case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		case 6:
			grade = "D"; break;
		default:
			grade = "F";
		}
		// ��
		switch (grade) {
		case "A":
		case "B":
			coment = "excellent"; break;
		case "C":
		case "D":
			coment = "good"; break;
		default:
			coment = "poor";
		}

		// ���
		System.out.println("\n���� = " + String.format("%.2f", tot));
		System.out.println("���� = "+grade);
		System.out.println("�� = "+coment);
	}
}
