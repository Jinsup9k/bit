package exam;

class HelloTest{
	public static void main(String[] args){
		System.out.println("안녕하세요.");
		System.out.print("반갑습니다.\n");
		System.out.println("사과"+"오렌지");
		System.out.println(25+36);
		System.out.println("25"+"36");
		System.out.println("25 + 36 = " +25+36);
		System.out.println("25 + 36 = " +(25+36));
		System.out.println("25 / 36 = " +(25/36));// 0으로 나온다.
		System.out.println("25 / 36 = " +(25.0/36));// 하나를 실수형으로 
		System.out.println("25 / 36 = " +(int)(25.0/36*10 + 0.5)/10.0);
		System.out.println("25 / 36 = " +String.format("%.1f",(25.0/36)));
		System.out.println("25 / 36 = " +(25.0/36));
		
		
	
	} 	
}

