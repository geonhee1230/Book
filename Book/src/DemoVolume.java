import java.util.Scanner;

public class DemoVolume {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in the name of the Volume:");
		String VN = keyboard.nextLine();
		System.out.println("Enter in the number of books in the Volume:");
		int NOB = keyboard.nextInt();
		Book[] x = new Book[NOB];

		for (int i = 0; i < x.length; i++) {
			Scanner key = new Scanner(System.in);
			System.out.println("\n" + "Book number " + (i + 1) + "\n");
			System.out.println("Enter in the title of the book:");
			String title = key.nextLine();
			System.out.println("Enter in the author of the book:");
			String author = key.nextLine();
			System.out.println("Enter in the total pages of the book");
			int pages = keyboard.nextInt();

			x[i] = new Book(title, author, pages);
		}

		Volume volume1 = new Volume(VN, NOB, x);
		System.out.println(volume1);
		System.out.println(volume1.getBookArray());

	}

}
