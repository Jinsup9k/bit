package Practice1226;

public class BookShopMain {
	public static void main(String[] args) {

		BookShop b1 = new BookShop();
		b1.setBookName("�ڹٿϼ�");
		b1.setAuthor("��ϼ�");
		b1.setPrice(25000);

		BookShop b2 = new BookShop();
		b2.setBookName("JSP���");
		b2.setAuthor("��JP");
		b2.setPrice(35000);

		System.out.println("å�̸� : " + b1.getBookName() + "\n�� �� : " + b1.getAuthor() + "\n�� �� : " + b1.price + "��");
		System.out.println();
		System.out.println("å�̸� : " + b2.getBookName() + "\n�� �� : " + b2.getAuthor() + "\n�� �� : " + b2.price + "��");
	}
}
