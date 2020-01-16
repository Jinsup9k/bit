package constructor;

class VarArgs1 {

//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	public int sum(int a, int b, int c,int d) {
//		return a+b+c+d;
//	}

	public int sum(int... ar) {// 내부적으로 배열화 시켰다.
		int tot =0;
		for (int i = 0; i < ar.length; i++) {
			tot += ar[i];
		}

		return tot;

	}

}

public class VarArgs {
	public static void main(String[] args) {
		VarArgs1 va = new VarArgs1();
		System.out.println("합 = " + va.sum(10, 20));
		System.out.println("합 = " + va.sum(10, 20, 30));
		System.out.println("합 = " + va.sum(10, 20, 30, 40));
	}
}
