package practice;

public class MemberDTO_1 {
	private String name;
	private String age;
	private String number;
	private String address;
	
	public MemberDTO_1(String name, String age, String number, String adress) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}
	
	
}
