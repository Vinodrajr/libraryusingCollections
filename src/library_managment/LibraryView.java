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
				controller.createLibrary();
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
