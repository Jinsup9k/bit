package practice1217;

public class Practice3 {
	public static void main(String[] args) {
		String name ="L";// char name = 'L';
		int basePay = 2500000;
		double tax = 0.033;
		
		System.out.println("*** "+name+"의 월급 ***");
		System.out.println("기본급 :"+basePay+"원");
		System.out.println("세금   :"+(int)(basePay*tax)+"원");
		System.out.println("월급   :"+(basePay-(int)(basePay*tax))+"원");
	}
}
