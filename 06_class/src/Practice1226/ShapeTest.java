package Practice1226;

public class ShapeTest {
	public static final double PI = 3.141592;

	public double area(int r) {
		return PI * r * r;
	}

	public double area(int r1, int r2) {
		return r1 * r2 / 2.0;
	}

	public double area(int r1, int r2, int r3) {
		return (r1 + r2) * (1 / 2.0) * r3;
	}
}
