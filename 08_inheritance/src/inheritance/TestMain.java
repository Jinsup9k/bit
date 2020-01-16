package inheritance;

class Test {
	int a, b;
}

//----main
public class TestMain {

	public static void main(String[] args) {
		Test aa= new Test();
		Test bb = aa; 
		aa.a = 2;
		aa.b = 5;
	}
}
