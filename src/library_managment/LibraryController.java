package library_managment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryController {

	Scanner scanner = new Scanner(System.in);
	Library library = new Library();
	List<Book> list = new ArrayList<Book>();

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

		System.out.println("Library Created");
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

		list.add(book);
		library.setBooks(list);
		System.out.println("Book added sucessfully");

	}

	public void getAllBooks() {
		for (Book book : list) {
			System.out.println("The book name is  " + book.getName());
			System.out.println("The book's author is " + book.getAuthor());
			System.out.println("The book's price is " + book.getCost());
			System.out.println("========================================");

		}

	}

	public void deleteBook() {
		int i = 1;
		for (Book book : list) {
			System.out.println(i + " Name: " + book.getName() + " Book price: " + book.getCost());
			i++;
		}
		System.out.println("Enter the Id of the book to be deleted");
		int choice = scanner.nextInt();
		list.remove(choice - 1);
		System.out.println("Book Deleted Sucessfully");

	}

	public void updateBook() {
		int i = 1;
		for (Book book : list) {
			System.out.println(i + " Name: " + book.getName() + " Book price: " + book.getCost());
			i++; 
		}
		System.out.println("Enter the Id of the book to change the name");
		int choice = scanner.nextInt();
		Book book = list.get(choice - 1);
		System.out.println("Enter the name to be Updated");
		String bookname = scanner.next();
		book.setName(bookname);
		list.remove(choice - 1);
		list.add(book);
		System.out.println("Book is Updated");

	}

}
