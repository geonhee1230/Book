public class Book {

	private String title, author;
	private int numberOfPages;

	@Override
	public String toString() {
		return "Book [ Title= " + title + ", Author = " + author
				+ ", Number Of Pages = " + numberOfPages + " ]";
	}

	public Book(String title, String author, int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public Book() {
		super();
	}

}
