package practice1223;

////문자 배열
public class Practice1 {
	public static void main(String[] args) {
		char[] ar = new char[50];
		int i, count = 0;
		int j = 0;
		// 난수 발생 문자 배열 50개에 난수 입력 후 출력
		for (i = 0; i < ar.length; i++) {
			count++;
			ar[i] = (char) ((Math.random() * 25 + 1) + 65);
			System.out.print(ar[i] + " ");
			if (count % 10 == 0)
				System.out.println();
		}
		count = 0;
			for (j = 65; j <= 90; j++) {
				for (i = 0; i < ar.length; i++) {
					if (((int) ar[i]) == j) {
						count++;
						continue;
					}
				}
				System.out.println((char) j + " : " + count);
			
		}
	}
}
