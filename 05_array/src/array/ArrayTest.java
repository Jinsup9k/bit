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
//		System.out.println("�迭�� ar = " + ar);
//		System.out.println("�迭�� ar = " + ar.toString());
//		System.out.println("�迭 ũ�� = " + ar.length);
//
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println("ar[" + i + "]" + ar[i]);
//
//		}
		System.out.println();
		System.out.println("�Ųٷ� ���");
		for (int i = ar.length; i <= 0; i--) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}
		
//		for (int i = 0; i < ar.length; i++ ) {
//			if(ar[i]%2 == 1)
//			System.out.println("ar["+i +"]"+ ar[i] );
//		}
//		System.out.println();
//		
//		System.out.println("Ȯ�� for");
//		for(int data : ar) {// ar�� ũ�⸸ŭ �ݺ��ϸ鼭 �����͸� �����ش�.
//			System.out.println(data);
//		}
		System.out.println();
	}

}
