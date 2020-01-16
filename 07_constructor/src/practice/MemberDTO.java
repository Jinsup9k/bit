package practice;

public class MemberDTO {
	private String name;
	private String age;
	private String number;
	private String adress;

	public MemberDTO() {
		this("", "", "", "");
	}

	public MemberDTO(String name, String age, String number, String adress) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.adress = adress;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
