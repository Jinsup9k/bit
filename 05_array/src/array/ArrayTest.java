package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		ar[0] = 25;
		ar[1] = 31;
		ar[2] = 45;
		ar[3] = 55;
		ar[4] = 60;
//		System.out.println("배열명 ar = " + ar);
//		System.out.println("배열명 ar = " + ar.toString());
//		System.out.println("배열 크기 = " + ar.length);
//
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println("ar[" + i + "]" + ar[i]);
//
//		}
		System.out.println();
		System.out.println("거꾸로 출력");
		for (int i = ar.length; i <= 0; i--) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}
		
//		for (int i = 0; i < ar.length; i++ ) {
//			if(ar[i]%2 == 1)
//			System.out.println("ar["+i +"]"+ ar[i] );
//		}
//		System.out.println();
//		
//		System.out.println("확장 for");
//		for(int data : ar) {// ar의 크기만큼 반복하면서 데이터를 꺼내준다.
//			System.out.println(data);
//		}
		System.out.println();
	}

}
