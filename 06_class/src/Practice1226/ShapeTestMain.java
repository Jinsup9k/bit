package Practice1226;

public class ShapeTestMain {
	public static void main(String[] args) {
		ShapeTest s = new ShapeTest();

		System.out.println("¿øÀÇ ³ĞÀÌ : " + String.format("%.3f", s.area(3)));
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + s.area(5, 7));
		System.out.println("»ç´Ù¸®²ÃÀÇ ³ĞÀÌ : " + s.area(2, 3, 5));
	}
}
