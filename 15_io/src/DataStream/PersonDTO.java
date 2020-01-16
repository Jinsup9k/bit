package DataStream;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PersonDTO implements Serializable {// 추상 메소드가 없다 -직렬화
	private String name;
	private int age;
	private double height;

	public PersonDTO(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

}
