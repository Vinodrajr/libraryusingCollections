package library_managment;

import java.util.List;

public class Library {
	
	private String name;
	private String adress;
	private long phone;
	private int pincode;
	private List<Book> books;
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", adress=" + adress + ", phone=" + phone + ", pincode=" + pincode + ", books="
				+ books + "]";
	}
	
	

}
