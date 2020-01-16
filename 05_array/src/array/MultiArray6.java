package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.jar.Attributes.Name;

public class MultiArray6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt, i, j, k;
		int subjectCnt = 0;
		String jumsu;
		String[] name;
		String[][] subject = null;

		// 입력
		// 인원수를 입력받는다.
		System.out.print("인원수 : ");
		cnt = Integer.parseInt(br.readLine());

		name = new String[cnt];

		// 이름입력
		for (i = 0; i < name.length; i++) {
			System.out.print("이름 입력 : ");
			name[i] = br.readLine();
			System.out.print("과목수 : ");
			subjectCnt = Integer.parseInt(br.readLine());

			k = 1;
			subject = new String[subjectCnt][k];

			// 과목명입력
			for (j = 0; j < subject.length; j++) {
				System.out.print("과목명 입력 : ");
				k = 0;
				subject[j][k] = br.readLine();

				if (j < subject.length)
					continue;
			} // 과목명끝

			for (j = 0; j < subject.length; j++) {
				System.out.print(subject[j][k] + " 점수 입력 : ");
				jumsu = br.readLine();
				subject[j][k] = jumsu;
			}
			System.out.println("--------------------");
		} // 이름끝
			// 출력
		for (i = 0; i < name.length; i++) {
			for(j = 0; j <= subjectCnt; j++) {
			System.out.print("이름"+name[i]+""+subject[j]);
			}
		}
	}
}
