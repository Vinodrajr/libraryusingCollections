package library_managment;

import java.util.Scanner;

public class LibraryView {
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("1.Create a Library");
			System.out.println("2.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				controller.createLibrary();// creating the Lib

				boolean b1 = true;
				while (b1) {
					System.out.println("1. Add Book \n2.Get All books\n3.Delete Book\n4. Update Book");
					int bookchoice = sc.nextInt();
					switch (bookchoice) {
					case 1: {
						controller.addBook();
					}
						break;
					case 2: {

						controller.getAllBooks();
					}
						break;
					case 3: {
						controller.deleteBook();
					}
						break;
					case 4: {
						controller.updateBook();
					}
						break;
					default: {
						b1 = false;
					}
					}

				}
			}
				break;
			case 2: {
				b = false;
			}
				break;

			default: {
				System.out.println("Invaild input");
			}
			}

		}
		System.out.println("Thank you for using this application");

	}
}
