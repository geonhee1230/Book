import java.util.Arrays;

public class Volume {
	private String volumeName;
	private int numberOfBooks;
	private Book[] a;

	public Volume(String volumeName, int numberOfBooks, Book[] a) {
		super();
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.a = a;
	}

	public Volume() {
		super();
	}

	@Override
	public String toString() {
		return "Volume [ Name of Volume = " + volumeName
				+ ", Number Of Books = " + numberOfBooks + "]\n";
	}

	public String getBookArray() {
		String x = "";
		for (int i = 0; i < a.length; i++) {
			x = x + (a[i].toString() + "\n");
		}
		return x;
	}

}
