package practice1218;

public class Practice2 {
	public static void main(String[] args) {
		Practice2 p2 = new Practice2();
		//주사위값
		int first = (p2.input() + 1);
		int second = (p2.input() + 1);
		//합
		int sum = p2.add(first,second);
		System.out.println("첫번째 주사위 값 : " + first);
		System.out.println("두번째 주사위 값 : " + second);
		System.out.println("합은 "+ sum + "이다." );
	}

	public int input() {
		double r = Math.random() * 6;
		return (int) r;
	}
	public int add(int first, int second) {
		return first + second;
	}
}
