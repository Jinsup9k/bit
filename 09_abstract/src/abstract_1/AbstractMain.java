package abstract_1;

public class AbstractMain extends AbstractTest {
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
//		AbstractTest at = new AbstractTest(); 추상클래스는 new하지 못한다.
		AbstractTest at = new AbstractMain();
		at.setName("홍길동");
		System.out.println("이름 = " + at.getName());
	}
}
