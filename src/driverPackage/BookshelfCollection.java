package driverPackage;

public class BookshelfCollection {
	private Book[] bookArray;
	private int numItems = 0; // This is to keep track of books being added to the array
	
	
	public BookshelfCollection(int sizeOfBookShelf) {
		// This will initialize the book shelf from the params
		bookArray = new Book[sizeOfBookShelf];

	}
	
	// Insert book taking account of sorting by release year
	public void insert(Book book) {
		
		int positionToInsert = numItems;
		
		// Iterate right to left
		for (int i = numItems - 1; i >= 0; i-- ) {
			// Checking if the new book is more recent than the first book on the right
			if(book.getReleaseYear() > bookArray[i].getReleaseYear()) {
				// Shift the book to right for that book
				bookArray[i+1] = bookArray[i];
				
				positionToInsert = i; // update position to insert
			} else {
				break; // stop shifting positions if new book is old
			}
		}
		
			bookArray[positionToInsert] = book; // Insert book in that position to insert
			
			numItems++; // update index of items
	}

	
	
	
	public void remove(Book book) {
		int indexRemove = -1;
		// finding book through the index of the array (position) and stop once it finds the same book to remove
		for (int i = 0 ; i < numItems; i++) {
			if (bookArray[i].equals(book)) {
				indexRemove = i;
				
				break; 
			}
		}
		
		// Shift the array and remove the book
		for (int i = indexRemove; i <numItems -1 ; i++) {
			bookArray[i] = bookArray[i+1];
		}
			
		bookArray[numItems - 1] = null; // set null on last position
		numItems--; // remove 1 from counter because of book removal
		System.out.print("Book Removed\n");
	}
	
	
	@Override
	public String toString() {
		// Create a custom string of all the books class and their details
		StringBuilder books = new StringBuilder();
		
//		books.append("CurrentBook List:\n");
		
		// iterating through each book using the numItems value into the string builder and adding a new line right after it
		for (int i = 0; i < numItems; i++ ) {
			books.append(bookArray[i].toString()).append("\n");
		}
		
		 return books.toString(); // Return the lists of books
	}
	
	
}
