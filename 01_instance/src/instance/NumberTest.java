package instance;

//문제 : 320, 258 을 변수에 저장하여 합을 구하시오
// [실행결과]
//320 + 258 = xxx
//320 - 258 = xxx sub
//320 * 258 = xxx mul
//320 / 258 = 1.24....div
///변수명 a , b, sum
public class NumberTest {
	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		//String div = String.format("%.2f",(double)a/b);
		double div = (double) a / b;

		// short, char형의 합은 int형으로 된다
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
	}
}
