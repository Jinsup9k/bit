package Practice1226;

public class ShapeTestMain {
	public static void main(String[] args) {
		ShapeTest s = new ShapeTest();

		System.out.println("���� ���� : " + String.format("%.3f", s.area(3)));
		System.out.println("�ﰢ���� ���� : " + s.area(5, 7));
		System.out.println("��ٸ����� ���� : " + s.area(2, 3, 5));
	}
}
