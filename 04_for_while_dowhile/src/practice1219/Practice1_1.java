package practice1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Math.random() * 3 + 1;
		int user;
		int com = (int)r;
		int sic = 1;
		int roc = 2;
		int pap = 3;

		// 가위바위보 게임 시작
		// user로부터 입력받고 컴퓨터에 컴퓨터와 내가 낸걸 출력한다.
		System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
		user = Integer.parseInt(br.readLine());
		System.out.println("컴퓨터 : "+com+"\t  나 : "+user);

		
	}
}
