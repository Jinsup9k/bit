package class_1;

class Compute {
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSum() {
		return sum;
	}

	public int getSub() {
		return sub;
	}

	public int getMul() {
		return mul;
	}

	public double getDiv() {
		return div;
	}

	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;

	}
}
