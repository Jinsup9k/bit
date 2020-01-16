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
public class MethodTest4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 m4 = new MethodTest4();

		// 입력창
		System.out.print("이름 입력 : ");
		String name = bf.readLine();
		System.out.print("주민번호 입력(000000-0000000) : ");
		String id = bf.readLine();

		// 성별
		String gender = m4.gen(id.charAt(7)) ? "남자" : "여자";

		// 나이
		int age = m4.calcAge(id); 
		
		// 최종 출력
		System.out.printf(name+"님은 "+gender+"이고 "+age+"살 입니다.");
	}

	public boolean gen(char id) {// 성별 구별 1:49
		return id % 2 != 0 ? true : false;
	}
	public int calcAge(String id) {
		//주민번호 맨 앞자리를 계산할 수 있게 int로 바꿔준다
		int num = Integer.parseInt(id.substring(0, 2));
		//받은 두 숫자가 20보다 크거나 같으면 1900년대생 작으면 2000년대생 세대에 따라 계산식을 적용
		//조건:1900년생을 뽑겠다
		int age = num >= 20 && num < 100 ? 2019-(1900+num)+1:2019-(2000+num)+1; 
		
		return age;
	}
}
