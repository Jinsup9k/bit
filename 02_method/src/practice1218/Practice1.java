package practice1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//정수값을 입력 받음
		System.out.print("10진수를  입력하세요 : ");
		int dec = Integer.parseInt(bf.readLine());
		
		//변환 후 출력
		System.out.println("2 진수 = "+Integer.toBinaryString(dec));
		System.out.println("8 진수 = "+Integer.toOctalString(dec));
		System.out.println("16 진수 = "+Integer.toHexString(dec));
		// Integer.to~~~String 함수를 이용하면 결과값을 String으로 만들어줌
	}
}
