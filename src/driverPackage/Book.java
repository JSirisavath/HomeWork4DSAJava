package driverPackage;

public class Book {
	private String  title;
	
	private int releaseYear;
	
	private boolean isNew;


	public Book(String title, boolean isNew, int releaseYear) {
		this.title = title;
		this.isNew = isNew;
		this.releaseYear = releaseYear;
	}
	
	
	
	public Book() {}


	// Getters and Setters

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}



	public boolean isNew() {
		return isNew;
	}



	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}



	@Override
	public String toString() {
		return title + "\t" + releaseYear + "\t" + isNew;
	}
	
}
