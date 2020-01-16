package instance;

//조건연산자(삼항연산자)
public class CompTest {
	public static void main(String[] args) {
		int score = 10;
		int b = 80;
		
		String result = score >= 80 && score <= 100 ? "합격" : "불합격";
		System.out.println("결과 = " + result);
		
		result = score%2 == 0 ? "짝수": "홀수";
		System.out.println("결과 = " + result);
		
		result = score - b > 0 ? score+"" : b+"";// 뒤에 붙이면 String타입으로 변환
		System.out.println("큰 값 ="+ result);
	}
}
