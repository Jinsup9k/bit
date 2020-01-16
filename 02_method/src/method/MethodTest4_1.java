package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*이름과 주민등록번호를 입력하여 성별을 출력 하시오
 * 상별을 구별할때는 comp()메소드와 나이를 계산하는 calcAge()를 이용해 작성하시오 
 * [실행결과]
 * 이름 입력: 홍길동
 * 주민번호 입력 : 001023-1123456
 * 
 * 홍길동님은 남자이고 20살 입니다*/
public class MethodTest4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4_1 m = new MethodTest4_1();

		System.out.print("이름 입력 : ");
		String name = b.readLine();
		System.out.print("주민번호 입력 : ");
		String id = b.readLine();

		// 젠더
		String gender = m.comp(id);
		// 나이
		int age = m.calcAge(id);
		//출력
		System.out.println(name+"님은"+gender+"이고"+age+"입니다.");
	}

	private int calcAge(String id) {
		int year = Integer.parseInt(id.substring(0, 2));
		char g = id.charAt(7);
		year += (g=='1'|| g=='2'? 1900 : 2000);
		int age = 2019 - year +1;
		return age;
	}

	public String comp(String id) {
		return id.charAt(7) == '1' || id.charAt(7) == '3' ? "남자" : "여자";
	}
}
