package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		Random r = new Random();
		System.out.println("���� = " + Math.random());
		System.out.println("���� = " + r.nextDouble());
		System.out.println("���� = " + r.nextInt());
		System.out.println("���� = " + r.nextInt(100));//0~99
		System.out.println("���� = " + (r.nextInt(100)+1));//1~100
		
	}

	// main
	public static void main(String[] args) {
		new RandomTest(); // 1ȸ��
	}
}
