package practice1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//성적 관리 프로그램 2
public class Practice6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mid, end, rpt, chk;
		double midEndFin, rptFin, chkFin, tot;
		String grade, coment;

		System.out.print("중간고사를 입력하시오 : ");
		mid = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오 : ");
		end = Integer.parseInt(br.readLine());
		System.out.print("과제점수를 입력하시오 : ");
		rpt = Integer.parseInt(br.readLine());
		System.out.print("출석점수를 입력하시오 : ");
		chk = Integer.parseInt(br.readLine());

		// 성적 계산
		midEndFin = ((mid + end) / 2.00) * ((3.00 / 5));
		rptFin = (rpt) * ((1.00 / 5));
		chkFin = (chk) * ((1.00 / 5));
		tot = midEndFin + rptFin + chkFin;

		// 학점
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
		// 평가
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

		// 출력
		System.out.println("\n성적 = " + String.format("%.2f", tot));
		System.out.println("학점 = "+grade);
		System.out.println("평가 = "+coment);
	}
}
