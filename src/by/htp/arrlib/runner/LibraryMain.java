package by.htp.arrlib.runner;

public class LibraryMain {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		Book book = new Book();
		book.setYear(2000);
		library.addBook(book);
		
		Book book2 = new Book();
		book2.setYear(2001);
		library.addBook(book2);
		
		Book book3 = new Book(2002);
		library.addBook(book3);
		
		Book book4 = new Book(2003);
		library.addBook(book4);
		
		library.printBooks(2);
		
	}

}
