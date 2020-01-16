package practice1220;

public class Practice7_2 {
	public static void main(String[] args) {
		int dan, i, w;

		for (w = 2; w <= 8; w += 3) {

			for (i = 1; i <= 9; i++) {

				for (dan = w; dan <= w + 2; dan++) {
					if (dan != 10)
						System.out.print(dan + "*" + i + "=" + dan * i + "\t");
				} // 3´Ü
				System.out.println();
			} // 2´Ü
			System.out.println();
		} // 1´Ü
	}
}
