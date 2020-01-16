package practice1220;

public class Practice7 {
	public static void main(String[] args) {
		int f, s, t = 0;

		for (f = 1 ; f <= 9; f+=3) {
			
			for (s = 1; s <= 9; s++) {

				for (t = 1; t <= 9; t++) {
				
					System.out.print(s+"*"+t+"="+s*t+"\t ");
				
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
	}
}
