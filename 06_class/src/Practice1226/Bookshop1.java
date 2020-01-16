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
		
		System.out.println("객체"+ b);
		b.setBookName("자바완성");
		b.setAuthor("김완성");
		b.setPrice(105000);
		
		BookShop2 bb = new BookShop2();
		
		System.out.println("객체"+ b);
		bb.setBookName("자바완성");
		bb.setAuthor("김완성");
		bb.setPrice(120000);
		
		System.out.println();

		System.out.println("책이름 : " + b.getBookName() + "\n저 자 : " + b.getAuthor() + "\n가 격 : " + b.getPrice() + "원");
		System.out.println();
		System.out.println("책이름 : " + bb.getBookName() + "\n저 자 : " + bb.getAuthor() + "\n가 격 : " + bb.getPrice() + "원");
	
	}
}
