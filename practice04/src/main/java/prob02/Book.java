package prob02;

import java.util.Iterator;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookNo, String title, String author) {
		
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public void rent(int num) {
		this.stateCode = num;
		
	}
	
	public void print(Book[] books) {
		for(int i = 0; i<books.length; i++) {
			
			if (books[i].stateCode == 0) {	
				String bin = "재고있음";
				System.out.println("책 제목:"+books[i].title+", 작가:"+books[i].author+", 대여 유무:"+"대여중");
			} else if (books[i].stateCode == 1) {
				System.out.println("책 제목:"+books[i].title+", 작가:"+books[i].author+", 대여 유무:"+"재고있음");
			}
			
			
		}
		System.out.println();
		
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
}