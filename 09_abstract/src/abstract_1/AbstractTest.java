package abstract_1;

public abstract class AbstractTest  {// POJO (Plain Old Java Object)
	// 추상 메소드가 있으려면 반드시 추상 클래스여야 한다. 그 반대는 성립 하지 않는다.
	String name;

	public abstract void setName(String name); // 추상 메소드

	public String getName() {
		return name;
	}

}
