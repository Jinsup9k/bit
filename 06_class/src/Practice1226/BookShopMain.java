package Practice1226;

public class BookShopMain {
	public static void main(String[] args) {

		BookShop b1 = new BookShop();
		b1.setBookName("자바완성");
		b1.setAuthor("김완성");
		b1.setPrice(25000);

		BookShop b2 = new BookShop();
		b2.setBookName("JSP잡기");
		b2.setAuthor("송JP");
		b2.setPrice(35000);

		System.out.println("책이름 : " + b1.getBookName() + "\n저 자 : " + b1.getAuthor() + "\n가 격 : " + b1.price + "원");
		System.out.println();
		System.out.println("책이름 : " + b2.getBookName() + "\n저 자 : " + b2.getAuthor() + "\n가 격 : " + b2.price + "원");
	}
}
