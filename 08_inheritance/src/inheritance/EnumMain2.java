package inheritance;

enum EnumColor2 {
	RED("����"), GREEN("�ʷ�"), BLUE("�Ķ�"), MAGENTA("����");

	private String colorName;

	// public EnumColor2(String colorName) { - error private �� ����..

	EnumColor2(String colorName) {//enum���� ���� ������
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
