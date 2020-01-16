package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입출력 스트림
//BufferedReader,Scanner 
public class InputTest {
// 키보드를 통해서 들어오는 데이터 타입은 InputStream 이다
	public static void main(String[] args) throws IOException {
		// BufferedReader를 이용한 입력과 형변환해서 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열을 입력하세요 : ");
		String str = br.readLine();
		System.out.println(str);

		System.out.print("정수를 입력하세요 : ");
		int i = Integer.parseInt(br.readLine());
		System.out.println(i);

		System.out.print("실수를 입력하세요 : ");
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);

	}
}

//Exception (예외 처리)
//BufferedReader를 이용할땐 대게  throws IOException을 통하여 작업한다.
//try & catch 를 활용하여 예외처리를 하기도하지만()