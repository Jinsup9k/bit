package thread;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance;

	public static SingleTon getInstance() {
		if (instance == null) {
			synchronized (SingleTon.class) {
				instance = new SingleTon();
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = " + aa);
		System.out.println("num = " + aa.num);
		System.out.println();

		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);
		System.out.println("num = " + bb.num);
		System.out.println();

		SingleTon cc = SingleTon.getInstance();
		SingleTon dd = SingleTon.getInstance();
		SingleTon ee = SingleTon.getInstance();

		cc.num++;
		System.out.println(cc.num);

		dd.num++;
		System.out.println(dd.num);

		ee.num++;
		System.out.println(ee.num);
	}
}
