package array;

public class MultiArray2 {
	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int i, j;
		int num = 0;
		// �Է�
//		for (i = 0; i < ar.length; i++) {
//			for (j = 0; j < ar[i].length; j++) {
//				num++;
//				ar[i][j] = num;
//			}
//		}
		
		//�Է�
//		for (i = 0; i < ar.length; i++) {
//			for (j = 0; j < ar[i].length; j++) {
//				num++;
//				ar[j][i] = num;
//			}
//		}
		
		//�Է�
		for (i = ar.length -1; i >=0 ; i--) {
			for (j = ar[i].length-1; j >= 0 ; j--) {
				num++;
				ar[j][i] = num;
			}
		}
		
		//���
		for (i = 0; i < ar.length; i++) {
			for (j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}
}
