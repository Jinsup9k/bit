package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ���� ���α׷�
public class Practice5 {
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
		if (tot >= 90) {
			grade = "A";
		} else if (tot <= 80) {
			grade = "B";
		} else if (tot <= 70) {
			grade = "C";
		} else if (tot <= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		// ��
		if (grade == "A" || grade == "B") {
			coment = "excellent";
		} else if (grade == "C" || grade == "D") {
			coment = "good";
		} else {
			coment = "poor";
		}
		// ���
		System.out.println("\n���� = " + String.format("%.2f", tot));
		System.out.println("���� = " + grade);
		System.out.println("�� = " + coment);
	}
}
