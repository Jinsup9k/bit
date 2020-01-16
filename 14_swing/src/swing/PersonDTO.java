package swing;

public class PersonDTO {
	private String id, name, password, tel;

	public PersonDTO(String id, String name, String email, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.password = email;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getTel() {
		return tel;
	}

}
