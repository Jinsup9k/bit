package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3개읠 숫자 (a,b,c)를 입력 받아서 순서대로 출력하시오
 * 
 * [실행결과]
 * a값 입력:
 * b값 입력:
 * c값 입력:
 * 25  36  78*/
public class IfTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c값 입력 : ");
		int c = Integer.parseInt(br.readLine());

		if(a <= b && a <= c) {// a 가 가장 작을때
			if(b <= c) System.out.println(a+", "+b+", "+c);
			else System.out.println(a+", "+c+", "+b);
		}else if(b <= a && b <= c) {// b 가 가장 작을때
			if(a <= c) System.out.println(b+", "+a+", "+c);
			else System.out.println(b+", "+c+", "+a);
		}else {//c 가 가장 작을때
			if (a <= b)System.out.println(c+", "+a+", "+b);
			else System.out.println(c+","+b+","+a);
			
		}
		
			

	}
}
