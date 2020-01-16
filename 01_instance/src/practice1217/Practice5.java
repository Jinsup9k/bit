package practice1217;

public class Practice5 {
	public static void main(String[] args) {
		int score = 25;
		String result = score % 2 == 0 && score % 3 == 0 ? "2와 3의 공배수이다." : "2와 3의 공배수가 아니다.";
		System.out.println(score + "은/는 " + result);

	}
}
