package Practice1226;

class BookShop2 {
	private String bookName;
	private String author;
	private int price;
	public String getPrice;

	public void setBookName(String bookName) {
		System.out.println(this);
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class Bookshop1 {
	public static void main(String[] args) {
		
		BookShop2 b = new BookShop2();
		
		System.out.println("��ü"+ b);
		b.setBookName("�ڹٿϼ�");
		b.setAuthor("��ϼ�");
		b.setPrice(105000);
		
		BookShop2 bb = new BookShop2();
		
		System.out.println("��ü"+ b);
		bb.setBookName("�ڹٿϼ�");
		bb.setAuthor("��ϼ�");
		bb.setPrice(120000);
		
		System.out.println();

		System.out.println("å�̸� : " + b.getBookName() + "\n�� �� : " + b.getAuthor() + "\n�� �� : " + b.getPrice() + "��");
		System.out.println();
		System.out.println("å�̸� : " + bb.getBookName() + "\n�� �� : " + bb.getAuthor() + "\n�� �� : " + bb.getPrice() + "��");
	
	}
}
