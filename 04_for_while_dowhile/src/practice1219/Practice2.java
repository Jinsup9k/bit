package practice1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int squ = 1;
		
		System.out.print("x값 입력 : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y값 입력 : ");
		int y = Integer.parseInt(br.readLine());
		// 2 5 x * Y
		for (i = 1; i <= y; i++) {
			squ*=(x);
		}
		System.out.print(x + "의 " + y + "승 "+squ);
	}
}
