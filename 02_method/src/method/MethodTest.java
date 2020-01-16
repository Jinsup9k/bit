package method;

/*메소드 : 명령어들의 집합 */
public class MethodTest {
	public static void main(String[] args) {
		int bigger = Math.max(23, 45);
		System.out.println("큰 값 : " + bigger);

		int smaller = Math.min(22323, 23222);
		System.out.println("\n작은 값 : " + smaller);

		double power = Math.pow(2., 5.);
		System.out.println("\n2의 5승은 " + (int) power + "이다.");

		// 난수 - 컴퓨터가 불규칙하게 발생시키는 수 , 0.0 <= 난수 < 1.0
		
		double r = Math.random() * 100;
		System.out.println("\n 난수 : " + (int) r);
		// 범위 조절 할때 원하는 범위 의 차 + 1
		// '0' = 48
		
		System.out.println('2'+ '5');
		System.out.println('2'-48+ '5'-48);
	
		System.out.println("2"+ "5.7");
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));
	
	}

}
