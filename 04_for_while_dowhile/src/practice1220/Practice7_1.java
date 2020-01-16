package practice1220;

public class Practice7_1 {
	public static void main(String[] args) {

		for (int i = 2; i < 9 ; i += 3) {
			
			for (int j = 1; j < 10; j++) {
				
				for(int k = i; k< i+3; k++) {
					if (k == 10)break;
					System.out.print(k + "*"+ j+"="+j*k+"\t");
					
				}//3´Ü
				System.out.println();
			} // 2´Ü
			System.out.println();
		} // 1´Ü
	}
}
