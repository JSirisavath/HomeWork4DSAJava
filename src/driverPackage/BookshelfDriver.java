package driverPackage;

public class BookshelfDriver {

	public static void main(String[] args) {
	
		BookshelfCollection myLibrary = new BookshelfCollection(4); // Creates an array of 4 books because 2 example and 2 of choice
		
		
		// Create new books
		// Example books
		Book book1 = new Book("How to Catch a Dinosaur", true, 2019);
		
		Book book2 = new Book("I am Enough", true, 2018);
		
		myLibrary.insert(book1);
		myLibrary.insert(book2);
		
		
		// Choice of books to add
		Book book3 = new Book("The Great Gatsby", false, 1925);
		
		Book book4 = new Book("Hunger Games", false, 2008);
		
		
		myLibrary.insert(book3);
		myLibrary.insert(book4);
		
		
		
		myLibrary.remove(book4); // Remove book 4 (Hunger Games)
		
		Book newBookAddTest = new Book("To Kill a Mocking Bird", false, 1960); 
		
		
		myLibrary.insert(newBookAddTest); // Add a new book
		
		System.out.print(myLibrary.toString()); // Should maintain it's book list order
	}

}
