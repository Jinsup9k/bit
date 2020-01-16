package Practice1230;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int count = 0;
		int index = 0;
		while (true) {
			System.out.print("문자열 입력 : ");
			// sb.append(scan.next().toLowerCase());
			String str = scan.next().toLowerCase();
			
			System.out.print("현재 문자열 입력 : ");
			String before = scan.next();

			System.out.print("바꿀 문자열 입력 : ");
			String after = scan.next();

			if (str.length() < before.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다.");
				return;
			}
//			for (int i = 0; i < sb.length(); i += before.length()) {
//				if (sb.indexOf(before) != -1) {
//					sb.replace(sb.indexOf(before), sb.indexOf(before) + before.length(), after);
//					count++;
//				}
//			}
			while ((index = str.indexOf(before, index)) != -1) {
				index += before.length();
				count++;
			} // while문 이용

			System.out.println(str.replace(before, after));
			System.out.println(count + "번 치환");

		}
	}

}
