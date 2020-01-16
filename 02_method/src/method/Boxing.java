package method;

public class Boxing {
	public static void main(String[] args) {
		int a = 25;
		double b = (double) a / 3;// cast연산 - 형변환
		// 형변환은 같은 기본형만 된다.

		int c = 5;
		Integer d = c;// AutoBoxsing 기본형 -> 객체형
		//Integer d = new Integer(c); JDK 5.0 이전의 변환 방법
		
		Integer e = 5;
		int f = e;// unAutoBoxsing 객체형 -> 기본형
		//int f = e.intValue(); JDK 5.0 이전 의 변환 방법
		
		}
	
}
