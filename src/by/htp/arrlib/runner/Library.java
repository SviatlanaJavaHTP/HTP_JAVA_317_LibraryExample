package by.htp.arrlib.runner;

public class Library {

	Book[] books = new Book[3];
	int bookCount = 0;

	public void addBook(Book book) {

		if (bookCount < books.length) {
			this.books[bookCount] = book;

		} else {
			Book[] oldBooks = books;
			books = new Book[books.length + 1];
			for (int i = 0; i < oldBooks.length; i++) {
				books[i] = oldBooks[i];
			}
			books[bookCount] = book;
		}
		bookCount++;
	}

	public void printBooks() {
		for (Book book : books) {
			System.out.println(book.getYear());
		}
	}
	
	public void printBooks(int startI) {
		for (int i = startI; i <books.length; i++) {
			System.out.println(books[i].getYear());
		}
	}

}
