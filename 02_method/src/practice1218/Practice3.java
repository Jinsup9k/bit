package practice1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Practice3 p3 = new Practice3();

		// 초를 입력 받는다.
		System.out.print("초를 입력하시오 : ");
		int secondCheck = Integer.parseInt(bf.readLine());

		// 시간을 출력한다.
		String secondResult = p3.time(secondCheck);
		System.out.println(secondResult+ "입니다.");

	}

	public String time(int secondCheck) {
		
		int min = secondCheck / 60;
		int hour = min / 60;
		int sec = secondCheck % 60;
		min = min % 60;
		
		return (hour +"시"+min+"분"+sec+"초");
		

	}
}
