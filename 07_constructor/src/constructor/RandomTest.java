package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		Random r = new Random();
		System.out.println("난수 = " + Math.random());
		System.out.println("난수 = " + r.nextDouble());
		System.out.println("난수 = " + r.nextInt());
		System.out.println("난수 = " + r.nextInt(100));//0~99
		System.out.println("난수 = " + (r.nextInt(100)+1));//1~100
		
	}

	// main
	public static void main(String[] args) {
		new RandomTest(); // 1회용
	}
}
