package for_while_dowhile;

//A~Z까지 무작위로 100개를 출력하시오
//[실행결과]
// A D G E W Q E R....
public class ForTest3_Random {
	public static void main(String[] args) {
		int num;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			num = (int) (Math.random() * 26 + 65);
			System.out.print((char) num + " ");
			
			if(num == 'A') count++;
			
			if(i%10 == 0) System.out.println();
	
		}
		System.out.println();
		System.out.println("A의 개수  = "+ count);
	}
}
