package library_management_system;

import java.util.Scanner;

public class library_book_management_system {
	
	private static final int MAX_BOOKS =100; //max no of books can be hold in library
	
	private String[] bookTitles = new String[MAX_BOOKS];
	private String[] bookAuthors = new String[MAX_BOOKS];
	
	private int bookcount = 0;
	
	private Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		library_book_management_system library=new library_book_management_system();
		library.run();

	}
	public void run() {
		while(true) {
			System.out.println("Library management system ");
			System.out.println("1. Add anew book ");
			System.out.println("2. search for a book by title");
			System.out.println("3. Display all books");
			System.out.println("4. Remove book by usng title");
			System.out.println("5. Exit");
			System.out.println("Choose an option : ");
			 int choose=sc.nextInt();
			 sc.nextLine();
			 switch (choose) {
			 case 1:
				 addBook();
				 break;
			 case 2:
				 searchBook();
				 break;
			 case 3:
				 displayBooks();
				 break;
			 case 4:
				 removeBook();
				 break;
			 case 5:
				 System.out.println("existing system ");
				 return;
			 default :
				 System.out.println("invalid options plz check input values ");
				 
			 }
			 
		}
	}
	
	private void  addBook() {
		if (bookcount==MAX_BOOKS) {
			System.out.println("Library is full canont add more books.");
			return;
		}
		
		System.out.println("enter the book title :");
		String title=sc.nextLine();
		
		System.out.println("enter the book author :");
		String author=sc.nextLine();
		
		bookTitles[bookcount]=title;
		bookAuthors[bookcount]=author;
		bookcount++;
		
		System.out.println("Added Book successfully. ");
		
	}

	private void searchBook() {
		System.out.println("enter the book title to search:");
		String title=sc.nextLine();
		
		
		for(int i=0;i<bookcount;i++) {
			if(bookTitles[i].equalsIgnoreCase(title)) {
			System.out.println("Book Found:");
			System.out.println("title :"+bookTitles[i]);
			System.out.println("Author:"+bookAuthors[i]);
			return;
			
		}
	}
	
	System.out.println("Book  not Found:");
	
}

private void displayBooks() {
	if (bookcount==0) {
		System.out.println("no books in the library");
		return;
		}
	System.out.println("book in the library :");
	for (int i=0;i<bookcount;i++) {
		System.out.println((i+1)+".Title:"+bookTitles[i]+",Author:"+bookAuthors[i]);
		
	}
}
private void removeBook() {
	System.out.println("enter the book  title  to removie");
	String title=sc.nextLine();
	
	for(int i=0;i<bookcount;i++) {
	if(bookTitles[i].equalsIgnoreCase(title)) {
		
		for(int j=i;j<bookcount-1;j++) {
			bookTitles[j]=bookTitles[j+1];
			bookAuthors[j]=bookAuthors[j+1];
			
		}
		bookcount--;
		System.out.println("Book removed successfully.");
		return;
		
	}
}
System.out.println("Book not found.");
}
}