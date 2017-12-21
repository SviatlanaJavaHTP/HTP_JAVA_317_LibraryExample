package by.htp.arrlib.runner;

public class MainApp {

	public static void main(String[] args) {

		int x = 5;
		x = x + 3;
		System.out.println(x);
		changeX(x);
		System.out.println(x);

		Book book = new Book();
		book.setYear(2000);

		System.out.println(book.getYear());
		changeBook(book);
		System.out.println(book.getYear());

		int[] y = new int[3];

		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);

		changeArr(y);

		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);

		Book[] books = new Book[3];
		changeArrBook(books);

		System.out.println(books[0].getYear());
		System.out.println(books[1].getYear());
		System.out.println(books[2].getYear());

		changeArrBookYears(books);

		System.out.println(books[0].getYear());
		System.out.println(books[1].getYear());
		System.out.println(books[2].getYear());

	}

	public static void changeArrBookYears(Book[] book) {
		book[0].setYear(2000);
		book[1].setYear(2001);
		book[2].setYear(2002);
	}

	public static void changeArrBook(Book[] book) {
		book[0] = new Book();
		book[1] = new Book();
		book[2] = new Book();
	}

	public static void changeArr(int[] y) {
		y[0] = 1;
		y[1] = 2;
		y[2] = 3;
	}

	public static void changeBook(Book book) {
		book.setYear(2005);
	}

	public static void changeX(int x) {
		x--;
	}
}
