package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";

		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = "+ st.countTokens());
		
		while(st.hasMoreTokens()) {//토큰이 있다, 없다!
			System.out.println(st.nextToken());//토큰 꺼내고 다음으로 이동하먀
		}
		System.out.println();//
		String[] ar = str.split(",");//공백도 체크함
		for(String data : ar) {
			System.out.println(data);
		}
	}
	
	
}
