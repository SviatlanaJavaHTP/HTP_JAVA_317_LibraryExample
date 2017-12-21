package by.htp.arrlib.runner;

public class Book {
	
	private int year;
	
	public Book(){
		System.out.println("Book constructor ()");
	}
	public Book(int year){
		System.out.println("Book constructor (int year)");
		this.year = year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

}
