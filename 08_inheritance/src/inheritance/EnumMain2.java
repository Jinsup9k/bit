package inheritance;

enum EnumColor2 {
	RED("빨강"), GREEN("초록"), BLUE("파랑"), MAGENTA("보라");

	private String colorName;

	// public EnumColor2(String colorName) { - error private 는 가능..

	EnumColor2(String colorName) {//enum만을 위한 생성자
		this.colorName = colorName;
	}

	public String getColorName() {
		return colorName;
	}
}

public class EnumMain2 {

	public static void main(String[] args) {
		System.out.println(EnumColor2.RED);
		System.out.println();

		for (EnumColor2 data : EnumColor2.values()) {
			System.out.println(	data + "\t"+
								data.ordinal() + "\t"+ 
								data.valueOf(data + "") + "\t" + 
								data.getColorName());
		}
	}
}
