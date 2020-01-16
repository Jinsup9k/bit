package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//이름, 국어, 영어, 수학을 입력 받아서 총점, 평균을 구하시오
//총점은 calcTot() 이용
//평균읜 calcAvg() 이용

public class MethodTest3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		MethodTest3 methodTest3 = new MethodTest3();
		
		System.out.println("==================");
		// 이름 입력
		System.out.println("이름을 입력하세요 : ");
		String name = bufferedReader.readLine();

		// 국어 입력
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = Integer.parseInt(bufferedReader.readLine());

		// 영어 입력
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = Integer.parseInt(bufferedReader.readLine());

		// 수학 입력
		System.out.println("수학 점수를 입력하세요 : ");
		int math = Integer.parseInt(bufferedReader.readLine());

		// 총점, 평균 계산
		int tot = methodTest3.calcTot(kor, eng, math);
		double avg = methodTest3.calcAvg(tot);
		System.out.println("==================");
		//결과물
		System.out.println("\t***** "+name+"성적표  ***** \t");
		System.out.println("-국어-\t-영어-\t-수학-\t-총점-\t-평균-");
		System.out.println("  "+kor+"\t  "+eng+"\t  "+math+"\t  "+tot+"\t"+String.format("%.2f", avg));
		
	
	}

	public int calcTot(int k, int e, int m) {
		return k + e + m;
	}
	public double calcAvg(int t) {
		final double SUBJECT = 3.0;
		return t/SUBJECT;		
	}

}
