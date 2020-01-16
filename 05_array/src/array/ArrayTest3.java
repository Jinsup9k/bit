package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest3 a = new ArrayTest3();

		System.out.print("배열 크기 : ");
		int size = Integer.parseInt(a.br.readLine());
		int[] ar = new int[size];
		int sum = a.input(ar);
		int max = a.big(ar);
		int min = a.small(ar);
		a.output(ar, sum, max, min);
		
	}// main

	private void output(int[] ar, int sum, int max, int min) {
		for(int data : ar) {
			System.out.println(data+ "  ");
		}
		System.out.println();
		System.out.println("합 ="+sum);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}

	public int input(int[] ar) throws IOException {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] : ");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		} // for
		return sum;
	}// input

	public int big(int[] ar) {
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[0];
		}
		return max;
	}// big

	public int small(int[] ar) {
		int min = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min)
				min = ar[0];
		}
		return min;
	}
}