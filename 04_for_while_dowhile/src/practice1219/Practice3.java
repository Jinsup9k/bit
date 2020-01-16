package practice1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//[약수 구하기]
public class Practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;

		System.out.print("숫자 입력 : ");
		int user = Integer.parseInt(br.readLine());

		for (i = 1; i <= user; i++) {
			if ((int) (user % i) == 0)
				System.out.print(i + " ");
			System.out.print("");

		}

	}
}
