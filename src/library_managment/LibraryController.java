package library_managment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryController {

	Scanner scanner = new Scanner(System.in);
	Library library = new Library();
	List<Book> books = new ArrayList<Book>();

	public void createLibrary() {
		System.out.println("Enter the Library name");
		String libname = scanner.next();
		System.out.println("Enter the Library address");
		String libaddress = scanner.next();
		System.out.println("enter the library phone number");
		long libphone = scanner.nextLong();
		System.out.println("Enter the pincode");
		int libpincode = scanner.nextInt();

		library.setAdress(libaddress);
		library.setName(libname);
		library.setPhone(libphone);
		library.setPincode(libpincode);

		System.out.println(library);
	}

	public void addBook() {
		System.out.println("Enter the Book name");
		String bookname = scanner.next();
		System.out.println("Enter the price ");
		int price = scanner.nextInt();
		System.out.println("Enter the author");
		String author = scanner.next();
		System.out.println("Enter the language");
		String language = scanner.next();
		System.out.println("Enter the title");
		String title = scanner.next();
		Book book = new Book();
		book.setName(bookname);
		book.setCost(price);
		book.setLanguage(language);
		book.setTitle(title);
		book.setAuthor(author);

		books.add(book);
		library.setBooks(books);
		System.out.println(library);

	}

}
