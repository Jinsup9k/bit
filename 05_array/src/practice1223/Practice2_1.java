package practice1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int dec;

		while (true) {
			System.out.print("10진수 입력 :");
			dec = Integer.parseInt(br.readLine());
			if (dec == 0)
				
				break;
			if (dec < 0)
				continue;
			int i;
			for (i = 0; dec != 0; i++) {
				binary[i] = dec % 2;
				dec = dec / 2;
			} // for

			for (int j = i - 1; j >= 0; j--) {
				System.out.print(binary[j]);
				if (j % 4 == 0)
					System.out.print(" ");
			}
			System.out.println();
		} // while
	}
}
//정규표현식
//if (inpuString.split("[!0-0]").length !=0) System.out.println("내용");