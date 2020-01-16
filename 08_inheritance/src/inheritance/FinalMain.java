package inheritance;

class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;

	public static final String ANIMAL = "사자";
	public static final String ANIMAL2;// static 은 static 구역에서 초기화함

	static {
		ANIMAL2 = "기린";
	}

	public Final() {
		FRUIT2 = "딸기";
	}

}

//-------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		// AGE++; - error

		final int AGE2;
		AGE2 = 30;
		// AGE2 = 40; - error

		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);

		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);

	}
}
