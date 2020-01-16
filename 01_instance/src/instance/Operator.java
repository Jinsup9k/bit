package instance;

//증감연산자 , 대입연산자
public class Operator {
	public static void main(String[] args) {
		int a = 5;

		a += 2;// a = a + 2;
		a *= 3;// a = a * 3;

		System.out.println("a = " + ++a);

		int b = a++;
		System.out.println("a = " + a + "\t b = " + b);

		int c = ++a - b--;
		System.out.println("a = " + a + "\t b = " + b + "\t c = " + c);

		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
	}
}
